package com.kadtaf.interfacegraphic.modele;

import java.util.Scanner;

public class CalculatriceConsole {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur d'entrer le premier nombre
        System.out.print("Entrez le premier nombre : ");
        double num1 = scanner.nextDouble();

        // Demander à l'utilisateur d'entrer le deuxième nombre
        System.out.print("Entrez le deuxième nombre : ");
        double num2 = scanner.nextDouble();

        // Demander à l'utilisateur d'entrer l'opération
        System.out.print("Choisissez une opération (+, -, *, /) : ");
        char operation = scanner.next().charAt(0);

        // Effectuer l'opération
        double resultat = 0;
        switch (operation) {
            case '+':
                resultat = num1 + num2;
                break;
            case '-':
                resultat = num1 - num2;
                break;
            case '*':
                resultat = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    resultat = num1 / num2;
                } else {
                    System.out.println("Division par zéro impossible");
                    return;
                }
                break;
            default:
                System.out.println("Opération non reconnue");
                return;
        }

        // Afficher le résultat
        System.out.println("Résultat : " + resultat);

        // Fermer le scanner
        scanner.close();
    }
}
