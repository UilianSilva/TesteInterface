/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testeinterface;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author uilian
 */
public class Caixa extends javax.swing.JInternalFrame {
     String cod,produto,preco;
     
    
        
    

    /**
     * Creates new form Caixa
     */
    public Caixa() {
        initComponents();
    }
    private TesteInterface teste;
    public Caixa(TesteInterface teste){
        this.teste=teste;
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

        jtcodigo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jbnovo = new javax.swing.JButton();
        jbsalvar = new javax.swing.JButton();
        jblimpar = new javax.swing.JButton();
        jbcancelar = new javax.swing.JButton();
        jtproduto = new javax.swing.JTextField();
        jtpreco = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();

        jtcodigo.setEnabled(false);
        jtcodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtcodigoActionPerformed(evt);
            }
        });

        setClosable(true);
        setForeground(java.awt.Color.gray);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Caixa");
        setToolTipText("");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        try {
            setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }
        setVisible(true);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("codigo:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 140, 52, 28);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("produto:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(140, 150, 48, 15);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("preco:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(300, 150, 40, 15);

        jbnovo.setText("novo");
        jbnovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnovoActionPerformed(evt);
            }
        });
        getContentPane().add(jbnovo);
        jbnovo.setBounds(30, 260, 57, 23);

        jbsalvar.setText("salvar");
        jbsalvar.setEnabled(false);
        jbsalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbsalvarActionPerformed(evt);
            }
        });
        getContentPane().add(jbsalvar);
        jbsalvar.setBounds(170, 260, 61, 23);

        jblimpar.setText("limpar");
        jblimpar.setEnabled(false);
        jblimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jblimparActionPerformed(evt);
            }
        });
        getContentPane().add(jblimpar);
        jblimpar.setBounds(30, 350, 61, 23);

        jbcancelar.setText("cancelar");
        jbcancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbcancelarActionPerformed(evt);
            }
        });
        getContentPane().add(jbcancelar);
        jbcancelar.setBounds(160, 350, 73, 23);

        jtproduto.setEnabled(false);
        jtproduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtprodutoActionPerformed(evt);
            }
        });
        getContentPane().add(jtproduto);
        jtproduto.setBounds(210, 140, 70, 30);

        jtpreco.setEnabled(false);
        jtpreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtprecoActionPerformed(evt);
            }
        });
        getContentPane().add(jtpreco);
        jtpreco.setBounds(400, 140, 71, 30);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\uilian\\Downloads\\walmart.jpg")); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(320, 260, 260, 200);

        jDesktopPane1.setBackground(new java.awt.Color(102, 0, 204));

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 910, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
        );

        getContentPane().add(jDesktopPane1);
        jDesktopPane1.setBounds(0, 0, 910, 580);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtprecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtprecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtprecoActionPerformed

    private void jblimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jblimparActionPerformed
jtcodigo.setText(null);
jtproduto.setText(null);
jtpreco.setText(null);
        // TODO add yo ur handling code here:
    }//GEN-LAST:event_jblimparActionPerformed

    private void jbnovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnovoActionPerformed
 jtcodigo.setEnabled(true);
 jtproduto.setEnabled(true);
 jtpreco.setEnabled(true);
 jblimpar.setEnabled(true);
 jbsalvar.setEnabled(true);
 
        

    }//GEN-LAST:event_jbnovoActionPerformed

    private void jbsalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbsalvarActionPerformed
 
   
   
   cod=jtcodigo.getText();
   produto= jtproduto.getText();
   preco= jtpreco.getText();
   //JOptionPane.showMessageDialog(null,cod+"\n"+produto+"\n"+preco);
  //teste.enviarDados(cod, produto, preco);
   System.out.println("codigo"+cod);
   System.out.println("produto "+produto);
    System.out.println("preco"+preco);
      
   
   
        
    }//GEN-LAST:event_jbsalvarActionPerformed

    private void jbcancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbcancelarActionPerformed
System.exit(WIDTH);        // TODO add your handling code here:
    }//GEN-LAST:event_jbcancelarActionPerformed

    private void jtcodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtcodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtcodigoActionPerformed

    private void jtprodutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtprodutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtprodutoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton jbcancelar;
    private javax.swing.JButton jblimpar;
    private javax.swing.JButton jbnovo;
    private javax.swing.JButton jbsalvar;
    private javax.swing.JTextField jtcodigo;
    private javax.swing.JTextField jtpreco;
    private javax.swing.JTextField jtproduto;
    // End of variables declaration//GEN-END:variables
}
