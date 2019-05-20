/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ncom;

import java.awt.Image;
import java.awt.Toolkit;
/**
 *
 * @author Adriana
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form EDT
     */
    public Main() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    @Override
    public Image getIconImage(){
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/utn.jpeg"));
        return retValue;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        EDT = new javax.swing.JButton();
        OB = new javax.swing.JButton();
        OA = new javax.swing.JButton();
        SF = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabelFondo = new javax.swing.JLabel();
        jLabelNcom = new javax.swing.JLabel();
        jLabelFondo2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        EDT.setText("TRANSFORMACIONES");
        EDT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EDTMouseClicked(evt);
            }
        });
        EDT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EDTActionPerformed(evt);
            }
        });
        getContentPane().add(EDT, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 185, 50));

        OB.setText("OPERACIONES BASICAS");
        OB.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        OB.setPreferredSize(new java.awt.Dimension(150, 25));
        OB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OBMouseClicked(evt);
            }
        });
        getContentPane().add(OB, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 180, 185, 50));

        OA.setText("OPERACIONES AVANZADAS");
        OA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OAActionPerformed(evt);
            }
        });
        getContentPane().add(OA, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 185, 50));

        SF.setText("SUMA DE FASORES");
        getContentPane().add(SF, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 250, 185, 50));

        jButton5.setText("EXIT");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 370, -1, -1));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/utn2.png"))); // NOI18N
        jLabelFondo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, -1));

        jLabelNcom.setFont(new java.awt.Font("ISOCPEUR", 1, 40)); // NOI18N
        jLabelNcom.setText("[NCOM]");
        getContentPane().add(jLabelNcom, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, -1, 40));

        jLabelFondo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoRojo.png"))); // NOI18N
        jLabelFondo2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabelFondo2.setMaximumSize(new java.awt.Dimension(400, 420));
        jLabelFondo2.setMinimumSize(new java.awt.Dimension(400, 420));
        jLabelFondo2.setPreferredSize(new java.awt.Dimension(400, 420));
        getContentPane().add(jLabelFondo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EDTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EDTActionPerformed
        
        
    }//GEN-LAST:event_EDTActionPerformed

    private void EDTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EDTMouseClicked
       EDT edt = new EDT();
       edt.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_EDTMouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void OBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OBMouseClicked
       OB ob = new OB();
       ob.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_OBMouseClicked

    private void OAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OAActionPerformed
       OA oa = new OA();
       oa.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_OAActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EDT;
    private javax.swing.JButton OA;
    private javax.swing.JButton OB;
    private javax.swing.JButton SF;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelFondo2;
    private javax.swing.JLabel jLabelNcom;
    // End of variables declaration//GEN-END:variables
}
