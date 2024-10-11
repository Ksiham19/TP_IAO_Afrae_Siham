package TP0.EX5;

import java.time.LocalDate;
import java.util.List;

public interface IAmiFacebook {
    int calculerAge();
    LocalDate getDateNaissance();
    void setDateNaissance(LocalDate d);
    String getPseudo();
    void setPseudo(String s);
    void envoyerMessage(String msg, List<String> lesDestinataires);
}
