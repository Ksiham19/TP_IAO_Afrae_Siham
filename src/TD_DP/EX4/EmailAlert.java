package TD_DP.EX4;

public class EmailAlert implements StockObserver {
    @Override
    public void update(Stock stock) {
        if (stock.getQuantity() < 10) {
            System.out.println("Alerte : Le stock de " + stock.getName() + " est faible (" + stock.getQuantity() + " unités restantes).");
        }
    }
}
