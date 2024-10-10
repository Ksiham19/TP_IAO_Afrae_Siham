package TP0.EX6.Partie2;

public class Main {
        public static void main(String[] args) {
            // Utilisation de la validation par défaut
            ValidationAge validationAgeDefault = new ValidationAge(new DefaultAgeValidation());
            System.out.println(validationAgeDefault.peutBoireAlcool(18));  // true
            System.out.println(validationAgeDefault.peutBoireAlcool(17));  // false

            // Utilisation de la validation pour une région spécifique
            ValidationAge validationAgeRegion1 = new ValidationAge(new Region1AgeValidation());
            System.out.println(validationAgeRegion1.peutBoireAlcool(18));  // false
            System.out.println(validationAgeRegion1.peutBoireAlcool(19));  // true
        }
    }

