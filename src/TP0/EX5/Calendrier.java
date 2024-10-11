package TP0.EX5;

import java.time.LocalDate;

public class Calendrier {
    // Méthode pour ajouter une personne et vérifier si c'est son anniversaire
    public void add(IPersonne personne) {
        String nom = personne.getNom();
        LocalDate dateNaissance = personne.getDateNaissance();
        int age = personne.calculerAge();

        // Vérifier si aujourd'hui est l'anniversaire
        LocalDate today = LocalDate.now();
        if (today.getDayOfMonth() == dateNaissance.getDayOfMonth() &&
                today.getMonth() == dateNaissance.getMonth()) {
            envoyerMessageAnniversaire(nom, age);
        } else {
            System.out.println("Aujourd'hui n'est pas l'anniversaire de " + nom);
        }
    }

    // Méthode privée pour envoyer un message d'anniversaire
    private void envoyerMessageAnniversaire(String nom, int age) {
        String message = "Joyeux anniversaire " + nom + "! Vous avez maintenant " + age + " ans.";
        System.out.println(message);

        // Appel aux méthodes d'envoi
        envoyerEmail(nom, message);
        envoyerSMS(nom, message);
    }

    // Méthode pour envoyer un email
    private void envoyerEmail(String nom, String message) {
        System.out.println("Envoi d'email à " + nom + " : " + message);
    }

    // Méthode pour envoyer un SMS
    private void envoyerSMS(String nom, String message) {
        System.out.println("Envoi de SMS à " + nom + " : " + message);
    }
}
