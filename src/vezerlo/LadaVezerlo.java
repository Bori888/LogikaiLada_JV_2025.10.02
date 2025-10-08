package vezerlo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import nezet.GuiLadaNezet;

public class LadaVezerlo {

    private GuiLadaNezet nezet;

    public LadaVezerlo(GuiLadaNezet nezet) {
        this.nezet = nezet;
        init();
    }

    private void init() {
        nezet.getBtnEllenoriz().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Itt később lesz az ellenőrzés logikája
                System.out.println("Ellenőrzés gomb megnyomva (még nincs logika)");
            }
        });
    }
}
