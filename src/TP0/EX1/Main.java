package TP0.EX1;

public class Main {
    public static void main(String[] args) {
        // Créer des produits
        Produit produit1 = new Produit();
        produit1.setLibele("Prd 1");
        produit1.setPrix(10);

        Produit produit2 = new Produit();
        produit2.setLibele("Prd 2");
        produit2.setPrix(20);

        // Créer une facture
        Facture facture = new Facture(1);
        facture.addProduit(produit1, 2); // Ajouter 2 unités de Produit A
        facture.addProduit(produit2, 1); // Ajouter 1 unité de Produit B

        // TVA
        Facture.setTVA(0.2); // 20%

        // nstance d'impression et sauvegarde
        ImprimerFactureInterface impression = new ImprimerFacture();
        saveFactureInterface sauvegarde = new SaveFacture();

        // Imprimer la facture
        impression.imprimer(facture);

        // Sauvegarder la facture
        sauvegarde.saveFacture(facture);
    }
}

