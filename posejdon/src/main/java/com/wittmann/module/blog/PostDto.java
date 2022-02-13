package com.wittmann.module.blog;

import java.util.UUID;

    public class PostDto {
        private String uuid;
        private String title;
        private String text;

        public PostDto(String uuid, String title, String text) {
            this.uuid = uuid;
            this.title = title;
            this.text = text;
        }
        public PostDto(String title, String text) {
            this.uuid = UUID.randomUUID().toString();
            this.title = title;
            this.text = text;
        }
//uuid identyfikatory uuid.generator.net/version4, po stronie uuid nie uzywamy idikow typo 1,2,3 tylko takie długie
        //https://www.uuidgenerator.net/version4
        public String getUuid() {
            return uuid;
        }
        public String getTitle() {
            return title;
        }
        public String getText() {
            return text;
        }
    }


