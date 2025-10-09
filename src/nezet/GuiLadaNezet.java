package nezet;

public class GuiLadaNezet extends javax.swing.JFrame {

    public GuiLadaNezet() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtaFeladatLeiras = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        rdbEzustbenVanAKincs = new javax.swing.JRadioButton();
        rdbAranybanVanAKincs = new javax.swing.JRadioButton();
        rBronzbanVanAKincs = new javax.swing.JRadioButton();
        btnElenoriz = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        pnlBronzLada = new javax.swing.JPanel();
        lblBronzLadaKep = new javax.swing.JLabel();
        pnlAranyLada = new javax.swing.JPanel();
        lblAranyLadaKep = new javax.swing.JLabel();
        pnlEzustLada = new javax.swing.JPanel();
        lblEzustLadaKep = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblEzustLadaLeiras = new javax.swing.JLabel();
        lblAranyLadaLeiras = new javax.swing.JLabel();
        lblBronzLadaLeiras = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txtEredmeny = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kincses láda - Hol a kincs?");
        setResizable(false);

        txtaFeladatLeiras.setEditable(false);
        txtaFeladatLeiras.setColumns(20);
        txtaFeladatLeiras.setRows(5);
        txtaFeladatLeiras.setText("Feladatleírás:\n\n3 ládából kell választani, hogy melyikben van a kincs\nMind a 3 ládán 3 felirat van\nCsak az egyik láda az igaz láda");
        jScrollPane1.setViewportView(txtaFeladatLeiras);

        buttonGroup1.add(rdbEzustbenVanAKincs);
        rdbEzustbenVanAKincs.setText("Ezüstben van a kincs");

        buttonGroup1.add(rdbAranybanVanAKincs);
        rdbAranybanVanAKincs.setText("Aranyban van a kincs");

        buttonGroup1.add(rBronzbanVanAKincs);
        rBronzbanVanAKincs.setText("Bronzban van a kincs");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(rdbAranybanVanAKincs)
                .addGap(52, 52, 52)
                .addComponent(rdbEzustbenVanAKincs)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rBronzbanVanAKincs)
                .addGap(24, 24, 24))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rdbAranybanVanAKincs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rdbEzustbenVanAKincs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(rBronzbanVanAKincs))
                .addContainerGap())
        );

        btnElenoriz.setText("Ellenőriz");

        pnlBronzLada.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Bronz"));

        lblBronzLadaKep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nezet/bronz_lada.png"))); // NOI18N

        javax.swing.GroupLayout pnlBronzLadaLayout = new javax.swing.GroupLayout(pnlBronzLada);
        pnlBronzLada.setLayout(pnlBronzLadaLayout);
        pnlBronzLadaLayout.setHorizontalGroup(
            pnlBronzLadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBronzLadaLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblBronzLadaKep)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        pnlBronzLadaLayout.setVerticalGroup(
            pnlBronzLadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBronzLadaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblBronzLadaKep)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlAranyLada.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Arany"));

        lblAranyLadaKep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nezet/arany_lada.png"))); // NOI18N

        javax.swing.GroupLayout pnlAranyLadaLayout = new javax.swing.GroupLayout(pnlAranyLada);
        pnlAranyLada.setLayout(pnlAranyLadaLayout);
        pnlAranyLadaLayout.setHorizontalGroup(
            pnlAranyLadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAranyLadaLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lblAranyLadaKep)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        pnlAranyLadaLayout.setVerticalGroup(
            pnlAranyLadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAranyLadaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAranyLadaKep)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlEzustLada.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Ezüst"));

        lblEzustLadaKep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nezet/ezust_lada.png"))); // NOI18N

        javax.swing.GroupLayout pnlEzustLadaLayout = new javax.swing.GroupLayout(pnlEzustLada);
        pnlEzustLada.setLayout(pnlEzustLadaLayout);
        pnlEzustLadaLayout.setHorizontalGroup(
            pnlEzustLadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEzustLadaLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lblEzustLadaKep)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        pnlEzustLadaLayout.setVerticalGroup(
            pnlEzustLadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEzustLadaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblEzustLadaKep)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblEzustLadaLeiras.setText("Nem én rejtem a kincset");

        lblAranyLadaLeiras.setText("Én rejtem a kincset");

        lblBronzLadaLeiras.setText("Az arany láda hazudik");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblAranyLadaLeiras)
                .addGap(75, 75, 75)
                .addComponent(lblEzustLadaLeiras)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblBronzLadaLeiras)
                .addGap(26, 26, 26))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBronzLadaLeiras)
                    .addComponent(lblEzustLadaLeiras)
                    .addComponent(lblAranyLadaLeiras))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pnlAranyLada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(pnlEzustLada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 41, Short.MAX_VALUE)
                        .addComponent(pnlBronzLada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(pnlEzustLada, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlBronzLada, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlAranyLada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Visszajelzés:"));

        txtEredmeny.setText("Eredmény");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtEredmeny, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtEredmeny)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnElenoriz)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnElenoriz)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // --- Getters, hogy a vezérlő elérje az elemeket ---
    public javax.swing.JButton getBtnEllenoriz() {
        return btnElenoriz;
    }

    public javax.swing.JRadioButton getRdbAranybanVanAKincs() {
        return rdbAranybanVanAKincs;
    }

    public javax.swing.JRadioButton getRdbEzustbenVanAKincs() {
        return rdbEzustbenVanAKincs;
    }

    public javax.swing.JRadioButton getRBronzbanVanAKincs() {
        return rBronzbanVanAKincs;
    }

    public javax.swing.JLabel getTxtEredmeny() {
        return txtEredmeny;
    }
    
    /* Teszteléshez */
    public javax.swing.JLabel getLblAranyLadaLeiras() {
        return lblAranyLadaLeiras;
    }

    public javax.swing.JLabel getLblEzustLadaLeiras() {
        return lblEzustLadaLeiras;
    }

    public javax.swing.JLabel getLblBronzLadaLeiras() {
        return lblBronzLadaLeiras;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnElenoriz;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAranyLadaKep;
    private javax.swing.JLabel lblAranyLadaLeiras;
    private javax.swing.JLabel lblBronzLadaKep;
    private javax.swing.JLabel lblBronzLadaLeiras;
    private javax.swing.JLabel lblEzustLadaKep;
    private javax.swing.JLabel lblEzustLadaLeiras;
    private javax.swing.JPanel pnlAranyLada;
    private javax.swing.JPanel pnlBronzLada;
    private javax.swing.JPanel pnlEzustLada;
    private javax.swing.JRadioButton rBronzbanVanAKincs;
    private javax.swing.JRadioButton rdbAranybanVanAKincs;
    private javax.swing.JRadioButton rdbEzustbenVanAKincs;
    private javax.swing.JLabel txtEredmeny;
    private javax.swing.JTextArea txtaFeladatLeiras;
    // End of variables declaration//GEN-END:variables

}
