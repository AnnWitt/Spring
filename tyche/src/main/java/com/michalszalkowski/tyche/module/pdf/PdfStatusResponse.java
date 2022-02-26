package com.michalszalkowski.tyche.module.pdf;

public class PdfStatusResponse {
    private String fileName;

    public String getFileName() {
        return fileName;
    }

    public PdfStatusResponse setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
}