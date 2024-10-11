package TP0.EX5;

import java.time.LocalDate;

public class Personne implements IPersonne {
    private String nom;
    private String prenom;
    private LocalDate dateNaissance;

    public Personne(String nom, String prenom, LocalDate dateNaissance) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
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
}
