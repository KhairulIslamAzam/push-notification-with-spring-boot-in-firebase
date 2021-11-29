package com.bs23.service;

import com.bs23.model.PushNotificationRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/**
 * @author Khairul Islam Azam
 * @since 1.0.0
 */
@Service
public class PushNotificationService {

    @Autowired
    FCMService fcmService;

//    private String token="eLs0WItVXAERsHw2:APA91bFxeQ0-BPVWb6IX905s8ZacvVR6x1DYlp3-ikfitZwGMONyYT7mBMDBLRB07kbdWIzXCm";

    @Scheduled(cron="0 0/2 * 1/1 * ?")
    public void sendPushNotificationWithData(PushNotificationRequest pushNotificationRequest) {

//        pushNotificationRequest.setToken(token);
        Map<String, String> appData= new HashMap<>();
        appData.put("name", "PushNotification");
        try {
            fcmService.sendMessage(appData, pushNotificationRequest);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }

}