
package nezet;


public class GuiLadaNezet {
    private String Nev;
    private String Felirat;
    private boolean EbbenVanAKimcs;
    private boolean IgazatMonddE;

    public GuiLadaNezet(String Nev, String Felirat, boolean EbbenVanAKimcs, boolean IgazatMonddE) {
        this.Nev = Nev;
        this.Felirat = Felirat;
        this.EbbenVanAKimcs = EbbenVanAKimcs;
        this.IgazatMonddE = IgazatMonddE;
    }

    public boolean isIgazatMonddE() {
        return IgazatMonddE;
    }



    public String getNev() {
        return Nev;
    }

    public String getFelirat() {
        return Felirat;
    }

    public boolean isEbbenVanAKimcs() {
        return EbbenVanAKimcs;
    }
    
}
