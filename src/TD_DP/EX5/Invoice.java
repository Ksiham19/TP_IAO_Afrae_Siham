package TD_DP.EX5;

class Invoice extends Document {
    public Invoice(String titre, String auteur, String contenu) {
        super(titre, auteur, contenu);
    }

    @Override
    public Document clone() {
        return new Invoice(this.titre, this.auteur, this.contenu);
    }
}
