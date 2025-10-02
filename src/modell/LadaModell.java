package modell;

public class LadaModell {

    private String Nev;
    private String Felirat;
    private boolean benneVanEAKincs;
    private boolean IgazatMonddE;

    public LadaModell(String Nev, String Felirat, boolean benneVanEAKincs, boolean IgazatMonddE) {
        this.Nev = Nev;
        this.Felirat = Felirat;
        this.benneVanEAKincs = benneVanEAKincs;
        this.IgazatMonddE = IgazatMonddE;
    }

    public String getNev() {
        return Nev;
    }

    public String getFelirat() {
        return Felirat;
    }

    public boolean isBenneVanEAKincs() {
        return benneVanEAKincs;
    }

    public boolean isIgazatMonddE() {
        return IgazatMonddE;
    }
    

}
