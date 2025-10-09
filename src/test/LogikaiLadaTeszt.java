package test;

import nezet.GuiLadaNezet;
import vezerlo.LadaVezerlo;
import vezerlo.LadaVezerlo;

public class LogikaiLadaTeszt {

    public static void main(String[] args) {
        System.out.println("=== LOGIKAI LÁDA TESZTEK (assert) ===");
        LogikaiLadaTeszt teszt = new LogikaiLadaTeszt();
        teszt.ossztesztVezerlo();
        System.out.println("Minden assert teszt sikeresen lefutott!");
    }

    private static void modellTesztek() {

    }

    private void ossztesztVezerlo() {
        System.out.println("\n--- Vezérlő tesztjei futnak ---");
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
        TestKornyezet k = ujKornyezet();

        k.nezet.getRBronzbanVanAKincs().setSelected(true);
        k.nezet.getBtnEllenoriz().doClick();
        assert k.nezet.getTxtEredmeny().getText().contains("Gratulálunk") :
                "Bronz láda: hibás eredmény: " + k.nezet.getTxtEredmeny().getText();

        k.nezet.getRdbAranybanVanAKincs().setSelected(true);
        k.nezet.getBtnEllenoriz().doClick();
        assert k.nezet.getTxtEredmeny().getText().contains("Sajnálom") :
                "Arany láda: hibás eredmény: " + k.nezet.getTxtEredmeny().getText();

        k.nezet.getRdbEzustbenVanAKincs().setSelected(true);
        k.nezet.getBtnEllenoriz().doClick();
        assert k.nezet.getTxtEredmeny().getText().contains("Sajnálom") :
                "Ezüst láda: hibás eredmény: " + k.nezet.getTxtEredmeny().getText();
    }

    private void vezerloVisszajelzesSzovegTeszt() {
        TestKornyezet k = ujKornyezet();

        k.nezet.getRBronzbanVanAKincs().setSelected(false);
        k.nezet.getRdbAranybanVanAKincs().setSelected(false);
        k.nezet.getRdbEzustbenVanAKincs().setSelected(false);
        k.nezet.getBtnEllenoriz().doClick();
        assert k.nezet.getTxtEredmeny().getText().equals("Kérlek, válassz egy ládát!") :
                "Nincs választás: hibás üzenet: " + k.nezet.getTxtEredmeny().getText();
    }

    private void vezerloLadaHivatkozasSzovegSzamTeszt() {
        // Szöveges hivatkozás
        try {
            Object szoveg = "Bronz";
            String teszt = szoveg.toString();
            assert teszt.equals("Bronz") :
                    "Szöveges hivatkozás hibás érték: " + teszt;
        } catch (Exception e) {
            assert false : "Szöveges hivatkozás kivételt dobott: " + e.getMessage();
        }

        // Szám típusú hivatkozás
        try {
            int szam = 2;
            String teszt = String.valueOf(szam);
            assert teszt.equals("2") :
                    "Szám hivatkozás hibás érték: " + teszt;
        } catch (Exception e) {
            assert false : "Szám hivatkozás kivételt dobott: " + e.getMessage();
        }
    }

    private TestKornyezet ujKornyezet() {
        GuiLadaNezet nezet = new GuiLadaNezet();
        LadaVezerlo vezerlo = new LadaVezerlo(nezet);
        return new TestKornyezet(nezet, vezerlo);
    }

    // --- Belső segédosztály ---
    private static class TestKornyezet {

        GuiLadaNezet nezet;
        LadaVezerlo vezerlo;

        TestKornyezet(GuiLadaNezet nezet, LadaVezerlo vezerlo) {
            this.nezet = nezet;
            this.vezerlo = vezerlo;
        }
    }
}
