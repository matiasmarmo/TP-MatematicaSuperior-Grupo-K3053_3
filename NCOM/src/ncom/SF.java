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
public class SF extends javax.swing.JFrame {

    /**
     * Creates new form EDT
     */
    public SF() {
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
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabelOperaciobesAvanzadas = new javax.swing.JLabel();
        fasor1 = new javax.swing.JTextField();
        fasor2 = new javax.swing.JTextField();
        btn_sumarFasores = new javax.swing.JButton();
        resultado = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabelFondoRojo = new javax.swing.JLabel();

        jLabel3.setText("jLabel3");

        jLabelNcom.setFont(new java.awt.Font("ISOCPEUR", 1, 30)); // NOI18N
        jLabelNcom.setText("TRANSFORMACIONES");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Fasor 1 :");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Fasor 2 :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel7.setText("Nota: los fasores se deben escribir de la forma: ");
        jLabel7.setToolTipText("");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 290, 50));

        jLabel8.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel8.setText("Ejemplos: 3*cos(5t+3.14) ó 5*sen(5t+1.57)");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 290, 20));

        jLabel9.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel9.setText("ó 1*sen(8t+0.78) ó 5*sen(1t+0)");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 210, 20));

        jLabelOperaciobesAvanzadas.setFont(new java.awt.Font("ISOCPEUR", 1, 30)); // NOI18N
        jLabelOperaciobesAvanzadas.setText("SUMA DE FASORES");
        getContentPane().add(jLabelOperaciobesAvanzadas, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, -1, 40));

        fasor1.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        fasor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fasor1ActionPerformed(evt);
            }
        });
        getContentPane().add(fasor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 210, 30));

        fasor2.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        fasor2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fasor2ActionPerformed(evt);
            }
        });
        getContentPane().add(fasor2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 210, 30));

        btn_sumarFasores.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn_sumarFasores.setText("SUMAR FASORES");
        btn_sumarFasores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sumarFasoresActionPerformed(evt);
            }
        });
        getContentPane().add(btn_sumarFasores, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, -1, -1));

        resultado.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        resultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultadoActionPerformed(evt);
            }
        });
        getContentPane().add(resultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, 210, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Resultado : ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, -1));

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
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 50));

        jLabelFondoRojo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoRojo2.png"))); // NOI18N
        jLabelFondoRojo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabelFondoRojo.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                jLabelFondoRojoComponentAdded(evt);
            }
        });
        getContentPane().add(jLabelFondoRojo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
     public class SumarFasores{
        public double amplitud;
        public boolean tipo_onda; // FALSE --> COSENO
                                  // TRUE ---> SENO 
        public double frecuencia;
        public double desfasaje;
        
        SumarFasores(double amplitud,boolean tipo_onda,double frecuencia,double desfasaje) {
            this.amplitud = amplitud;
            this.tipo_onda = tipo_onda;
            this.frecuencia = frecuencia;
            this.desfasaje = desfasaje;
        }
    }
        
    private void btn_sumarFasoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sumarFasoresActionPerformed
        
    String fas1 = fasor1.getText();
    parser pars1 = new parser(fas1,true);
    if(pars1.armarNumero()==0) {
        JOptionPane.showMessageDialog( null,
            "Valor ingresado incorrecto",
            "Atencion",
            JOptionPane.WARNING_MESSAGE);
            return;
    }
    String datos = fas1.substring(0,fas1.length()-1);
    String ampli[]=datos.split("\\*");
    
    String form[]=ampli[1].split("\\(");
    boolean tipo_ond;
    
    if(form[0].equals("cos")){
        tipo_ond = false;
    } else { 
        tipo_ond = true;
    }
    String frec[]=form[1].split("t");
    String desf[]=frec[1].split("\\)");
   
    SumarFasores fasorprim = new SumarFasores(Double.parseDouble(ampli[0]),tipo_ond,Double.parseDouble(frec[0]),Double.parseDouble(desf[0]));
    String fas2 = fasor2.getText();
    parser pars2 = new parser(fas2,true);
    if(pars2.armarNumero()==0) {
        JOptionPane.showMessageDialog( null,
            "Valor ingresado incorrecto",
            "Atencion",
            JOptionPane.WARNING_MESSAGE);
            return;
    }
    String datos2 = fas2.substring(0,fas2.length()-1);
    ampli=datos2.split("\\*");
    form=ampli[1].split("\\(");
    if(form[0].equals("cos")){
        tipo_ond = false;
    } else { 
        tipo_ond = true;
    }
    frec=form[1].split("t");
    desf=frec[1].split("\\)");
            
    SumarFasores fasorseg = new SumarFasores(Double.parseDouble(ampli[0]),tipo_ond,Double.parseDouble(frec[0]),Double.parseDouble(desf[0]));
            
    if(fasorprim.frecuencia == fasorseg.frecuencia){
        if(fasorprim.tipo_onda != fasorseg.tipo_onda){
            if(!fasorprim.tipo_onda) { // coseno es fasorprim
                fasorprim.tipo_onda=true;
                fasorprim.desfasaje+=1.57;
            } else{
                fasorseg.tipo_onda=true;
                fasorseg.desfasaje+=1.57;
            }
        }
        Numero numero1 = new Numero(fasorprim.amplitud,fasorprim.desfasaje,true);
        numero1.transformar();
        Numero numero2 = new Numero(fasorseg.amplitud,fasorseg.desfasaje,true);
        numero2.transformar();
        Numero res = new Numero(numero1.a+numero2.a,numero1.b+numero2.b,false);
        res.transformar();
        res.redondear();
        if(fasorprim.tipo_onda){
            resultado.setText(res.a + "*sen(" + fasorprim.frecuencia + "t + " + res.b + ")");
        } else {
            resultado.setText(res.a + "*cos(" + fasorprim.frecuencia + "t + " + res.b + ")");
        }
    } else{ 
            JOptionPane.showMessageDialog( null,
            "Las frecuencias deben ser identicas",
            "Atencion",
            JOptionPane.WARNING_MESSAGE);
            return;
        }
    }//GEN-LAST:event_btn_sumarFasoresActionPerformed

    
    private void fasor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fasor1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fasor1ActionPerformed

    private void resultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_resultadoActionPerformed

    private void jLabelFondoRojoComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jLabelFondoRojoComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelFondoRojoComponentAdded

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Main menu = new Main();
        menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void fasor2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fasor2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fasor2ActionPerformed

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
            java.util.logging.Logger.getLogger(EDT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EDT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EDT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EDT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EDT().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_sumarFasores;
    private javax.swing.JTextField fasor1;
    private javax.swing.JTextField fasor2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelFondoRojo;
    private javax.swing.JLabel jLabelNcom;
    private javax.swing.JLabel jLabelOperaciobesAvanzadas;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField resultado;
    // End of variables declaration//GEN-END:variables
}
