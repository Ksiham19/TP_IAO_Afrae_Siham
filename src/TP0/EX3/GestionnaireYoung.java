package TP0.EX3;

public class GestionnaireYoung {
    private TableauYoung tableauYoung;

    public GestionnaireYoung(int n, int m) {
        tableauYoung = new TableauYoung(n, m);
    }

    public void inserer(int value) {
        tableauYoung.insert(value);
    }

    public int extraireMin() {
        return tableauYoung.extraireMin();
    }

    public void afficherTableau() {
        tableauYoung.printTableau();
    }
}
