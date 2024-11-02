package TD_DP.EX5;

abstract class Document implements Cloneable {
    protected String titre;
    protected String auteur;
    protected String contenu;

    public Document(String titre, String auteur, String contenu) {
        this.titre = titre;
        this.auteur = auteur;
        this.contenu = contenu;
    }

    public abstract Document clone();

    public void afficher() {
        System.out.println("Titre: " + titre + ", Auteur: " + auteur + ", Contenu: " + contenu);
    }
}
