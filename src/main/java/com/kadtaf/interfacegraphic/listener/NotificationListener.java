package com.kadtaf.interfacegraphic.listener;

import com.kadtaf.interfacegraphic.event.NotificationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class NotificationListener implements ApplicationListener<NotificationEvent> {

    @Override
    public void onApplicationEvent(NotificationEvent event) {
        // Code à exécuter lorsque l'événement est déclenché
        System.out.println("Notification reçue: " + event.postMessage());
        // On pourrait envisager d'envoyer la notification à d'autres systèmes ici
    }
}
