
package Proyecto1.OS.Cariaco.Ceballos;

import java.util.concurrent.Semaphore;

public class Interfaz1 extends javax.swing.JFrame {
    Semaphore mutex = new Semaphore(1);
    
    public Interfaz1() {
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Interfaz2BTN = new javax.swing.JButton();
        Interfaz3BTN = new javax.swing.JButton();
        Titulo = new javax.swing.JLabel();
        NarrativaTitle = new javax.swing.JLabel();
        NivelesTitulo = new javax.swing.JLabel();
        LogicaTitulo = new javax.swing.JLabel();
        DLCTitulo = new javax.swing.JLabel();
        IntegradorTitulo = new javax.swing.JLabel();
        NarrativaTextField = new javax.swing.JTextField();
        NivelesTextField = new javax.swing.JTextField();
        LogicaTextField = new javax.swing.JTextField();
        DLCTextField = new javax.swing.JTextField();
        IntegradorTextField = new javax.swing.JTextField();
        NarrativaBTN = new javax.swing.JButton();
        NivelesBTN = new javax.swing.JButton();
        LogicaBTN = new javax.swing.JButton();
        DLCBTN = new javax.swing.JButton();
        IntegradorBTN = new javax.swing.JButton();
        Subtitulo1 = new javax.swing.JLabel();
        NarrativaProduccion = new javax.swing.JTextField();
        NivelesProduccion = new javax.swing.JTextField();
        LogicaProduccion = new javax.swing.JTextField();
        DLCProduccion = new javax.swing.JTextField();
        IntegradorProduccion = new javax.swing.JTextField();
        Subtitulo2 = new javax.swing.JLabel();
        DuracionDiaTextField = new javax.swing.JTextField();
        DuracionDiaBTN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, -1, -1));

        Interfaz2BTN.setText("Interfaz 2");
        Interfaz2BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Interfaz2BTNActionPerformed(evt);
            }
        });
        getContentPane().add(Interfaz2BTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, -1, -1));

        Interfaz3BTN.setText("Interfaz 3");
        Interfaz3BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Interfaz3BTNActionPerformed(evt);
            }
        });
        getContentPane().add(Interfaz3BTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 400, -1, -1));

        Titulo.setText("Estadísticas");
        getContentPane().add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 70, 10));

        NarrativaTitle.setText("Narrativa");
        getContentPane().add(NarrativaTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, 20));

        NivelesTitulo.setText("Niveles");
        getContentPane().add(NivelesTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        LogicaTitulo.setText("Logica");
        getContentPane().add(LogicaTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        DLCTitulo.setText("DLC");
        getContentPane().add(DLCTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        IntegradorTitulo.setText("Integrador");
        getContentPane().add(IntegradorTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));
        getContentPane().add(NarrativaTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 30, -1));
        getContentPane().add(NivelesTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 30, -1));
        getContentPane().add(LogicaTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 30, -1));
        getContentPane().add(DLCTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 30, -1));
        getContentPane().add(IntegradorTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 30, -1));

        NarrativaBTN.setText("Agregar");
        getContentPane().add(NarrativaBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, -1, -1));

        NivelesBTN.setText("Agregar");
        getContentPane().add(NivelesBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, -1, -1));

        LogicaBTN.setText("Agregar");
        getContentPane().add(LogicaBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, -1, -1));

        DLCBTN.setText("Agregar");
        getContentPane().add(DLCBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, -1, -1));

        IntegradorBTN.setText("Agregar");
        getContentPane().add(IntegradorBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, -1, -1));

        Subtitulo1.setText("Produccion");
        getContentPane().add(Subtitulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, -1, -1));
        getContentPane().add(NarrativaProduccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, 60, -1));
        getContentPane().add(NivelesProduccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 60, -1));
        getContentPane().add(LogicaProduccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 60, -1));
        getContentPane().add(DLCProduccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, 60, -1));
        getContentPane().add(IntegradorProduccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, 60, -1));

        Subtitulo2.setText("Duracion del Dia");
        getContentPane().add(Subtitulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, -1));
        getContentPane().add(DuracionDiaTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, 40, 20));

        DuracionDiaBTN.setText("Cambiar");
        getContentPane().add(DuracionDiaBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Interfaz2BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Interfaz2BTNActionPerformed
        Interfaz2 v2= new Interfaz2();
        v2.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Interfaz2BTNActionPerformed

    private void Interfaz3BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Interfaz3BTNActionPerformed
        Interfaz3 v3= new Interfaz3();
        v3.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Interfaz3BTNActionPerformed

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
            java.util.logging.Logger.getLogger(Interfaz1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DLCBTN;
    private javax.swing.JTextField DLCProduccion;
    private javax.swing.JTextField DLCTextField;
    private javax.swing.JLabel DLCTitulo;
    private javax.swing.JButton DuracionDiaBTN;
    private javax.swing.JTextField DuracionDiaTextField;
    private javax.swing.JButton IntegradorBTN;
    private javax.swing.JTextField IntegradorProduccion;
    private javax.swing.JTextField IntegradorTextField;
    private javax.swing.JLabel IntegradorTitulo;
    private javax.swing.JButton Interfaz2BTN;
    private javax.swing.JButton Interfaz3BTN;
    private javax.swing.JButton LogicaBTN;
    private javax.swing.JTextField LogicaProduccion;
    private javax.swing.JTextField LogicaTextField;
    private javax.swing.JLabel LogicaTitulo;
    private javax.swing.JButton NarrativaBTN;
    private javax.swing.JTextField NarrativaProduccion;
    private javax.swing.JTextField NarrativaTextField;
    private javax.swing.JLabel NarrativaTitle;
    private javax.swing.JButton NivelesBTN;
    private javax.swing.JTextField NivelesProduccion;
    private javax.swing.JTextField NivelesTextField;
    private javax.swing.JLabel NivelesTitulo;
    private javax.swing.JLabel Subtitulo1;
    private javax.swing.JLabel Subtitulo2;
    private javax.swing.JLabel Titulo;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
