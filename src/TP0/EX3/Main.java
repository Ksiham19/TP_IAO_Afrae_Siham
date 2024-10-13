package TP0.EX3;
public class Main {
    public static void main(String[] args) {
        TableauYoung tableau = new TableauYoung(3, 3);
        GestionnaireYoung gestionnaire = new GestionnaireYoung(tableau);

        gestionnaire.inserer(8);
        gestionnaire.inserer(5);
        gestionnaire.inserer(3);
        gestionnaire.inserer(4);
        gestionnaire.inserer(1);

        tableau.printTableau();

        System.out.println("Extraction du min: " + gestionnaire.extraireMin());
        tableau.printTableau();
    }
}
