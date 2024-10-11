package TP0.EX5;

import java.time.LocalDate;
import java.util.List;

public class AmiFacebook implements IAmiFacebook, IPersonne {
    private String nom;
    private String prenom;
    private LocalDate dateNaissance;
    private String pseudo;

    public AmiFacebook(String nom, String prenom, LocalDate dateNaissance, String pseudo) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.pseudo = pseudo;
    }

    @Override
    public int calculerAge() {
        return LocalDate.now().getYear() - dateNaissance.getYear();
    }

    @Override
    public LocalDate getDateNaissance() {
        return dateNaissance;
    }

    @Override
    public void setDateNaissance(LocalDate d) {
        this.dateNaissance = d;
    }

    @Override
    public String getNom() {
        return nom;
    }

    @Override
    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String getPrenom() {
        return prenom;
    }

    @Override
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @Override
    public String getPseudo() {
        return pseudo;
    }

    @Override
    public void setPseudo(String s) {
        this.pseudo = s;
    }

    @Override
    public void envoyerMessage(String msg, List<String> lesDestinataires) {
        for (String dest : lesDestinataires) {
            System.out.println("Envoi de message à " + dest + ": " + msg);
        }
    }
}
