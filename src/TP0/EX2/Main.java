package TP0.EX2;

public class Main {
    public static void main(String[] args) {
        Compte compteCourant = new CompteCourant("1", "11-12-2020");
        Compte compteEpargne = new CompteEpargne("2", "10-2-2030");

        Operation debitOperation = new Operation(200, TypeOperation.Debit);
        Operation creditOperation = new Operation(150, TypeOperation.Credit);

        System.out.println("Compte Courant:");
        System.out.println("Ajout d'une opération de débit : " + compteCourant.addOperation(debitOperation));
        System.out.println("Montant après débit: " + compteCourant.getMontant());
        System.out.println("Ajout d'une opération de crédit : " + compteCourant.addOperation(creditOperation));
        System.out.println("Montant après crédit: " + compteCourant.getMontant());

        System.out.println("\nCompte Epargne:");
        System.out.println("Ajout d'une opération de débit : " + compteEpargne.addOperation(debitOperation));
        System.out.println("Montant après débit: " + compteEpargne.getMontant());
        System.out.println("Ajout d'une opération de crédit : " + compteEpargne.addOperation(creditOperation));
        System.out.println("Montant après crédit: " + compteEpargne.getMontant());
    }
}
