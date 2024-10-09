package TP0.EX4;

public class Main {
    public static void main(String[] args) {
        // Création d'un étudiant
        Etudiant etudiant = new Etudiant("AFRAE", "BENWADIH", 5454);
        CompteUniversitaireEtudiant compteEtudiant = new CompteUniversitaireEtudiant(etudiant);
        compteEtudiant.genererLogin();
        System.out.println("Login Etudiant : " + compteEtudiant.getLogin()); // Affiche le login généré

        // Création d'un enseignant
        Enseignent enseignant = new Enseignent("SIHAM", "KHIAR", "Professeur");
        CompteUniversitaireEnseignent compteEnseignant = new CompteUniversitaireEnseignent(enseignant);
        compteEnseignant.genererLogin();
        System.out.println("Login Enseignant : " + compteEnseignant.getLogin()); // Affiche le login généré
    }
}
