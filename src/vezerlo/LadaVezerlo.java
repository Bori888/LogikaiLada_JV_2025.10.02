package vezerlo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import nezet.GuiLadaNezet;

public class LadaVezerlo {

    private GuiLadaNezet nezet;

    // Üzenetek konstansokként, hogy a teszt is ugyanazt használja
    public static final String UZENET_NYERT = "Gratulálunk, nyertél!";
    public static final String UZENET_NEM_NYERT = "Sajnálom, nem abban a ládában van a kincs.";
    public static final String UZENET_VALASSZ = "Kérlek, válassz egy ládát!";

    public LadaVezerlo(GuiLadaNezet nezet) {
        this.nezet = nezet;
        init();
    }

    private void init() {
        nezet.getBtnEllenoriz().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ellenoriz();
            }
        });
    }

    private void ellenoriz() {
        if (nezet.getRBronzbanVanAKincs().isSelected()) {
            nezet.getTxtEredmeny().setText(UZENET_NYERT);
        } else if (nezet.getRdbAranybanVanAKincs().isSelected() ||
                   nezet.getRdbEzustbenVanAKincs().isSelected()) {
            nezet.getTxtEredmeny().setText(UZENET_NEM_NYERT);
        } else {
            nezet.getTxtEredmeny().setText(UZENET_VALASSZ);
        }
    }
}
