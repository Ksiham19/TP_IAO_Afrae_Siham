package TD_DP.EX3;

import java.util.HashMap;
import java.util.Map;

public class DataAdapter {
    private InternalData internalData;

    // Constructeur prenant une instance de InternalData
    public DataAdapter(InternalData internalData) {
        this.internalData = internalData;
    }

    // Méthode pour convertir InternalData en un format compatible avec l'API externe
    public Map<String, String> convertToExternalFormat() {
        Map<String, String> externalData = new HashMap<>();
        externalData.put("first_name", internalData.getFirstName());
        externalData.put("last_name", internalData.getLastName());
        externalData.put("age", String.valueOf(internalData.getAge()));
        return externalData;
    }
}