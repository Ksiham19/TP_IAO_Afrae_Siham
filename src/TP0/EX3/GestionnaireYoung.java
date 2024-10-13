package TP0.EX3;

public class GestionnaireYoung {
    private TableauYoung tableau;

    public GestionnaireYoung(TableauYoung tableau) {
        this.tableau = tableau;
    }

    public boolean inserer(int key) {
        int n = tableau.getRowCount();
        int m = tableau.getColumnCount();

        if (tableau.getElement(n - 1, m - 1) != Integer.MAX_VALUE) {
            System.out.println("Le tableau de Young est plein.");
            return false;
        }

        tableau.setElement(n - 1, m - 1, key);
        int i = n - 1;
        int j = m - 1;

        while (i > 0 || j > 0) {
            int top = (i > 0) ? tableau.getElement(i - 1, j) : Integer.MAX_VALUE;
            int left = (j > 0) ? tableau.getElement(i, j - 1) : Integer.MAX_VALUE;

            if (key >= top && key >= left) break;

            if (i > 0 && top < left) {
                tableau.setElement(i, j, top);
                i--;
            } else if (j > 0) {
                tableau.setElement(i, j, left);
                j--;
            }
        }

        tableau.setElement(i, j, key);
        return true;
    }

    public int extraireMin() {
        if (tableau.getElement(0, 0) == Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        int min = tableau.getElement(0, 0);
        equilibrerTableau(0, 0);
        return min;
    }

    private void equilibrerTableau(int i, int j) {
        int n = tableau.getRowCount();
        int m = tableau.getColumnCount();

        int down = (i + 1 < n) ? tableau.getElement(i + 1, j) : Integer.MAX_VALUE;
        int right = (j + 1 < m) ? tableau.getElement(i, j + 1) : Integer.MAX_VALUE;

        if (down == Integer.MAX_VALUE && right == Integer.MAX_VALUE) return;

        if (down < right) {
            tableau.setElement(i, j, down);
            equilibrerTableau(i + 1, j);
        } else {
            tableau.setElement(i, j, right);
            equilibrerTableau(i, j + 1);
        }
    }
}
