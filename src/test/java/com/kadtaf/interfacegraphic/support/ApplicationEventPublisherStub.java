package com.kadtaf.interfacegraphic.support;

import com.kadtaf.interfacegraphic.event.NotificationEvent;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationEventPublisher;



public class ApplicationEventPublisherStub implements ApplicationEventPublisher {

    private String notificationMessage;

    public String getNotificationMessage() {
        return notificationMessage;
    }


    @Override
    public void publishEvent(ApplicationEvent event) {
        if (event instanceof NotificationEvent) {
            notificationMessage = ((NotificationEvent) event).getMessage();
        }
    }


    @Override
    public void publishEvent(Object event) {
        // Si vous avez un événement générique, vous pouvez le publier ici
        if (event instanceof String message) {
            // Supposons que vous vouliez publier une chaîne simple comme événement
            System.out.println("Événement générique publié : " + message);
        }
    }
}

