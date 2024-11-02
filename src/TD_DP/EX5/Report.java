package TD_DP.EX5;

class Report extends Document {
    public Report(String titre, String auteur, String contenu) {
        super(titre, auteur, contenu);
    }

    @Override
    public Document clone() {
        return new Report(this.titre, this.auteur, this.contenu);
    }
}

