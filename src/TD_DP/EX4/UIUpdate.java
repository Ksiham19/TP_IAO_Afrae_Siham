package TD_DP.EX4;

public class UIUpdate implements StockObserver {
    @Override
    public void update(Stock stock) {
        System.out.println("Mise à jour de l'UI : Le stock de " + stock.getName() + " est maintenant de " + stock.getQuantity() + " unités.");
    }
}