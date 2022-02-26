package com.michalszalkowski.tyche.module.media.storage;

import com.michalszalkowski.tyche.module.media.repository.MediaEntity;
import com.michalszalkowski.tyche.module.media.repository.MediaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;


import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class FileSystemStorage {


    private static final Logger LOGGER = LoggerFactory.getLogger(FileSystemStorage.class);

    @Autowired
    private MediaRepository mediaRepository;

    @Value("${mediaRootLocation}")
    private String path;

    public void store(MultipartFile file) {



        LOGGER.info("File{} uploaded",file.getOriginalFilename());

        try {
            Path destinationFile = Paths.get(path)
                    .resolve(Paths.get(file.getOriginalFilename()))
                    .normalize()
                    .toAbsolutePath();
            try (InputStream inputStream = file.getInputStream()) {
                Files.copy(inputStream, destinationFile, StandardCopyOption.REPLACE_EXISTING);
            }

            mediaRepository.saveAndFlush(
                    new MediaEntity((file.getOriginalFilename()))
            );

        } catch (IOException e){
            throw new StorageException("Failed to store file.",e);
        }
    }

    public List<MediaEntity> list(){
        return mediaRepository.findAll();
    }

}
