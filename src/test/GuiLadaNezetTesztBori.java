package test;

import nezet.GuiLadaNezet;

import javax.swing.*;

public class GuiLadaNezetTesztBori {

    public static void main(String[] args) {
        System.out.println("+-----[ GUI LÁDA NÉZET TESZTEK ]-----+");
        GuiLadaNezetTesztBori teszt = new GuiLadaNezetTesztBori();
        teszt.ossztesztNezet();
        System.out.println("Minden nézetteszt lefutott!");
    }

    private void ossztesztNezet() {
        System.out.println("\n--- Nézet tesztjei futnak ---");
        futtatTeszt("Visszajelzés mező inicializálás", this::nezetEredmenyMezoTeszt);
        futtatTeszt("RadioButton kiválasztás", this::nezetRadioButtonTeszt);
        futtatTeszt("Hibás adat kezelése", this::nezetHibasAdatTeszt);
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

    private void nezetEredmenyMezoTeszt() {
        GuiLadaNezet nezet = ujNezet();
        assert nezet.getTxtEredmeny() != null : "Eredmény mező nem inicializált!";
    }

    private void nezetRadioButtonTeszt() {
        GuiLadaNezet nezet = ujNezet();

        nezet.getRBronzbanVanAKincs().setSelected(true);
        assert nezet.getRBronzbanVanAKincs().isSelected() : "Bronz RadioButton nem lett kiválasztva!";

        nezet.getRdbAranybanVanAKincs().setSelected(true);
        assert nezet.getRdbAranybanVanAKincs().isSelected() : "Arany RadioButton nem lett kiválasztva!";

        nezet.getRdbEzustbenVanAKincs().setSelected(true);
        assert nezet.getRdbEzustbenVanAKincs().isSelected() : "Ezüst RadioButton nem lett kiválasztva!";
    }

    private void nezetHibasAdatTeszt() {
        GuiLadaNezet nezet = ujNezet();

//        //Hibás adat: null érték a JLabel-ben
//        try {
//            nezet.getTxtEredmeny().setText(null);
//            assert nezet.getTxtEredmeny().getText() != null : "Hibás adat kezelése: eredmény mező null!";
//        } catch (AssertionError e) {
//            System.out.println("Hibajelzés jól működik: " + e.getMessage());
//        }
//
//        //Hibás adat: üres szöveg a JLabel-ben
//        try {
//            nezet.getTxtEredmeny().setText("");
//            assert !nezet.getTxtEredmeny().getText().isEmpty() : "Hibás adat kezelése: üres szöveg!";
//        } catch (AssertionError e) {
//            System.out.println("Hibajelzés jól működik: " + e.getMessage());
//        }
//
//        // Hibás adat: RadioButton nincs kiválasztva
//        try {
//            ButtonGroup group = new ButtonGroup();
//            JRadioButton rb1 = new JRadioButton();
//            JRadioButton rb2 = new JRadioButton();
//            group.add(rb1);
//            group.add(rb2);
//            assert rb1.isSelected() || rb2.isSelected() : "Hibás adat kezelése: nincs RadioButton kiválasztva!";
//        } catch (AssertionError e) {
//            System.out.println("Hibajelzés jól működik: " + e.getMessage());
//        }
    }

    private GuiLadaNezet ujNezet() {
        // Mock GUI inicializáció, tényleges ablak nem jelenik meg
        GuiLadaNezet nezet = new GuiLadaNezet();
        nezet.setVisible(false);
        return nezet;
    }
}
