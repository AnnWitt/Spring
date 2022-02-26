package com.michalszalkowski.tyche.module.media.repository;
import com.michalszalkowski.tyche.module.media.repository.MediaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface MediaRepository
        extends JpaRepository<MediaEntity, Long>,
        JpaSpecificationExecutor<MediaEntity> {
    MediaEntity findOneByUuid(String uuid);
}