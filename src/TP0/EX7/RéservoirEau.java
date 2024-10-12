package TP0.EX7;

public class RéservoirEau {
    private Alerteur alerteur;
    private int niveauActuel;
    private int seuilAlerte;

    // Injecter une instance d'Alerteur (comme SMSEnvoi)
    public RéservoirEau(Alerteur alerteur) {
        this.alerteur = alerteur;
    }

    // Simuler le contrôle du niveau d'eau et envoyer une alerte
    public void vérifierSeuil() {
        if (niveauActuel >= seuilAlerte) {
            alerteur.envoyerAlerte("Seuil atteint dans le réservoir d'eau");
        }
    }


    public void setNiveauActuel(int niveauActuel) {
        this.niveauActuel = niveauActuel;
    }

    public void setSeuilAlerte(int seuilAlerte) {
        this.seuilAlerte = seuilAlerte;
    }
}
