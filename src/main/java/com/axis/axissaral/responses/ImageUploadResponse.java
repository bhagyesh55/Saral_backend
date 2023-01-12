package com.axis.axissaral.responses;

public class ImageUploadResponse {
    private String message;

    public ImageUploadResponse(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
