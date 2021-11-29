package com.bs23.model;


/**
 * @author Khairul Islam Azam
 * @since 1.0.0
 */

public class PushNotificationResponse {
    private int status;
    private String message;


    public PushNotificationResponse() {
    }

    public PushNotificationResponse(int status, String message) {
        this.status = status;
        this.message = message;
    }
    public int getStatus() {
        return status;
    }
    public void setStatus(int status) {
        this.status = status;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }

}
