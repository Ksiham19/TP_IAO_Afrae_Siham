package TP0.EX2;

import java.util.ArrayList;

public abstract class Compte {
    protected ArrayList<Operation> operations;
    protected String id;
    protected String dateCreation;
    protected double montant;

    public Compte(String id, String dateCreation) {
        this.id = id;
        this.dateCreation = dateCreation;
        this.operations = new ArrayList<>();
        this.montant = 0;
    }

    public abstract boolean addOperation(Operation operation);

    public double getMontant() {
        return montant;
    }
}
