/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rogerio.app;

import br.com.rogerio.bll.OrcamentoMaoDeObra;
import br.com.rogerio.bll.OrcamentoMaoDeObraPisoComum;
import br.com.rogerio.bll.OrcamentoMaoDeObraPorcelanato;
import br.com.rogerio.model.AcabamentoEmPisos;
import javax.swing.JOptionPane;

/**
 *
 * @author roger
 */
public class OrcamentoView extends javax.swing.JFrame {

    AcabamentoEmPisos acabamento;
    OrcamentoMaoDeObra bllPorc;
    OrcamentoMaoDeObra bllPiso;

    /**
     * Creates new form OrcamentoView
     */
    public OrcamentoView() {
        initComponents();
        acabamento = new AcabamentoEmPisos();
        bllPorc = new OrcamentoMaoDeObraPorcelanato();
        bllPiso = new OrcamentoMaoDeObraPisoComum();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelOrcamento = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jCheckBoxPorcelanato = new javax.swing.JCheckBox();
        jCheckBoxPisoComum = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldQuantidade = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldValorDoMetro = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaSaidaOrcamento = new javax.swing.JTextArea();
        jButtonCalcularOrcamento = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Padrão de Projeto Template - Tema >Orçamento de Mão-de-Obra");
        setResizable(false);

        jLabel1.setText("Tipo do piso: ");

        jCheckBoxPorcelanato.setText("Porcelanato");
        jCheckBoxPorcelanato.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBoxPorcelanatoMouseClicked(evt);
            }
        });

        jCheckBoxPisoComum.setText("Piso Comum");
        jCheckBoxPisoComum.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBoxPisoComumMouseClicked(evt);
            }
        });

        jLabel2.setText("Quantidado: ");

        jLabel3.setText("Mts/Quad.");

        jLabel4.setText("Valor do Metro Quadrado:  R$  ");

        jTextAreaSaidaOrcamento.setColumns(20);
        jTextAreaSaidaOrcamento.setRows(5);
        jScrollPane1.setViewportView(jTextAreaSaidaOrcamento);

        jButtonCalcularOrcamento.setText("Calcular");
        jButtonCalcularOrcamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCalcularOrcamentoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelOrcamentoLayout = new javax.swing.GroupLayout(jPanelOrcamento);
        jPanelOrcamento.setLayout(jPanelOrcamentoLayout);
        jPanelOrcamentoLayout.setHorizontalGroup(
            jPanelOrcamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOrcamentoLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanelOrcamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelOrcamentoLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldValorDoMetro, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelOrcamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanelOrcamentoLayout.createSequentialGroup()
                            .addGroup(jPanelOrcamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanelOrcamentoLayout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextFieldQuantidade))
                                .addGroup(jPanelOrcamentoLayout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(18, 18, 18)
                                    .addComponent(jCheckBoxPorcelanato)))
                            .addGroup(jPanelOrcamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanelOrcamentoLayout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addComponent(jCheckBoxPisoComum))
                                .addGroup(jPanelOrcamentoLayout.createSequentialGroup()
                                    .addGap(8, 8, 8)
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonCalcularOrcamento))))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanelOrcamentoLayout.setVerticalGroup(
            jPanelOrcamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOrcamentoLayout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addGroup(jPanelOrcamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jCheckBoxPorcelanato)
                    .addComponent(jCheckBoxPisoComum))
                .addGroup(jPanelOrcamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelOrcamentoLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanelOrcamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextFieldQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelOrcamentoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonCalcularOrcamento)
                        .addGap(15, 15, 15)))
                .addGroup(jPanelOrcamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldValorDoMetro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelOrcamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelOrcamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBoxPorcelanatoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBoxPorcelanatoMouseClicked

        String valor = "" + bllPorc.getValorMetro();
        jTextFieldValorDoMetro.setText(valor);

        jCheckBoxPisoComum.setSelected(false);
        jButtonCalcularOrcamento.setLabel("Calcular Porcelanato");
    }//GEN-LAST:event_jCheckBoxPorcelanatoMouseClicked

    private void jCheckBoxPisoComumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBoxPisoComumMouseClicked
        String valor = "" + bllPiso.getValorMetro();
        jTextFieldValorDoMetro.setText(valor);

        jCheckBoxPorcelanato.setSelected(false);
        jButtonCalcularOrcamento.setLabel("Calcular Piso Comum");
    }//GEN-LAST:event_jCheckBoxPisoComumMouseClicked

    private void jButtonCalcularOrcamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCalcularOrcamentoActionPerformed
        try {

            if (jCheckBoxPorcelanato.isSelected()) {
                acabamento.setTipo("Porcelanato");
            } else {
                acabamento.setTipo("Piso Comum");
            }

            acabamento.setQuant(Integer.parseInt(jTextFieldQuantidade.getText()));

            if (jButtonCalcularOrcamento.getLabel().equalsIgnoreCase("Calcular Porcelanato")) {

                jTextAreaSaidaOrcamento.setText(bllPorc.apresentarOrcamento(acabamento));

            } else {

                jTextAreaSaidaOrcamento.setText(bllPiso.apresentarOrcamento(acabamento));

            }
           
            jTextFieldValorDoMetro.setText("");

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Atenção!!!\n" + erro.getMessage());
        }
    }//GEN-LAST:event_jButtonCalcularOrcamentoActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(OrcamentoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OrcamentoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OrcamentoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OrcamentoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OrcamentoView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCalcularOrcamento;
    private javax.swing.JCheckBox jCheckBoxPisoComum;
    private javax.swing.JCheckBox jCheckBoxPorcelanato;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanelOrcamento;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaSaidaOrcamento;
    private javax.swing.JTextField jTextFieldQuantidade;
    private javax.swing.JTextField jTextFieldValorDoMetro;
    // End of variables declaration//GEN-END:variables
}
