
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ncom;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Adriana
 */
public class OB extends javax.swing.JFrame {

    /**
     * Creates new form EDT
     */
    public OB() {
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

        jLabel3 = new javax.swing.JLabel();
        jLabelNcom = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        numero1 = new javax.swing.JTextField();
        numero2 = new javax.swing.JTextField();
        resultado = new javax.swing.JTextField();
        btn_sumar = new javax.swing.JButton();
        btn_restar = new javax.swing.JButton();
        btn_multiplicar = new javax.swing.JButton();
        btn_dividir = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabelFondoRojo = new javax.swing.JLabel();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelNcom.setFont(new java.awt.Font("ISOCPEUR", 1, 30)); // NOI18N
        jLabelNcom.setText("OPERACIONES BÁSICAS");
        getContentPane().add(jLabelNcom, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, 40));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Primer número a operar: ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Segundo número a operar:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, 20));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Resultado:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 100, -1));

        numero1.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        numero1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero1ActionPerformed(evt);
            }
        });
        getContentPane().add(numero1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 170, -1));

        numero2.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        numero2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero2ActionPerformed(evt);
            }
        });
        getContentPane().add(numero2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 170, -1));

        resultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultadoActionPerformed(evt);
            }
        });
        getContentPane().add(resultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, 170, 30));

        btn_sumar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn_sumar.setText("SUMAR");
        btn_sumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sumarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_sumar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 110, -1));

        btn_restar.setText("RESTAR");
        btn_restar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_restarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_restar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 110, -1));

        btn_multiplicar.setText("MULTIPLICAR");
        btn_multiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_multiplicarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_multiplicar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, -1, -1));

        btn_dividir.setText("DIVIDIR");
        btn_dividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dividirActionPerformed(evt);
            }
        });
        getContentPane().add(btn_dividir, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, 110, -1));

        jButton1.setText("ATRAS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flecha.png"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("ISOCPEUR", 1, 44)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("[NCOM]");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(23, 23, 23))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 50));

        jLabelFondoRojo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoRojo2.png"))); // NOI18N
        jLabelFondoRojo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabelFondoRojo.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                jLabelFondoRojoComponentAdded(evt);
            }
        });
        getContentPane().add(jLabelFondoRojo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public class OperacionesBasicas{
        
        public void sumaResta(boolean b0) {
            String nro1 = numero1.getText();
            String nro2 = numero2.getText();
            parser pars = new parser(nro1);
            String datos = nro1.substring(1,nro1.length()-1);
            String complejos[] = datos.split(",");

            double parteReal;
            double parteImaginaria;
            boolean tipo;

            Numero num;
            Numero result = new Numero(0,0,false);

            for(int i=0; i<2; i++) { 
            if(i==1){
                pars = new parser(nro2);
                datos = nro2.substring(1,nro2.length()-1);
                complejos = datos.split(",");
            }
            parteReal = Double.parseDouble(complejos[0]);
            parteImaginaria = Double.parseDouble(complejos[1]);
            switch (pars.armarNumero()) {
                case 1:
                    {
                        //BINOMICA                 
                        tipo = false;
                        num = new Numero(parteReal,parteImaginaria,tipo);
                        if(b0 || i==0){
                            result.a+=num.a;
                            result.b+=num.b;
                        } else {
                            result.a-=num.a;
                            result.b-=num.b;
                        }
                        break;
                    }
                case 2:
                    {
                        //POLAR
                        tipo = true;
                        num = new Numero(parteReal,parteImaginaria,tipo);
                        num.transformar();
                        num.redondear();
                        if(b0 || i==0){
                            result.a+=num.a;
                            result.b+=num.b;
                        } else {
                            result.a-=num.a;
                            result.b-=num.b;
                        }
                        break;
                    }
                    default:
                        JOptionPane.showMessageDialog( null,
                                "Valor ingresado incorrecto",
                                "Atencion",
                                JOptionPane.WARNING_MESSAGE);
                        break;
                }
            }
            resultado.setText("(" + result.a + "," + result.b + ")");
        }
        
        public void multiplicaDivide(boolean b0) {
            String nro1 = numero1.getText();
            String nro2 = numero2.getText();
            parser pars = new parser(nro1);
            String datos = nro1.substring(1,nro1.length()-1);
            String complejos[] = datos.split(",");

            double parteReal;
            double parteImaginaria;
            boolean tipo;

            Numero num;
            Numero result = new Numero(0,0,false);

            for(int i=0; i<2; i++) { 
            if(i==1){
                pars = new parser(nro2);
                datos = nro2.substring(1,nro2.length()-1);
                complejos = datos.split(",");
            }
            parteReal = Double.parseDouble(complejos[0]);
            parteImaginaria = Double.parseDouble(complejos[1]);
            switch (pars.armarNumero()) {
                case 1:
                    {
                        //BINOMICA                 
                        tipo = false;
                        num = new Numero(parteReal,parteImaginaria,tipo);
                        num.transformar();
                        num.redondear();
                        if(i==0){
                            result.a+=num.a;
                            result.b+=num.b;
                        } 
                        if(i==1 && b0){
                            result.a*=num.a;
                            result.b+=num.b;
                        } if(i==1 && !b0){
                            result.a/=num.a;
                            result.b-=num.b;
                        }
                        break;
                    }
                case 2:
                    {
                        //POLAR
                        tipo = true;
                        num = new Numero(parteReal,parteImaginaria,tipo);
                        
                        if(i==0){
                            result.a+=num.a;
                            result.b+=num.b;
                        } if(i==1 && b0){
                            result.a*=num.a;
                            result.b+=num.b;
                        } if(i==1 && !b0){
                            result.a/=num.a;
                            result.b-=num.b;
                        }
                        break;
                    }
                    default:
                        JOptionPane.showMessageDialog( null,
                                "Valor ingresado incorrecto",
                                "Atencion",
                                JOptionPane.WARNING_MESSAGE);
                        break;
                }
            }
            resultado.setText("[" + result.a + "," + result.b + "]");
        }
    }
    
    private void btn_sumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sumarActionPerformed

        OperacionesBasicas sumar = new OperacionesBasicas();
        sumar.sumaResta(true);
    }//GEN-LAST:event_btn_sumarActionPerformed

    private void numero1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numero1ActionPerformed

    private void numero2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numero2ActionPerformed

    private void jLabelFondoRojoComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jLabelFondoRojoComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelFondoRojoComponentAdded

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Main menu = new Main();
        menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseClicked

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_formKeyPressed

    private void btn_restarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_restarActionPerformed

        OperacionesBasicas sumar = new OperacionesBasicas();
        sumar.sumaResta(false);
    }//GEN-LAST:event_btn_restarActionPerformed

    private void btn_multiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_multiplicarActionPerformed
        OperacionesBasicas sumar = new OperacionesBasicas();
        sumar.multiplicaDivide(true);
    }//GEN-LAST:event_btn_multiplicarActionPerformed

    private void resultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_resultadoActionPerformed

    private void btn_dividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dividirActionPerformed
        OperacionesBasicas sumar = new OperacionesBasicas();
        sumar.multiplicaDivide(false);
    }//GEN-LAST:event_btn_dividirActionPerformed

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
            java.util.logging.Logger.getLogger(OB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OB().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_dividir;
    private javax.swing.JButton btn_multiplicar;
    private javax.swing.JButton btn_restar;
    private javax.swing.JButton btn_sumar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelFondoRojo;
    private javax.swing.JLabel jLabelNcom;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField numero1;
    private javax.swing.JTextField numero2;
    private javax.swing.JTextField resultado;
    // End of variables declaration//GEN-END:variables
}