package TP0.EX2;

public class Main {
    public static void main(String[] args) {
        Compte compteCourant = new CompteCourant("Compte1", "11-12-2020");
        Compte compteEpargne = new CompteEpargne("Compte2", "10-2-2030");

        Operation debitOperation = new Operation(200, TypeOperation.Debit);
        Operation creditOperation = new Operation(150, TypeOperation.Credit);

        System.out.println("Compte Courant:");
        System.out.println("Ajout d'une operation de debit : " + compteCourant.addOperation(debitOperation));
        System.out.println("Montant après debit: " + compteCourant.getMontant());
        System.out.println("Ajout d'une operation de credit : " + compteCourant.addOperation(creditOperation));
        System.out.println("Montant après credit: " + compteCourant.getMontant());

        System.out.println("\nCompte Epargne:");
        System.out.println("Ajout d'une operation de debit : " + compteEpargne.addOperation(debitOperation));
        System.out.println("Montant après debit: " + compteEpargne.getMontant());
        System.out.println("Ajout d'une operation de credit : " + compteEpargne.addOperation(creditOperation));
        System.out.println("Montant après credit: " + compteEpargne.getMontant());
    }
}
