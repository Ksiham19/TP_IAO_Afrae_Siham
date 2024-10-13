package TP0.EX3;

import java.util.ArrayList;

public class TableauYoung {
    private static final int INF = Integer.MAX_VALUE;
    private int n, m;
    private ArrayList<ArrayList<Integer>> tableau;

    public TableauYoung(int n, int m) {
        this.n = n;
        this.m = m;
        tableau = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            ArrayList<Integer> row = new ArrayList<>(m);
            for (int j = 0; j < m; j++) {
                row.add(INF);
            }
            tableau.add(row);
        }
    }

    public int getElement(int i, int j) {
        return tableau.get(i).get(j);
    }

    public void setElement(int i, int j, int valeur) {
        tableau.get(i).set(j, valeur);
    }

    public int getRowCount() {
        return n;
    }

    public int getColumnCount() {
        return m;
    }

    public void printTableau() {
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
}

