/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

/**
 *
 * @author kille
 */
public class jFrTela extends javax.swing.JFrame {

    /**
     * Creates new form jFrTela
     */
    public jFrTela() {
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

        jTextField1 = new javax.swing.JTextField();
        tfValor = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        btAC = new javax.swing.JButton();
        btMaisMenos = new javax.swing.JButton();
        btPorcentagem = new javax.swing.JButton();
        btDividir = new javax.swing.JButton();
        bt7 = new javax.swing.JButton();
        bt8 = new javax.swing.JButton();
        bt9 = new javax.swing.JButton();
        btMultiplicar = new javax.swing.JButton();
        bt4 = new javax.swing.JButton();
        bt5 = new javax.swing.JButton();
        bt6 = new javax.swing.JButton();
        btMenos = new javax.swing.JButton();
        bt1 = new javax.swing.JButton();
        bt2 = new javax.swing.JButton();
        bt3 = new javax.swing.JButton();
        btMais = new javax.swing.JButton();
        bt0 = new javax.swing.JButton();
        btVirgula = new javax.swing.JButton();
        btFechar = new javax.swing.JButton();
        btIgual = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tfValor.setText("0,00");
        tfValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfValorActionPerformed(evt);
            }
        });

        jPanel1.setLayout(new java.awt.GridLayout(5, 4));

        btAC.setText("AC");
        jPanel1.add(btAC);

        btMaisMenos.setText("+/-");
        jPanel1.add(btMaisMenos);

        btPorcentagem.setText("%");
        jPanel1.add(btPorcentagem);

        btDividir.setText("/");
        btDividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDividirActionPerformed(evt);
            }
        });
        jPanel1.add(btDividir);

        bt7.setText("7");
        jPanel1.add(bt7);

        bt8.setText("8");
        jPanel1.add(bt8);

        bt9.setText("9");
        jPanel1.add(bt9);

        btMultiplicar.setText("*");
        jPanel1.add(btMultiplicar);

        bt4.setText("4");
        jPanel1.add(bt4);

        bt5.setText("5");
        jPanel1.add(bt5);

        bt6.setText("6");
        jPanel1.add(bt6);

        btMenos.setText("-");
        jPanel1.add(btMenos);

        bt1.setText("1");
        jPanel1.add(bt1);

        bt2.setText("2");
        jPanel1.add(bt2);

        bt3.setText("3");
        jPanel1.add(bt3);

        btMais.setText("+");
        jPanel1.add(btMais);

        bt0.setText("0");
        bt0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt0ActionPerformed(evt);
            }
        });
        jPanel1.add(bt0);

        btVirgula.setText(",");
        jPanel1.add(btVirgula);

        btFechar.setText("Fechar");
        btFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFecharActionPerformed(evt);
            }
        });
        jPanel1.add(btFechar);

        btIgual.setText("=");
        jPanel1.add(btIgual);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tfValor)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tfValor, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 386, Short.MAX_VALUE)
                .addGap(41, 41, 41))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btDividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDividirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btDividirActionPerformed

    private void tfValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfValorActionPerformed

    private void btFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFecharActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btFecharActionPerformed

    private void bt0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt0ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bt0ActionPerformed

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
            java.util.logging.Logger.getLogger(jFrTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jFrTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jFrTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jFrTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jFrTela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt0;
    private javax.swing.JButton bt1;
    private javax.swing.JButton bt2;
    private javax.swing.JButton bt3;
    private javax.swing.JButton bt4;
    private javax.swing.JButton bt5;
    private javax.swing.JButton bt6;
    private javax.swing.JButton bt7;
    private javax.swing.JButton bt8;
    private javax.swing.JButton bt9;
    private javax.swing.JButton btAC;
    private javax.swing.JButton btDividir;
    private javax.swing.JButton btFechar;
    private javax.swing.JButton btIgual;
    private javax.swing.JButton btMais;
    private javax.swing.JButton btMaisMenos;
    private javax.swing.JButton btMenos;
    private javax.swing.JButton btMultiplicar;
    private javax.swing.JButton btPorcentagem;
    private javax.swing.JButton btVirgula;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField tfValor;
    // End of variables declaration//GEN-END:variables
}
