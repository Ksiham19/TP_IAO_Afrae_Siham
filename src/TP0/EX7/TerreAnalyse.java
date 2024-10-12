package TP0.EX7;

public class TerreAnalyse {
    private Alerteur alerteur;
    private int tauxHumidite;
    private int acidite;

    public TerreAnalyse(Alerteur alerteur) {
        this.alerteur = alerteur;
    }

    public void vérifierConditions() {
        // Exemples de conditions problématiques
        if (tauxHumidite < 30 || acidite > 7) {
            alerteur.envoyerAlerte("Problème détecté dans l'analyse de la terre");
        }
    }


    public void setTauxHumidite(int tauxHumidite) {
        this.tauxHumidite = tauxHumidite;
    }

    public void setAcidite(int acidite) {
        this.acidite = acidite;
    }
}
