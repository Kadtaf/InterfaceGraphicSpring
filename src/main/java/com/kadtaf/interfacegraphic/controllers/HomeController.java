package com.kadtaf.interfacegraphic.controllers;


import com.kadtaf.interfacegraphic.modele.Contact;
import com.kadtaf.interfacegraphic.modele.User;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

@RestController
public class HomeController {

    ConcurrentMap<String, User> users = new ConcurrentHashMap<>();

    @GetMapping("/")
    public String accueil(Model model) {
        model.addAttribute("message", "Bonjour, c'est une interface graphique");
        return "accueil";
    }

    @GetMapping("/list")
    public List<User> getAllUsers() {
        return new ArrayList<User>(users.values());

    }

    @PostMapping("/traiter-formulaire")
    public String traiterFormulaire(@RequestParam String nom,
                                    @RequestParam String email,
                                    Model model) {
    // Traiter les données du formulaire ici (par exemple, les enregistrer en base de données)
    // Nous les ajoutons simplement au modèle pour les afficher dans une page de confirmation
        model.addAttribute("nom", nom);
        model.addAttribute("email", email);
        return "confirmation";
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable String id) {
        return users.get(id);

    }

    @PostMapping("/")
    public User addUser(@RequestBody User user) {
        users.put(user.getName(), user);
        return user;

    }
}
