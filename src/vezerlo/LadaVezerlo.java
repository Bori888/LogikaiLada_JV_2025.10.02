package vezerlo;

import modell.LadaModell;
import nezet.GuiLadaNezet;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LadaVezerlo {

    private LadaModell aranyLada;
    private LadaModell ezustLada;
    private LadaModell bronzLada;
    private GuiLadaNezet nezet;

    public LadaVezerlo(GuiLadaNezet nezet) {
        this.nezet = nezet;
        inicializalModell();
        hozzaadEsemenyKezeloket();
    }

    /** A ládák modelljeinek inicializálása */
    private void inicializalModell() {
        aranyLada = new LadaModell("Arany", "Én rejtem a kincset", false, false);
        ezustLada = new LadaModell("Ezüst", "Nem én rejtem a kincset", false, true);
        bronzLada = new LadaModell("Bronz", "Az Arany láda hazudik", true, false);
    }

    /** Eseménykezelők beállítása */
    private void hozzaadEsemenyKezeloket() {
        nezet.getEllenorizGomb().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String valasztott = nezet.getKivalasztottLada();
                String eredmeny = ellenorizValasztas(valasztott);
                nezet.getEredmenyMezo().setText(eredmeny);
            }
        });
    }

    /**
     * Logikai metódus — tesztelhető assert-tel
     * @param ladaNev a kiválasztott láda neve
     * @return szöveges üzenet az eredményről
     */
    public String ellenorizValasztas(String ladaNev) {
        if (ladaNev == null) {
            return "Válassz egy ládát!";
        }

        boolean nyert = false;

        switch (ladaNev) {
            case "Arany":
                nyert = aranyLada.isBenneVanEAKincs();
                break;
            case "Ezüst":
                nyert = ezustLada.isBenneVanEAKincs();
                break;
            case "Bronz":
                nyert = bronzLada.isBenneVanEAKincs();
                break;
            default:
                return "Ismeretlen láda!";
        }

        return nyert
                ? "🎉 Nyertél! A kincs a " + ladaNev + " ládában volt!"
                : "❌ Vesztettél! Próbáld újra!";
    }

    /** A nézet megjelenítése */
    public void megjelenit() {
        nezet.setVisible(true);
    }

    // getterek a modellekhez — a teszteléshez hasznos
    public LadaModell getAranyLada() {
        return aranyLada;
    }

    public LadaModell getEzustLada() {
        return ezustLada;
    }

    public LadaModell getBronzLada() {
        return bronzLada;
    }
}
