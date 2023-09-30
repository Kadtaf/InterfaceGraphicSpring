package com.kadtaf.interfacegraphic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @GetMapping("/")
    public String accueil(Model model) {
        model.addAttribute("message", "Bonjour, c'est une interface graphique");
        return "accueil";
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
}
