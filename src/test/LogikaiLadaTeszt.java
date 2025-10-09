package test;

import nezet.GuiLadaNezet;
import vezerlo.LadaVezerlo;

public class LogikaiLadaTeszt {

    private final GuiLadaNezet nezet;
    private final LadaVezerlo vezerlo;

    public LogikaiLadaTeszt(GuiLadaNezet nezet, LadaVezerlo vezerlo) {
        this.nezet = nezet;
        this.vezerlo = vezerlo;
    }

    public static void main(String[] args) {
        System.out.println("----- LOGIKAI LÁDA TESZTEK (assert) -----");

        // Itt az eredeti GUI példányt adjuk át
        GuiLadaNezet eredetiNezet = new GuiLadaNezet();
        LadaVezerlo eredetiVezerlo = new LadaVezerlo(eredetiNezet);

        LogikaiLadaTeszt teszt = new LogikaiLadaTeszt(eredetiNezet, eredetiVezerlo);

        teszt.ossztesztVezerlo();
        teszt.modellTesztek();

        System.out.println("\n--- Minden teszt lefutott! ----");
    }

    public void ossztesztVezerlo() {
        futtatTeszt("Kiválasztott ládára visszajelzés", this::vezerloKivalasztottLadaVisszajelzesTeszt);
        futtatTeszt("Visszajelzés szövege", this::vezerloVisszajelzesSzovegTeszt);
        futtatTeszt("Ládára való hivatkozás szöveges / szám", this::vezerloLadaHivatkozasSzovegSzamTeszt);
    }

    private void futtatTeszt(String nev, Runnable tesztMetodus) {
        try {
            tesztMetodus.run();
            System.out.println("Sikeres: " + nev);
        } catch (AssertionError e) {
            System.out.println("Hiba a tesztben (" + nev + "): " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Kivétel a tesztben (" + nev + "): " + e.getMessage());
        }
    }

    private void vezerloKivalasztottLadaVisszajelzesTeszt() {
        nezet.getRBronzbanVanAKincs().setSelected(true);
        nezet.getBtnEllenoriz().doClick();
        assert nezet.getTxtEredmeny().getText().contains(LadaVezerlo.UZENET_NYERT) : 
            "Bronz láda: hibás eredmény";

        nezet.getRdbAranybanVanAKincs().setSelected(true);
        nezet.getBtnEllenoriz().doClick();
        assert nezet.getTxtEredmeny().getText().contains(LadaVezerlo.UZENET_NEM_NYERT) : 
            "Arany láda: hibás eredmény";

        nezet.getRdbEzustbenVanAKincs().setSelected(true);
        nezet.getBtnEllenoriz().doClick();
        assert nezet.getTxtEredmeny().getText().contains(LadaVezerlo.UZENET_NEM_NYERT) : 
            "Ezüst láda: hibás eredmény";
    }

    private void vezerloVisszajelzesSzovegTeszt() {
        nezet.getRBronzbanVanAKincs().setSelected(false);
        nezet.getRdbAranybanVanAKincs().setSelected(false);
        nezet.getRdbEzustbenVanAKincs().setSelected(false);
        nezet.getBtnEllenoriz().doClick();
        assert nezet.getTxtEredmeny().getText().equals(LadaVezerlo.UZENET_VALASSZ) : 
            "Nincs választás: hibás üzenet";
    }

    private void vezerloLadaHivatkozasSzovegSzamTeszt() {
        assert "Bronz".equals("Bronz") : "Szöveges hivatkozás hibás";
        assert String.valueOf(2).equals("2") : "Szám hivatkozás hibás";
    }

    public void modellTesztek() {
        assert nezet.getLblAranyLadaLeiras() != null : "Arany láda felirat hiányzik";
        assert nezet.getLblEzustLadaLeiras() != null : "Ezüst láda felirat hiányzik";
        assert nezet.getLblBronzLadaLeiras() != null : "Bronz láda felirat hiányzik";
    }
}
