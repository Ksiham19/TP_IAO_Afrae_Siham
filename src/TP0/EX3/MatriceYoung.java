package TP0.EX3;
import static java.lang.Integer.MAX_VALUE;

public class MatriceYoung {
    private static final int INF = MAX_VALUE;
    private int n;
    private int m;
    private int[][] matrice;

    public MatriceYoung(int n, int m) {
        this.n = n;
        this.m = m;
        matrice = new int[n][m];
        // Initialiser la matrice avec INF (valeur infinie)
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrice[i][j] = INF;
            }
        }
    }

    public int extraireMin() {
        if (matrice[0][0] == INF) {
            return INF; // Aucun élément n'est inséré
        }
        int min = matrice[0][0];
        // Rééquilibrer le tableau après extraction
        equilibrerTableau(0, 0);
        return min;
    }

    public boolean inserer(int key) {
        if (matrice[n - 1][m - 1] != INF) {
            System.out.println("Le tableau de Young est plein.");
            return false;
        }
        // Insérer la clé dans la dernière case en bas à droite
        matrice[n - 1][m - 1] = key;
        // Rééquilibrer en remontant la clé à sa position correcte
        int i = n - 1;
        int j = m - 1;
        while (i > 0 || j > 0) {
            int top = (i > 0) ? matrice[i - 1][j] : INF;
            int left = (j > 0) ? matrice[i][j - 1] : INF;

            if (key >= top && key >= left) {
                break; // La clé est à la bonne position
            } else if (top < left) {
                matrice[i][j] = top;
                i--;
            } else {
                matrice[i][j] = left;
                j--;
            }
        }
        matrice[i][j] = key;
        return true;
    }

    private void equilibrerTableau(int i, int j) {
        int down = (i + 1 < n) ? matrice[i + 1][j] : INF;
        int right = (j + 1 < m) ? matrice[i][j + 1] : INF;

        if (down == INF && right == INF) {
            return; // Fin de la descente
        }

        if (down < right) {
            matrice[i][j] = down;
            equilibrerTableau(i + 1, j);
        } else {
            matrice[i][j] = right;
            equilibrerTableau(i, j + 1);
        }
    }

    public void printTableau() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrice[i][j] == INF) {
                    System.out.print("INF ");
                } else {
                    System.out.print(matrice[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
