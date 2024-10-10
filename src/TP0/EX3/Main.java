package TP0.EX3;

public class Main {
    public static void main(String[] args) {
        GestionnaireYoung gestionnaire = new GestionnaireYoung(3, 3);

        // Insertion de valeurs
        gestionnaire.inserer(5);
        gestionnaire.inserer(3);
        gestionnaire.inserer(8);
        gestionnaire.inserer(1);
        gestionnaire.inserer(7);
        gestionnaire.inserer(2);
        gestionnaire.inserer(6);
        gestionnaire.inserer(4);
        gestionnaire.inserer(9);

        System.out.println("Tableau après insertion :");
        gestionnaire.afficherTableau();

        int min = gestionnaire.extraireMin();
        System.out.println("Minimum extrait : " + (min == Integer.MAX_VALUE ? "INF" : min));

        System.out.println("Tableau après extraction du minimum :");
        gestionnaire.afficherTableau();
    }
}
