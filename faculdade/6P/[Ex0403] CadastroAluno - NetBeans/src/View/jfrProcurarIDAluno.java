package View;

import Controller.ControllerAluno;
import Model.Aluno;
import javax.swing.JOptionPane;

public class jfrProcurarIDAluno extends javax.swing.JFrame {

    public jfrProcurarIDAluno() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jIDAluno = new javax.swing.JTextField();
        jButtonProcurarAlunoID = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setText("Digite o ID do aluno");

        jButtonProcurarAlunoID.setText("Procurar");
        jButtonProcurarAlunoID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProcurarAlunoIDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jIDAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(jButtonProcurarAlunoID)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jIDAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addComponent(jButtonProcurarAlunoID)
                .addGap(68, 68, 68))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonProcurarAlunoIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProcurarAlunoIDActionPerformed
        try {
            // Capturando o ID informado no campo de entrada
            String idTexto = jIDAluno.getText();

            // Validando se o campo foi preenchido
            if (idTexto.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Por favor, insira o ID do aluno!");
                return;
            }

            // Convertendo o ID para um número inteiro
            int id = Integer.parseInt(idTexto);

            // Chamando o Controller para buscar o aluno pelo ID
            ControllerAluno controller = new ControllerAluno();
            Aluno aluno = controller.procurarAlunoPorID(id);

            // Verificando se o aluno foi encontrado
            if (aluno != null) {
                // Exibindo os dados do aluno encontrado
                JOptionPane.showMessageDialog(this, 
                    "Aluno encontrado:\n" +
                    "ID: " + aluno.getId() + "\n" +
                    "Nome: " + aluno.getNome() + "\n" +
                    "Email: " + aluno.getEmail() + "\n" +
                    "Idade: " + aluno.getIdade()
                );
            } else {
                JOptionPane.showMessageDialog(this, "Nenhum aluno encontrado com o ID informado.");
            }
            
            // Fechar a janela atual e voltar para a tela principal
            this.dispose();

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "ID inválido! Por favor, insira um número.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao procurar o aluno: " + e.getMessage());
        }
    }//GEN-LAST:event_jButtonProcurarAlunoIDActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(jfrProcurarIDAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jfrProcurarIDAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jfrProcurarIDAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfrProcurarIDAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jfrProcurarIDAluno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonProcurarAlunoID;
    private javax.swing.JTextField jIDAluno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
