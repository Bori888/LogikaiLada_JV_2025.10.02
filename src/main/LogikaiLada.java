package main;

import nezet.GuiLadaNezet;
import vezerlo.LadaVezerlo;

public class LogikaiLada {

    public static void main(String[] args) {
        GuiLadaNezet nezet = new GuiLadaNezet();
        new LadaVezerlo(nezet);
        nezet.setVisible(true);
    }
}
