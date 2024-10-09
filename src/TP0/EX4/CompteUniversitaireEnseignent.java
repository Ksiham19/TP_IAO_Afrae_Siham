package TP0.EX4;

public class CompteUniversitaireEnseignent extends CompteUniversitaire{
    private Enseignent enseignent;
    private String login;

    public CompteUniversitaireEnseignent(Enseignent enseignent) {
        super();
        this.enseignent = enseignent;
    }
    public void genererLogin(){
        String login = this.enseignent.getPrenom()+this.enseignent.getNom() + this.enseignent.getGrade()+"usms.ma";
        this.login = login;
    }
}