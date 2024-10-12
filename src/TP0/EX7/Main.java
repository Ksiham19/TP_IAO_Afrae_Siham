package TP0.EX7;

import TP0.EX7.SMSEnvoi;

public class Main {
    public static void main(String[] args) {
        // Créer un objet SMSEnvoi qui enverra les alertes par SMS
        Alerteur smsEnvoi = new SMSEnvoi();

        // Instancier le réservoir d'eau et analyser la terre avec l'alerteur SMS
        RéservoirEau reservoir = new RéservoirEau(smsEnvoi);
        TerreAnalyse terreAnalyse = new TerreAnalyse(smsEnvoi);
        Carillon carillon = new Carillon(smsEnvoi);

        // Simuler des conditions pour déclencher des alertes
        reservoir.setNiveauActuel(100);
        reservoir.setSeuilAlerte(50);
        reservoir.vérifierSeuil();

        terreAnalyse.setTauxHumidite(20); // Niveau d'humidité trop bas
        terreAnalyse.setAcidite(8); // Acidité trop élevée
        terreAnalyse.vérifierConditions();

        // Activer manuellement le carillon
        carillon.activerManuellement();
    }
}
