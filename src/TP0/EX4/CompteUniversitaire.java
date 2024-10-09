package TP0.EX4;

public abstract class CompteUniversitaire {
    protected String login;

    public abstract void genererLogin();

    public String getLogin() {
        return login;
    }
}
