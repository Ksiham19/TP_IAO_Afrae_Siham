package TD_DP.EX5;

public class Main {
    public static void main(String[] args) {
        DocumentFactory documentFactory = new DocumentFactory();
        System.out.println("------------Report-----------------");
        // Créer un document de type Rapport
        Document report = documentFactory.createDocument("REPORT", "Rapport Annuel", "khiar siham", "Rapport du tp1 solid ");
        report.afficher();

        // Cloner le document de type Rapport
        Document clonedReport = report.clone();
        clonedReport.afficher();

        // Modifier le contenu du clone pour voir si c'est indépendant de l'original
        clonedReport.titre = "Rapport Annuel - Copie";
        System.out.println("");
        System.out.println("------------Onchange le contenu du copie repport -----------------");
        clonedReport.afficher();
        System.out.println("");
        System.out.println("------------le report origine ne se change pas -----------------");
        report.afficher(); // L'original ne devrait pas être modifié
        System.out.println("");
        System.out.println("------------Contrat-----------------");
        // Créer un document de type Contrat
        Document contract = documentFactory.createDocument("CONTRACT", "Contrat ", "Afrae Benouadih ", "contrat de classe");
        contract.afficher();
        System.out.println("");
        System.out.println("------------Facture-----------------");
        // Créer un document de type Facture
        Document invoice = documentFactory.createDocument("INVOICE", "Facture 2024", "hafidi ", "Facture de produit ");
        invoice.afficher();
        System.out.println("");
        System.out.println("------------la copie du facture -----------------");
        // Cloner la facture et vérifier l'indépendance du clone
        Document clonedInvoice = invoice.clone();
        clonedInvoice.afficher();
        System.out.println("");
        System.out.println("------------Onchange le contenu du facture -----------------");
        clonedInvoice.contenu = "Contenu de la facture - Copie";
        clonedInvoice.afficher();
        System.out.println("");
        System.out.println("------------Facture originale ne se change pas -----------------");
        invoice.afficher();
    }
}
