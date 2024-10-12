package TP0.EX7;

import TP0.EX7.Alerteur;
public class SMSEnvoi implements Alerteur {

    @Override
    public void envoyerAlerte(String message) {
        // Simuler l'envoi d'un SMS avec le message
        System.out.println("Envoi du SMS : " + message);
    }
}
