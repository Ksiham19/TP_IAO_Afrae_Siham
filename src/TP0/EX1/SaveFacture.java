package TP0.EX1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class SaveFacture implements saveFactureInterface{
    @Override
    public void saveFacture(Facture facture) {
        try {
            String file = "Facture".concat(String.valueOf(facture.getId()));
            FileWriter writer = new FileWriter(file);
            writer.write("Facture ID: " + facture.getId() + "\n");
            for (Map.Entry<Produit, Integer> entry : facture.getProduits().entrySet()) {
                writer.write(entry.getKey().toString() + "\t" + entry.getValue().toString() + "\n");
            }
            writer.write("Prix = " + facture.getTotal() + "\n");
            writer.write("PrixTTC = " + facture.getTotalTTC() + "\n");
            writer.close();
            System.out.println("Facture sauvegardée avec succès.");
        } catch (IOException e) {
            System.out.println("Erreur lors de la sauvegarde.");
            e.printStackTrace();
        }
    }
}
