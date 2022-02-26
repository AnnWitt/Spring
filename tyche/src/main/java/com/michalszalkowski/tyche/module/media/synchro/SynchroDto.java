package com.michalszalkowski.tyche.module.media.synchro;

public class SynchroDto {

    private String status="OK";

    public String getStatus() {
        return status;
    }

    public SynchroDto setStatus(String status) {
        this.status = status;
        return this;
    }

}
