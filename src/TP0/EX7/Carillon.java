package TP0.EX7;

public class Carillon {
    private Alerteur alerteur;

    public Carillon(Alerteur alerteur) {
        this.alerteur = alerteur;
    }

    public void activerManuellement() {
        alerteur.envoyerAlerte("Le carillon a été activé manuellement");
    }
}