
package Proyecto1.OS.Cariaco.Ceballos;

import javax.swing.JOptionPane;


public class Interfaz2 extends javax.swing.JFrame {

    public Interfaz2() {
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

        jPanel1 = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        VolverBTN = new javax.swing.JButton();
        NarrativaField = new javax.swing.JTextField();
        Subtitulo1 = new javax.swing.JLabel();
        NivelesField = new javax.swing.JTextField();
        LogicaField = new javax.swing.JTextField();
        DLCField = new javax.swing.JTextField();
        JuegosSinDLCField = new javax.swing.JTextField();
        JuegosConDLCField = new javax.swing.JTextField();
        NarrativaTXT = new javax.swing.JLabel();
        NivelesTXT = new javax.swing.JLabel();
        LogicaTXT = new javax.swing.JLabel();
        DLCTXT = new javax.swing.JLabel();
        JuegosSinDLCTXT = new javax.swing.JLabel();
        JuegosConDLCTXT = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Titulo.setText("Square Enix");
        jPanel1.add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, -1, -1));

        VolverBTN.setText("Volver");
        VolverBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverBTNActionPerformed(evt);
            }
        });
        jPanel1.add(VolverBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, -1, -1));

        NarrativaField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NarrativaFieldActionPerformed(evt);
            }
        });
        jPanel1.add(NarrativaField, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 50, -1));

        Subtitulo1.setText("Producción");
        jPanel1.add(Subtitulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, -1, -1));

        NivelesField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NivelesFieldActionPerformed(evt);
            }
        });
        jPanel1.add(NivelesField, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 50, -1));
        jPanel1.add(LogicaField, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 50, -1));
        jPanel1.add(DLCField, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 50, -1));
        jPanel1.add(JuegosSinDLCField, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 50, -1));
        jPanel1.add(JuegosConDLCField, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 50, -1));

        NarrativaTXT.setText("Narrativa");
        jPanel1.add(NarrativaTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        NivelesTXT.setText("Niveles");
        jPanel1.add(NivelesTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, -1));

        LogicaTXT.setText("Lógica");
        jPanel1.add(LogicaTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

        DLCTXT.setText("DLC");
        jPanel1.add(DLCTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, -1));

        JuegosSinDLCTXT.setText("Juegos sin DLC");
        jPanel1.add(JuegosSinDLCTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        JuegosConDLCTXT.setText("Juegos con DLC");
        jPanel1.add(JuegosConDLCTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Square Enix1.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 420));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VolverBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverBTNActionPerformed
        try{
        Interfaz1 v1= new Interfaz1();
        v1.setVisible(true);
        this.dispose();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Hubo un error. Por favor, inténtelo de nuevo");
        }
    }//GEN-LAST:event_VolverBTNActionPerformed

    private void NarrativaFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NarrativaFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NarrativaFieldActionPerformed

    private void NivelesFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NivelesFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NivelesFieldActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interfaz2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField DLCField;
    private javax.swing.JLabel DLCTXT;
    private javax.swing.JTextField JuegosConDLCField;
    private javax.swing.JLabel JuegosConDLCTXT;
    private javax.swing.JTextField JuegosSinDLCField;
    private javax.swing.JLabel JuegosSinDLCTXT;
    private javax.swing.JTextField LogicaField;
    private javax.swing.JLabel LogicaTXT;
    private javax.swing.JTextField NarrativaField;
    private javax.swing.JLabel NarrativaTXT;
    private javax.swing.JTextField NivelesField;
    private javax.swing.JLabel NivelesTXT;
    private javax.swing.JLabel Subtitulo1;
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton VolverBTN;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
