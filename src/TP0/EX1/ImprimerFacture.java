package TP0.EX1;

import java.util.Map;

public class ImprimerFacture implements ImprimerFactureInterface{
    @Override
    public void imprimer(Facture facture){
        double prix;
        for (Map.Entry<Produit, Integer> entry : facture.getProduits().entrySet()) {
            prix = entry.getKey().getPrix() * entry.getValue();
            System.out.println(entry.getKey() + "\t" + entry.getValue() + " : " + prix );
        }
        System.out.println("Prix = " + facture.getTotal());
        System.out.println("PrixTTC = " + facture.getTotalTTC());
    }


}
