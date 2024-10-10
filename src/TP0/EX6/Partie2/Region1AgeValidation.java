package TP0.EX6.Partie2;

public class Region1AgeValidation implements AgeValidationInterf{
    @Override
    public boolean peutBoireAlcool(int age) {
        return age >= 19;
    }

    @Override
    public boolean peutUtiliserFesseBouk(int age) {
        return age >= 14;
    }

    @Override
    public boolean peutEtreEluMaire(int age) {
        return age >= 21;
    }
}
