package TD_DP.EX4;

import java.util.ArrayList;
import java.util.List;

public class Stock {
    private String name;
    private int quantity;
    private List<StockObserver> observers = new ArrayList<>();

    // Constructeur
    public Stock(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    // Méthode pour ajouter un observateur
    public void addObserver(StockObserver observer) {
        observers.add(observer);
    }

    // Méthode pour retirer un observateur
    public void removeObserver(StockObserver observer) {
        observers.remove(observer);
    }

    // Méthode pour notifier tous les observateurs
    private void notifyObservers() {
        for (StockObserver observer : observers) {
            observer.update(this);
        }
    }

    // Méthode pour mettre à jour la quantité et notifier les observateurs
    public void setQuantity(int quantity) {
        this.quantity = quantity;
        notifyObservers();
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }
}
