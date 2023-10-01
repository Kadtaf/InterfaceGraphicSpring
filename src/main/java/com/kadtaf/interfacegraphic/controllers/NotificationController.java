package com.kadtaf.interfacegraphic.controllers;

import com.kadtaf.interfacegraphic.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotificationController {

    private final NotificationService notificationService;

    @Autowired
    public NotificationController(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @GetMapping("/notification")
    public String notification(Model model) {
        model.addAttribute("message", "Bonjour, c'est l'implémentation des listeners");
        return "notification";
    }

    @PostMapping("/envoyer-notification")
    public String envoyerNotificationPost(@RequestParam String message, Model model) {
        notificationService.envoyerNotification(message);
        model.addAttribute("message", message);
        return "notificationConfirm";
    }

}


