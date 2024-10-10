package TP0.EX6.Partie2;

public class ValidationAge {
    private AgeValidationInterf interfce;

    public ValidationAge(AgeValidationInterf interfce) {
        this.interfce = interfce;
    }

    public boolean peutBoireAlcool(int age) {
        return interfce.peutBoireAlcool(age);
    }

    public boolean peutUtiliserFesseBouk(int age) {
        return interfce.peutUtiliserFesseBouk(age);
    }

    public boolean peutEtreEluMaire(int age) {
        return interfce.peutEtreEluMaire(age);
    }
}
