package test;

import modell.LadaModell;
import nezet.GuiLadaNezet;
import vezerlo.LadaVezerlo;

public class LogikaiLadaTeszt {

    public static void main(String[] args) {
        System.out.println("+-----[ LOGIKAI LÁDA TESZTEK (assert) ]-----+");

        LogikaiLadaTeszt teszt = new LogikaiLadaTeszt();
<<<<<<< HEAD
        teszt.ossztesztVezerloBori();//Bori csinálja
        modellTesztekAndras();//András csinálja
        
=======
        teszt.ossztesztVezerloBori();
        modellTesztekAndras();

>>>>>>> b70ef45ddb52224092e9ce4be2191385cd6a9aca
        System.out.println("Minden vezérlőteszt lefutott!");
    }

    private static void modellTesztekAndras() {
        tesztLadakFelirat();
        tesztHaromLadaEgyKincs();
    }

    private void ossztesztVezerloBori() {
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

        // Hibás adat: 
//        try {
//            k.nezet.getTxtEredmeny().setText("Váratlan láda kiválasztva!");
//            assert k.nezet.getTxtEredmeny().getText().contains("Gratulálunk") :
//                "Hibás adat kezelése: " + k.nezet.getTxtEredmeny().getText();
//        } catch (AssertionError e) {
//            System.out.println("Hibajelzés jól működik (AssertionError): " + e.getMessage());
//        }
//
//        // Hibás adat:
//        try {
//            k.nezet.getTxtEredmeny().setText(null);
//            assert k.nezet.getTxtEredmeny().getText() != null :
//                "Hibás adat kezelése: eredmény mező null!";
//        } catch (AssertionError e) {
//            System.out.println("Hibajelzés jól működik (AssertionError): " + e.getMessage());
//        }
    }

    private void vezerloVisszajelzesSzovegTeszt() {
        TestKornyezet k = ujKornyezet();

        // ✅ Nincs kiválasztás → figyelmeztetés
        k.nezet.getRBronzbanVanAKincs().setSelected(false);
        k.nezet.getRdbAranybanVanAKincs().setSelected(false);
        k.nezet.getRdbEzustbenVanAKincs().setSelected(false);
        k.nezet.getBtnEllenoriz().doClick();
        assert k.nezet.getTxtEredmeny().getText().equals("Kérlek, válassz egy ládát!") :
                "Nincs választás: hibás üzenet: " + k.nezet.getTxtEredmeny().getText();

//        // Hibás adat: üres szöveg szimuláció
//        try {
//            k.nezet.getTxtEredmeny().setText("");
//            assert !k.nezet.getTxtEredmeny().getText().isEmpty() :
//                "Hibás adat kezelése: üres szöveg!";
//        } catch (AssertionError e) {
//            System.out.println("Hibajelzés jól működik (AssertionError): " + e.getMessage());
//        }
    }

    private void vezerloLadaHivatkozasSzovegSzamTeszt() {
        // Szöveges
        try {
            Object szoveg = "Bronz";
            String teszt = szoveg.toString();
            assert teszt.equals("Bronz") : "Szöveges hivatkozás hibás érték: " + teszt;
        } catch (Exception e) {
            assert false : "Szöveges hivatkozás kivételt dobott: " + e.getMessage();
        }

        //Szám 
        try {
            int szam = 2;
            String teszt = String.valueOf(szam);
            assert teszt.equals("2") : "Szám hivatkozás hibás érték: " + teszt;
        } catch (Exception e) {
            assert false : "Szám hivatkozás kivételt dobott: " + e.getMessage();
        }

        // Hibás adat: null hivatkozás
//        try {
//            Object nulla = null;
//            String teszt = String.valueOf(nulla);
//            assert teszt.equals("null") : "Hibás adat kezelése: " + teszt;
//        } catch (AssertionError e) {
//            System.out.println("Hibajelzés jól működik (AssertionError): " + e.getMessage());
//        } catch (Exception e) {
//            System.out.println("Kivétel a hibás adat kezelésnél: " + e.getMessage());
//        }
    }

    private TestKornyezet ujKornyezet() {
        GuiLadaNezet nezet = new GuiLadaNezet();
        LadaVezerlo vezerlo = new LadaVezerlo(nezet);
        return new TestKornyezet(nezet, vezerlo);
    }


    private static class TestKornyezet {

        GuiLadaNezet nezet;
        LadaVezerlo vezerlo;

        TestKornyezet(GuiLadaNezet nezet, LadaVezerlo vezerlo) {
            this.nezet = nezet;
            this.vezerlo = vezerlo;
        }
    }

    private static void tesztLadakFelirat() {
        GuiLadaNezet nezet = new GuiLadaNezet();
        new LadaVezerlo(nezet);
        String aranyFelirat = nezet.getLblAranyLadaLeiras().getText();
        String ezustFelirat = nezet.getLblEzustLadaLeiras().getText();
        String bronzFelirat = nezet.getLblBronzLadaLeiras().getText();

        assert aranyFelirat.contains("Én rejtem a kincset") : "Arany felirat hibás: " + aranyFelirat;
        assert ezustFelirat.contains("Nem én rejtem a kincset") : "Ezüst felirat hibás: " + ezustFelirat;
        assert bronzFelirat.contains("Az arany láda hazudik") : "Bronz felirat hibás: " + bronzFelirat;
    }

    private static void tesztHaromLadaEgyKincs() {
<<<<<<< HEAD
        
=======
        GuiLadaNezet nezet = new GuiLadaNezet();
        new LadaVezerlo(nezet);

        int ladaDarab = 0;
        if (nezet.getLblAranyLadaLeiras() != null) {
            ladaDarab++;
        }
        if (nezet.getLblEzustLadaLeiras() != null) {
            ladaDarab++;
        }
        if (nezet.getLblBronzLadaLeiras() != null) {
            ladaDarab++;
        }
        assert ladaDarab == 3 : "Nem 3 láda van, hanem: " + ladaDarab;

        int nyertesDb = 0;

        nezet.getRdbAranybanVanAKincs().setSelected(true);
        nezet.getBtnEllenoriz().doClick();
        if (nezet.getTxtEredmeny().getText().contains("Gratulálunk")) {
            nyertesDb++;
        }

        nezet.getRdbEzustbenVanAKincs().setSelected(true);
        nezet.getBtnEllenoriz().doClick();
        if (nezet.getTxtEredmeny().getText().contains("Gratulálunk")) {
            nyertesDb++;
        }

        nezet.getRBronzbanVanAKincs().setSelected(true);
        nezet.getBtnEllenoriz().doClick();
        if (nezet.getTxtEredmeny().getText().contains("Gratulálunk")) {
            nyertesDb++;
        }

        assert nyertesDb == 1 : "A kincses (nyertes) ládák száma nem 1, hanem: " + nyertesDb;
>>>>>>> b70ef45ddb52224092e9ce4be2191385cd6a9aca
    }
}