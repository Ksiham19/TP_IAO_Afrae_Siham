package TP0.EX5;

import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Calendrier calendrier = new Calendrier();

        // Création de personnes
        Personne personne1 = new Personne("afrae", "benwadih", LocalDate.of(2001, 12, 15));
        Personne personne2 = new Personne("siham", "khiar", LocalDate.of(1985, 10, 11));
        AmiFacebook amiFacebook = new AmiFacebook("aya", "fakri", LocalDate.of(2000, 10, 11), "fakria");

        // Ajout des personnes au calendrier
        calendrier.add(personne1);
        calendrier.add(personne2);
        calendrier.add(amiFacebook);
    }
}
