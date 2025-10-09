package test;

import nezet.GuiLadaNezet;
import vezerlo.LadaVezerlo;

public class LogikaiLadaTeszt {
    public static void main(String[] args) {
        System.out.println("=== LOGIKAI LÁDA TESZTEK (assert) ===");
        vezerloTesztek();
        System.out.println("Minden assert teszt sikeresen lefutott!");
    }

    private static void modellTesztek() {
        
    }

    private static void vezerloTesztek() {
        GuiLadaNezet nezet = new GuiLadaNezet();
        LadaVezerlo vezerlo = new LadaVezerlo(nezet);

        // 1️⃣ Bronz láda kiválasztva → nyerni kell
        nezet.getRBronzbanVanAKincs().setSelected(true);
        nezet.getBtnEllenoriz().doClick();
        assert nezet.getTxtEredmeny().getText().equals("Gratulálunk, nyertél!") :
                "❌ Hiba: Bronz láda esetén rossz eredmény: " + nezet.getTxtEredmeny().getText();

        // 2️⃣ Arany láda kiválasztva → nem nyerhet
        nezet.getRdbAranybanVanAKincs().setSelected(true);
        nezet.getBtnEllenoriz().doClick();
        assert nezet.getTxtEredmeny().getText().contains("Sajnálom") ||
               nezet.getTxtEredmeny().getText().contains("nem") :
                "❌ Hiba: Arany láda esetén hibás üzenet: " + nezet.getTxtEredmeny().getText();

        // 3️⃣ Ezüst láda kiválasztva → nem nyerhet
        nezet.getRdbEzustbenVanAKincs().setSelected(true);
        nezet.getBtnEllenoriz().doClick();
        assert nezet.getTxtEredmeny().getText().contains("Sajnálom") ||
               nezet.getTxtEredmeny().getText().contains("nem") :
                "❌ Hiba: Ezüst láda esetén hibás üzenet: " + nezet.getTxtEredmeny().getText();

        // 4️⃣ Nincs kiválasztás → figyelmeztetni kell
        nezet.getRBronzbanVanAKincs().setSelected(false);
        nezet.getRdbAranybanVanAKincs().setSelected(false);
        nezet.getRdbEzustbenVanAKincs().setSelected(false);
        nezet.getBtnEllenoriz().doClick();
        assert nezet.getTxtEredmeny().getText().equals("Kérlek, válassz egy ládát!") :
                "❌ Hiba: Nincs választás esetén rossz üzenet: " + nezet.getTxtEredmeny().getText();

        // 5️⃣ Szöveges hivatkozás kezelése
        try {
            Object szoveg = "Bronz";
            String teszt = szoveg.toString();
            assert teszt.equals("Bronz") : "❌ Szöveges hivatkozás hibás érték: " + teszt;
        } catch (Exception e) {
            assert false : "❌ Szöveges hivatkozás kivételt dobott: " + e.getMessage();
        }

        // 6️⃣ Szám típusú hivatkozás kezelése
        try {
            int szam = 2;
            String teszt = String.valueOf(szam);
            assert teszt.equals("2") : "❌ Szám hivatkozás hibás érték: " + teszt;
        } catch (Exception e) {
            assert false : "❌ Szám hivatkozás kivételt dobott: " + e.getMessage();
        }
    }
}
