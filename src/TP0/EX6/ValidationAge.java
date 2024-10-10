package TP0.EX6;

import java.util.HashMap;
import java.util.Map;

public class ValidationAge {
    private static final Map<String, AgeLimits> ageLimitsByRegion = new HashMap<>();

    static {
        ageLimitsByRegion.put("default", new AgeLimits(18, 13, 21)); //
        ageLimitsByRegion.put("region1", new AgeLimits(19, 14, 21)); // Région avec limites modifiées
    }

    public boolean peutBoireAlcool(int age, String region) {
        AgeLimits limits = ageLimitsByRegion.getOrDefault(region, ageLimitsByRegion.get("default"));
        return age >= limits.getAgeAlcool();
    }

    public boolean peutUtiliserFesseBouk(int age, String region) {
        AgeLimits limits = ageLimitsByRegion.getOrDefault(region, ageLimitsByRegion.get("default"));
        return age >= limits.getAgeFesseBouk();
    }

    public boolean peutEtreEluMaire(int age, String region) {
        AgeLimits limits = ageLimitsByRegion.getOrDefault(region, ageLimitsByRegion.get("default"));
        return age >= limits.getAgeMaire();
    }
}
