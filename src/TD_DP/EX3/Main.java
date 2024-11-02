package TD_DP.EX3;

public class Main {
    public static void main(String[] args) {
        // Créez des données internes
        InternalData internalData = new InternalData("Afrae", "BENWADIH", 22);

        // Utilisez l'adaptateur pour convertir les données
        DataAdapter adapter = new DataAdapter(internalData);
        ExternalAPI api = new ExternalAPI();

        // Envoyez les données converties à l'API externe
        api.sendData(adapter.convertToExternalFormat());
    }
}