package com.michalszalkowski.tyche.module.media;

import com.michalszalkowski.tyche.module.media.synchro.RandomJokeLookupService;
import com.michalszalkowski.tyche.module.media.synchro.SynchroDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SynchroRestController {

    @Autowired
    private RandomJokeLookupService randomJokeLookupService;

    @GetMapping("/api/synchro")
    public SynchroDto synchronize() {

        randomJokeLookupService.getRandomJoke("A1",5000L);
        randomJokeLookupService.getRandomJoke("A2",4000L);
        randomJokeLookupService.getRandomJoke("A3",1000L);
        randomJokeLookupService.getRandomJoke("A4",500L);

        return new SynchroDto();
    }

}
