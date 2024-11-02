package TD_DP.EX3;

import java.util.Map;

public class ExternalAPI {
    // Méthode pour simuler l'envoi de données dans le format attendu
    public void sendData(Map<String, String> data) {
        System.out.println("Envoi des données à l'API externe : " + data);
    }
}
