package TP0.EX3;

import java.util.ArrayList;

public class MatriceYoung extends ArrayList<Object> {
    private static final int INF = Integer.MAX_VALUE; // Valeur infinie
    private int n; // Nombre de lignes
    private int m; // Nombre de colonnes

    public MatriceYoung(int n, int m) {
        super(n);
        this.n = n;
        this.m = m;
        for (int i = 0; i < n; i++) {
            ArrayList<Integer> row = new ArrayList<>(m); // Créer une nouvelle ligne
            for (int j = 0; j < m; j++) {
                row.add(INF); // Initialiser chaque élément avec INF
            }
            this.add(row); // Ajouter la ligne à la matrice
        }
    }

    public int extraireMin() {
        // Aucune valeur n'est insérée dans le tableau
        if (this.getElement(0, 0) == INF) {
            return INF;
        } else {
            int min = this.getElement(0, 0);
            equilibrerTableau(0, 0); // Équilibrer le tableau après extraction
            return min;
        }
    }

    public boolean inserer(int key) {
        // Vérifier si le tableau est plein
        if (getElement(n - 1, m - 1) != INF) {
            System.out.println("Le tableau de Young est plein.");
            return false;
        }

        // Insérer la clé à la dernière position (en bas à droite)
        setElement(n - 1, m - 1, key);
        int i = n - 1;
        int j = m - 1;

        // Remonter la clé insérée pour rétablir l'ordre
        while (i > 0 || j > 0) {
            int top = (i > 0) ? getElement(i - 1, j) : INF;
            int left = (j > 0) ? getElement(i, j - 1) : INF;

            if (key <= top && key <= left) {
                break; // La clé est à la bonne place
            } else if (top < left) {
                setElement(i, j, top);
                i--;
            } else {
                setElement(i, j, left);
                j--;
            }
        }

        setElement(i, j, key); // Placer la clé à sa place finale
        return true;
    }

    // Fonction pour rétablir la propriété du tableau de Young après l'extraction du minimum
    private void equilibrerTableau(int i, int j) {
        int down = (i + 1 < n) ? this.getElement(i + 1, j) : INF;
        int right = (j + 1 < m) ? this.getElement(i, j + 1) : INF;

        if (down == INF && right == INF) {
            return; // Fin de la descente
        }

        if (down < right) {
            this.setElement(i, j, down);
            equilibrerTableau(i + 1, j);
        } else {
            this.setElement(i, j, right);
            equilibrerTableau(i, j + 1);
        }
    }

    public void printMatrice() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (this.getElement(i, j) == INF) {
                    System.out.print("INF" + " ");
                } else {
                    System.out.print(this.getElement(i, j) + " ");
                }
            }
            System.out.println();
        }
    }

    private int getElement(int i, int j) {
        return ((ArrayList<Integer>) this.get(i)).get(j);
    }

    private void setElement(int i, int j, int valeur) {
        ((ArrayList<Integer>) this.get(i)).set(j, valeur);
    }
}
