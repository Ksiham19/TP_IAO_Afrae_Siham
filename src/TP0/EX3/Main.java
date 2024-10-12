package TP0.EX3;
public class Main {
    public static void main(String[] args) {
        MatriceYoung tableau = new MatriceYoung(3, 3);

        // Insérer des éléments
        tableau.inserer(3);
        tableau.inserer(2);
        tableau.inserer(4);
        tableau.inserer(1);
        tableau.inserer(6);
        tableau.inserer(5);
        tableau.inserer(7);

        // Afficher le tableau après insertion
        System.out.println("Tableau après insertion :");
        tableau.printTableau();

        // Extraire le minimum
        System.out.println("Minimum extrait : " + tableau.extraireMin());

        // Afficher le tableau après extraction
        System.out.println("Tableau après extraction :");
        tableau.printTableau();
    }
}
