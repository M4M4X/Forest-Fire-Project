package pAccueil;

/**
 *
 * @author maxim
 */
public class pAccueil extends javax.swing.JPanel {

    /**
     * Creates new form pAccueil
     */
    public pAccueil() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pAccueil = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1300, 700));
        setMinimumSize(new java.awt.Dimension(1300, 700));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Maxime INNOCENTI & Antoine HENRIET");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 580, 1300, 120));

        jLabel2.setFont(new java.awt.Font("Cambria", 1, 50)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("PROJET SIMULATION FEU DE FORET");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 140));

        pAccueil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pAccueil/Foret nv.png"))); // NOI18N
        pAccueil.setPreferredSize(new java.awt.Dimension(1300, 730));
        add(pAccueil, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 700));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel pAccueil;
    // End of variables declaration//GEN-END:variables
}