package com.kadtaf.interfacegraphic.supportTest;

import com.kadtaf.interfacegraphic.support.ApplicationEventPublisherStub;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ApplicationEventPublisherStubTest {

    @Test
    public void testPublishEventWithString() {
        // Arrange
        ApplicationEventPublisherStub eventPublisherStub = new ApplicationEventPublisherStub();

        // Act
        eventPublisherStub.publishEvent("Hello World!");

        // Assert
        assertEquals("Hello World!", eventPublisherStub.getNotificationMessage());
    }
}
