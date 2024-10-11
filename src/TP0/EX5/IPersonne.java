package TP0.EX5;

import java.time.LocalDate;

public interface IPersonne {
    int calculerAge();
    LocalDate getDateNaissance();
    void setDateNaissance(LocalDate d);
    String getNom();
    void setNom(String nom);
    String getPrenom();
    void setPrenom(String prenom);
}
