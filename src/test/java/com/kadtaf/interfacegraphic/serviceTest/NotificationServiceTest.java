package com.kadtaf.interfacegraphic.serviceTest;

import static org.junit.jupiter.api.Assertions.assertEquals;


import com.kadtaf.interfacegraphic.service.NotificationService;
import com.kadtaf.interfacegraphic.support.ApplicationEventPublisherStub;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class NotificationServiceTest {

    @Test
    public void testEnvoyerNotification() {
        // Arrange
        ApplicationEventPublisherStub eventPublisher = new ApplicationEventPublisherStub();
        NotificationService notificationService = new NotificationService(eventPublisher);

        // Act
        notificationService.envoyerNotification("Test Message");

        // Assert
        assertEquals("Test Message", eventPublisher.getNotificationMessage());
    }

    // Une classe stub pour ApplicationEventPublisher pour capturer l'événement publié

}

