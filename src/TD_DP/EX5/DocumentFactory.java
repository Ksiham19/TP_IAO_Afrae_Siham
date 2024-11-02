package TD_DP.EX5;

class DocumentFactory {
    public Document createDocument(String type, String titre, String auteur, String contenu) {
        if (type == null) {
            return null;
        }
        if (type.equalsIgnoreCase("REPORT")) {
            return new Report(titre, auteur, contenu);
        } else if (type.equalsIgnoreCase("CONTRACT")) {
            return new Contract(titre, auteur, contenu);
        } else if (type.equalsIgnoreCase("INVOICE")) {
            return new Invoice(titre, auteur, contenu);
        }
        return null;
    }
}
/* Pattern Factory : Simplifie la création
des différents types de documents en centralisant la logique dans une seule classe (DocumentFactory).
 */