package TP0.EX3;
public class TestMatriceYoung {
    public static void main(String[] args) {
        MatriceYoung matrice = new MatriceYoung(3, 3);

        // Insertion des éléments
        matrice.inserer(1);
        matrice.inserer(2);
        matrice.inserer(3);
        matrice.inserer(4);
        matrice.inserer(5);
        matrice.inserer(6);

        // Affichage de la matrice
        System.out.println("État de la matrice après insertion :");
        matrice.printMatrice();

        // Extraction du minimum
        int min = matrice.extraireMin();
        System.out.println("Min extrait: " + min);

        // Affichage de la matrice après extraction
        System.out.println("État de la matrice après extraction :");
        matrice.printMatrice();
    }
}
