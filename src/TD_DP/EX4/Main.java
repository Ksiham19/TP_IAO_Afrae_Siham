package TD_DP.EX4;

public class Main {
    public static void main(String[] args) {
        // Création d'un produit avec un stock initial
        Stock product = new Stock("Produit A", 20);

        // Ajout des observateurs
        product.addObserver(new EmailAlert());
        product.addObserver(new UIUpdate());
        product.addObserver(new DailyReport());

        // Mise à jour de la quantité pour tester les notifications
        System.out.println("Mise à jour de la quantité à 15.");
        product.setQuantity(15);

        System.out.println("Mise à jour de la quantité à 8.");
        product.setQuantity(8);  // Doit déclencher l'alerte EmailAlert

        System.out.println("Mise à jour de la quantité à 25.");
        product.setQuantity(25);
    }
}
