package TP0.EX3;

import java.util.ArrayList;

public class TableauYoung {
    private static final int INF = Integer.MAX_VALUE;
    private ArrayList<ArrayList<Integer>> tableau;
    private int n; // Nombre de lignes
    private int m; // Nombre de colonnes

    public TableauYoung(int n, int m) {
        this.n = n;
        this.m = m;
        tableau = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ArrayList<Integer> ligne = new ArrayList<>();
            for (int j = 0; j < m; j++) {
                ligne.add(INF); // Initialiser toutes les cases avec INF
            }
            tableau.add(ligne);
        }
    }

    public void insert(int key) {
        // Vérifiez si le tableau est plein
        if (tableau.get(n - 1).get(m - 1) != INF) {
            System.out.println("Le tableau de Young est plein.");
            return;
        }

        // Insérer la clé à la position INF (dernière case)
        tableau.get(n - 1).set(m - 1, key);
        int i = n - 1;
        int j = m - 1;

        // Maintenir la propriété du tableau de Young
        while (i > 0 || j > 0) {
            int top = (i > 0) ? tableau.get(i - 1).get(j) : INF;
            int left = (j > 0) ? tableau.get(i).get(j - 1) : INF;

            if (key < top && key < left) {
                break; // La clé est à la bonne place
            } else if (top < left) {
                tableau.get(i).set(j, top);
                i--;
            } else {
                tableau.get(i).set(j, left);
                j--;
            }
        }
        tableau.get(i).set(j, key); // Placer la clé à sa position finale
    }

    public int extraireMin() {
        if (tableau.get(0).get(0) == INF) {
            return INF; // Tableau vide
        }
        int min = tableau.get(0).get(0);
        tableau.get(0).set(0, tableau.get(n - 1).get(m - 1)); // Remplacer le min par la dernière valeur
        tableau.get(n - 1).set(m - 1, INF); // Marquer la case comme vide
        equilibrerTableau(0, 0); // Équilibrer le tableau après extraction
        return min;
    }

    private void equilibrerTableau(int i, int j) {
        int down = (i + 1 < n) ? tableau.get(i + 1).get(j) : INF;
        int right = (j + 1 < m) ? tableau.get(i).get(j + 1) : INF;

        // Si les deux éléments en bas et à droite sont INF, on a terminé
        if (down == INF && right == INF) {
            return;
        }

        // Trouver le plus petit élément et le remonter
        if (down < right) {
            tableau.get(i).set(j, down);
            equilibrerTableau(i + 1, j); // Descendre dans la colonne
        } else {
            tableau.get(i).set(j, right);
            equilibrerTableau(i, j + 1); // Descendre dans la ligne
        }
    }

    public void printTableau() {
        for (ArrayList<Integer> ligne : tableau) {
            for (Integer val : ligne) {
                if (val == INF) {
                    System.out.print("INF ");
                } else {
                    System.out.print(val + " ");
                }
            }
            System.out.println();
        }
    }
}
