/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visão;

import Controle.ControleDeHistoricos;
import Controle.contratoControle;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class Pesquisas extends javax.swing.JFrame {

    /**
     * Creates new form Pesquisas
     */
    public Pesquisas() {
        initComponents();
        controle();
    }

    String [] AreasCabecalho = {"ID", "-", "-","PROXIMA-DATA", "", ""};
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    String [] AreasCabecalho2 = {"BI", "NOME", "CONTA", "BANCO",  "VALOR", "PERIODO",  "COBERTURA"};
    
            contratoControle cc = new contratoControle();
    
    public void controle()
    {
        
            cc.preencheArrayLista();
            try {
                 Tabela1.setModel(new DefaultTableModel(cc.transformaListaEmObjecto(), AreasCabecalho2));
                 
            } catch (Exception e) {
            }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Datas = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabela1 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        Tabela2 = new javax.swing.JTable();
        pesquisar2 = new javax.swing.JButton();
        State = new javax.swing.JLabel();
        Consultar = new javax.swing.JButton();

        setTitle("Pesquisas");

        jPanel1.setLayout(new java.awt.CardLayout());

        Datas.setBackground(new java.awt.Color(0, 102, 153));
        Datas.setForeground(new java.awt.Color(0, 102, 255));

        Tabela1.setBackground(new java.awt.Color(204, 204, 204));
        Tabela1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(Tabela1);

        Tabela2.setBackground(new java.awt.Color(204, 204, 204));
        Tabela2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        Tabela2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tabela2MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(Tabela2);

        pesquisar2.setBackground(new java.awt.Color(255, 255, 255));
        pesquisar2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        pesquisar2.setForeground(new java.awt.Color(0, 102, 153));
        pesquisar2.setText("Consulta Estado");
        pesquisar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisar2ActionPerformed(evt);
            }
        });

        State.setFont(new java.awt.Font("Arial", 0, 58)); // NOI18N
        State.setForeground(new java.awt.Color(255, 255, 255));
        State.setText("ESTADO: ");

        Consultar.setBackground(new java.awt.Color(255, 255, 255));
        Consultar.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        Consultar.setForeground(new java.awt.Color(0, 102, 153));
        Consultar.setText("Consulta Estado");
        Consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DatasLayout = new javax.swing.GroupLayout(Datas);
        Datas.setLayout(DatasLayout);
        DatasLayout.setHorizontalGroup(
            DatasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DatasLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(DatasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 566, Short.MAX_VALUE)
                    .addComponent(pesquisar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(DatasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DatasLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(DatasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Consultar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(DatasLayout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1099, Short.MAX_VALUE)
                                .addContainerGap())))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DatasLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(State)
                        .addGap(424, 424, 424))))
        );
        DatasLayout.setVerticalGroup(
            DatasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DatasLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(DatasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(DatasLayout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(State)
                        .addGap(40, 40, 40)
                        .addComponent(Consultar, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(66, 66, 66)
                .addComponent(pesquisar2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(266, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(Datas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Datas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, "card2");

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
    }// </editor-fold>//GEN-END:initComponents

    private void pesquisar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisar2ActionPerformed
        // TODO add your handling code here:
        int id = Tabela1.getSelectedRow();
        String BI = ((Tabela1.getValueAt(id, 0)).toString().trim());
        JOptionPane.showMessageDialog(null, "" + BI);
        ControleDeHistoricos cs = new ControleDeHistoricos();
        cs.preencheArrayLista();
        Tabela2.setModel(new DefaultTableModel(cs.Pesquisa(BI), AreasCabecalho));
        
            
    }//GEN-LAST:event_pesquisar2ActionPerformed

    private void Tabela2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabela2MouseClicked
        // TODO add your handling code here:
           
    }//GEN-LAST:event_Tabela2MouseClicked

    private void ConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarActionPerformed
        // TODO add your handling code here:
            int id2 = Tabela2.getSelectedRow();
            String estado = ((Tabela2.getValueAt(id2, 3)).toString().trim());
            Date datando = new Date();
            SimpleDateFormat sdf1= new SimpleDateFormat("dd/MM/yyyy");
            String dataHoje = sdf1.format(datando).toString();
            String [] datar = dataHoje.split("/");
            String mes = datar[1];
               int i = Integer.parseInt(mes);
               JOptionPane.showMessageDialog(null, "" + estado);
              String [] datar2 = estado.split("/");
            String mes2 = datar2[1];
               int z = Integer.parseInt(mes2);
            if(i>z)
            {
                State.setText("Prazo Expirou");
            }
            
            else{
                State.setText("Ainda em Tempo");
                
            }
    }//GEN-LAST:event_ConsultarActionPerformed

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
            java.util.logging.Logger.getLogger(Pesquisas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pesquisas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pesquisas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pesquisas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pesquisas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Consultar;
    private javax.swing.JPanel Datas;
    private javax.swing.JLabel State;
    private javax.swing.JTable Tabela1;
    private javax.swing.JTable Tabela2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton pesquisar2;
    // End of variables declaration//GEN-END:variables
}
