package TD_DP.EX4;

import java.time.LocalDateTime;

public class DailyReport implements StockObserver {
    @Override
    public void update(Stock stock) {
        System.out.println("Rapport : Le stock de " + stock.getName() + " a été mis à jour à " + stock.getQuantity() +
                " unités. Temps de mise à jour : " + LocalDateTime.now());
    }
}
