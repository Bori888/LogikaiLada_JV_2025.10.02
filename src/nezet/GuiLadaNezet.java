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
        pnlAranyLada = new javax.swing.JPanel();
        pnlBronzLada = new javax.swing.JPanel();
        pnlEzustLada = new javax.swing.JPanel();
        lblAranyLadaLeiras = new javax.swing.JLabel();
        lblEzustLadaLeiras = new javax.swing.JLabel();
        lblBronzLadaLeiras = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        rdbEzustbenVanAKincs = new javax.swing.JRadioButton();
        rdbAranybanVanAKincs = new javax.swing.JRadioButton();
        rBronzbanVanAKincs = new javax.swing.JRadioButton();
        txtEredmeny = new javax.swing.JTextField();
        btnElenoriz = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Logikai Láda - Hol a kincs?");
        setResizable(false);

        txtaFeladatLeiras.setEditable(false);
        txtaFeladatLeiras.setColumns(20);
        txtaFeladatLeiras.setRows(5);
        txtaFeladatLeiras.setText("Feladatleírás:\n\n3 ládából kell választani, hogy melyikben van a kincs\nMind a 3 ládán 3 felirat van\nCsak az egyik láda az igaz láda");
        jScrollPane1.setViewportView(txtaFeladatLeiras);

        pnlAranyLada.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Arany"));

        javax.swing.GroupLayout pnlAranyLadaLayout = new javax.swing.GroupLayout(pnlAranyLada);
        pnlAranyLada.setLayout(pnlAranyLadaLayout);
        pnlAranyLadaLayout.setHorizontalGroup(
            pnlAranyLadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        pnlAranyLadaLayout.setVerticalGroup(
            pnlAranyLadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        pnlBronzLada.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Bronz"));

        javax.swing.GroupLayout pnlBronzLadaLayout = new javax.swing.GroupLayout(pnlBronzLada);
        pnlBronzLada.setLayout(pnlBronzLadaLayout);
        pnlBronzLadaLayout.setHorizontalGroup(
            pnlBronzLadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        pnlBronzLadaLayout.setVerticalGroup(
            pnlBronzLadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        pnlEzustLada.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Ezüst"));

        javax.swing.GroupLayout pnlEzustLadaLayout = new javax.swing.GroupLayout(pnlEzustLada);
        pnlEzustLada.setLayout(pnlEzustLadaLayout);
        pnlEzustLadaLayout.setHorizontalGroup(
            pnlEzustLadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        pnlEzustLadaLayout.setVerticalGroup(
            pnlEzustLadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        lblAranyLadaLeiras.setText("Én rejtem a kincset");

        lblEzustLadaLeiras.setText("Nem én rejtem a kincset");

        lblBronzLadaLeiras.setText("Az arany láda hazudik");

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
                .addContainerGap()
                .addComponent(rdbAranybanVanAKincs)
                .addGap(18, 18, 18)
                .addComponent(rdbEzustbenVanAKincs)
                .addGap(20, 20, 20)
                .addComponent(rBronzbanVanAKincs)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(rdbAranybanVanAKincs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rBronzbanVanAKincs)
                        .addComponent(rdbEzustbenVanAKincs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        txtEredmeny.setText("Eredmény");

        btnElenoriz.setText("Ellenőriz");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnlAranyLada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAranyLadaLeiras))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEzustLadaLeiras)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(pnlEzustLada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(pnlBronzLada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblBronzLadaLeiras))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtEredmeny, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnElenoriz)
                        .addGap(23, 23, 23))
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlAranyLada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlBronzLada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlEzustLada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAranyLadaLeiras)
                    .addComponent(lblEzustLadaLeiras)
                    .addComponent(lblBronzLadaLeiras))
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEredmeny, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnElenoriz))
                .addContainerGap(16, Short.MAX_VALUE))
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

    public javax.swing.JTextField getTxtEredmeny() {
        return txtEredmeny;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnElenoriz;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAranyLadaLeiras;
    private javax.swing.JLabel lblBronzLadaLeiras;
    private javax.swing.JLabel lblEzustLadaLeiras;
    private javax.swing.JPanel pnlAranyLada;
    private javax.swing.JPanel pnlBronzLada;
    private javax.swing.JPanel pnlEzustLada;
    private javax.swing.JRadioButton rBronzbanVanAKincs;
    private javax.swing.JRadioButton rdbAranybanVanAKincs;
    private javax.swing.JRadioButton rdbEzustbenVanAKincs;
    private javax.swing.JTextField txtEredmeny;
    private javax.swing.JTextArea txtaFeladatLeiras;
    // End of variables declaration//GEN-END:variables

    
}
