package com.kadtaf.interfacegraphic.service;

import com.kadtaf.interfacegraphic.event.NotificationEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {

    private final ApplicationEventPublisher eventPublisher;

    @Autowired
    public NotificationService(ApplicationEventPublisher eventPublisher) {
        this.eventPublisher = eventPublisher;
    }

    public void envoyerNotification(String message) {
        // Code logique de votre service...

        // Publier l'événement
        eventPublisher.publishEvent(new NotificationEvent(this, message));
    }
}

