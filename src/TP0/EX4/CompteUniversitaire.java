package TP0.EX4;

public class CompteUniversitaireEnseignent extends CompteUniversitaire {
    private Enseignent enseignent;

    public CompteUniversitaireEnseignent(Enseignent enseignent) {
        this.enseignent = enseignent;
    }

    @Override
    public void genererLogin() {
        this.login = this.enseignent.getPrenom() + this.enseignent.getNom() + this.enseignent.getGrade() + "@usms.ma";
    }
}
