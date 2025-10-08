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
                ellenoriz();
            }
        });
    }

    private void ellenoriz() {
        if (nezet.getRBronzbanVanAKincs().isSelected()) {
            nezet.getTxtEredmeny().setText("Nyertél!");
        } else if (nezet.getRdbAranybanVanAKincs().isSelected() || nezet.getRdbEzustbenVanAKincs().isSelected()) {
            nezet.getTxtEredmeny().setText("Sajnálom, nem abban a ládában van a kincs.");
        } else {
            nezet.getTxtEredmeny().setText("Válassz egy ládát!");
        }
    }
}
