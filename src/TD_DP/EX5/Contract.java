package TD_DP.EX5;

class Contract extends Document {
    public Contract(String titre, String auteur, String contenu) {
        super(titre, auteur, contenu);
    }

    @Override
    public Document clone() {
        return new Contract(this.titre, this.auteur, this.contenu);
    }
}
