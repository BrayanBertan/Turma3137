/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.satc.grafico;

import br.com.satc.pessoa.Vendedor;
import br.com.satc.singleton.BancoVendedor;
import javax.swing.JOptionPane;
import javax.xml.crypto.Data;

/**
 *
 * @author Edutec
 */
public class EdicaoVendedor extends javax.swing.JInternalFrame {

    /**
     * Creates new form EdicaoVendedor
     */
    public EdicaoVendedor() {
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

        jLTitulo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTID = new javax.swing.JTextField();
        jLData = new javax.swing.JLabel();
        jTNome = new javax.swing.JTextField();
        jLEspecie = new javax.swing.JLabel();
        jTCargo = new javax.swing.JTextField();
        jLRaca = new javax.swing.JLabel();
        jTCpf = new javax.swing.JTextField();
        jTEspecialidade = new javax.swing.JTextField();
        jBProcurar = new javax.swing.JButton();
        jBEditar = new javax.swing.JButton();
        lblNome = new javax.swing.JLabel();
        jLData1 = new javax.swing.JLabel();
        jTSetor = new javax.swing.JTextField();
        jLData2 = new javax.swing.JLabel();
        jTSalario = new javax.swing.JTextField();
        jLData3 = new javax.swing.JLabel();
        jTRg = new javax.swing.JTextField();
        jBCancelar = new javax.swing.JButton();
        jBSair = new javax.swing.JButton();
        jLData4 = new javax.swing.JLabel();
        jTEdi = new javax.swing.JTextField();

        jLTitulo.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLTitulo.setText("Edição do Vendedor");

        jLabel1.setText("ID:");

        jLData.setText("Nome");

        jTNome.setEnabled(false);

        jLEspecie.setText("Cargo");

        jTCargo.setEnabled(false);

        jLRaca.setText("Cpf");

        jTCpf.setEnabled(false);

        jTEspecialidade.setEnabled(false);

        jBProcurar.setText("Procurar");
        jBProcurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBProcurarActionPerformed(evt);
            }
        });

        jBEditar.setText("Editar");
        jBEditar.setEnabled(false);
        jBEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEditarActionPerformed(evt);
            }
        });

        lblNome.setText("Especialidade");

        jLData1.setText("Setor");

        jTSetor.setEnabled(false);

        jLData2.setText("Salario");

        jTSalario.setEnabled(false);

        jLData3.setText("RG");

        jTRg.setEnabled(false);

        jBCancelar.setText("Cancelar");
        jBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCancelarActionPerformed(evt);
            }
        });

        jBSair.setText("Sair");
        jBSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSairActionPerformed(evt);
            }
        });

        jLData4.setText("Bonus");

        jTEdi.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(224, 224, 224)
                        .addComponent(jBProcurar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBEditar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addComponent(jBCancelar)
                        .addGap(18, 18, 18)
                        .addComponent(jBSair, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(lblNome)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLData3)
                    .addComponent(jLData2)
                    .addComponent(jLData1)
                    .addComponent(jTSetor, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTRg, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLData4)
                    .addComponent(jTEdi, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(72, 72, 72)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLEspecie)
                        .addComponent(jLData)
                        .addComponent(jTNome, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTEspecialidade, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLTitulo)
                        .addComponent(jTID, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)
                        .addComponent(jLRaca)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTCpf, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTCargo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(308, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLData1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTSetor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLData2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLData3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLData4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(jTEdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBProcurar)
                    .addComponent(jBEditar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBCancelar)
                    .addComponent(jBSair))
                .addGap(30, 30, 30))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addComponent(jLTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel1)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jTID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLData)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jTNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLEspecie)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jTCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLRaca)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jTCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(28, 28, 28)
                    .addComponent(jTEspecialidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(126, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBProcurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBProcurarActionPerformed
      

        try{
            int id = Integer.parseInt(jTID.getText());
            jTNome.setText(BancoVendedor.getInstance().vendedores.get(id).getNome());
            jTCpf.setText(BancoVendedor.getInstance().vendedores.get(id).getCpf());
            jTCargo.setText(BancoVendedor.getInstance().vendedores.get(id).getCargo());
            jTEspecialidade.setText(BancoVendedor.getInstance().vendedores.get(id).getEspecialidade());
            jTRg.setText(BancoVendedor.getInstance().vendedores.get(id).getRg());
            jTCpf.setText(BancoVendedor.getInstance().vendedores.get(id).getCpf());
            jTSalario.setText(String.valueOf(BancoVendedor.getInstance().vendedores.get(id).getSalario()));
            jTSetor.setText(BancoVendedor.getInstance().vendedores.get(id).getSetor());
            jTEdi.setText(Double.toString(BancoVendedor.getInstance().vendedores.get(Integer.parseInt(jTID.getText())).getBonus()));
            
            jBCancelar.setEnabled(true);
            jBProcurar.setEnabled(false);
            jBEditar.setEnabled(true);
            jTID.setEnabled(false);
            jTNome.setEnabled(true);
            jTCpf.setEnabled(true);
            jTCargo.setEnabled(true);
            jTEspecialidade.setEnabled(true);
            jTRg.setEnabled(true);
            jTSalario.setEnabled(true);
            jTSetor.setEnabled(true);
            jTEdi.setEnabled(true);
           
          
            
            
        }catch(IndexOutOfBoundsException iobe){
            JOptionPane.showMessageDialog(null, "Id inexistente");
        }
        
    }//GEN-LAST:event_jBProcurarActionPerformed

    private void jBEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEditarActionPerformed
       String nome,cpf,rg,especialidade,cargo,setor;
        double salario,bonus;

        if (!(jTCpf.getText().equals("") || jTNome.getText().equals("")
            || jTEspecialidade.getText().equals("") || jTCargo.getText().equals("") || jTCpf.getText().equals(""))){
           
        cargo = jTCargo.getText();
        nome = jTNome.getText();
        cpf = jTCpf.getText();
        especialidade = jTEspecialidade.getText();
        setor = jTSetor.getText();
        rg = jTRg.getText();
        salario = Integer.parseInt(jTSalario.getText());
        especialidade = jTEspecialidade.getText();
        bonus = Double.parseDouble(jTEdi.getText());
       
           BancoVendedor.getInstance().vendedores.get(Integer.parseInt(jTID.getText())).setBonus(bonus);
      BancoVendedor.getInstance().vendedores.set(Integer.parseInt(jTID.getText()), new Vendedor(especialidade,setor, cargo, salario, nome,  rg, cpf));
        JOptionPane.showMessageDialog(this, "Modificado com Sucesso");
       jBCancelar.setEnabled(false);
        jBProcurar.setEnabled(true);
        jBEditar.setEnabled(false);
        jTID.setEnabled(true);
        jTNome.setEnabled(false);
        jTCpf.setEnabled(false);
        jTCargo.setEnabled(false);
        jTEspecialidade.setEnabled(false);
        jTSetor.setEnabled(false);
        jTSalario.setEnabled(false);
        jTRg.setEnabled(false);
    }//GEN-LAST:event_jBEditarActionPerformed
    }
    private void jBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancelarActionPerformed
        jBCancelar.setEnabled(false);
        jBProcurar.setEnabled(true);
        jBEditar.setEnabled(false);
        jTID.setEnabled(true);
        jTNome.setEnabled(false);
        jTCpf.setEnabled(false);
        jTCargo.setEnabled(false);
        jTEspecialidade.setEnabled(false);
        jTSetor.setEnabled(false);
        jTSalario.setEnabled(false);
        jTRg.setEnabled(false);
        jTNome.setText("");
        jTID.setText("");
        jTCpf.setText("");
        jTCargo.setText("");
        jTEspecialidade.setText("");
        jTSetor.setText("");
        jTSalario.setText("");
        jTRg.setText("");
    }//GEN-LAST:event_jBCancelarActionPerformed

    private void jBSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSairActionPerformed
      dispose();
    }//GEN-LAST:event_jBSairActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCancelar;
    private javax.swing.JButton jBEditar;
    private javax.swing.JButton jBProcurar;
    private javax.swing.JButton jBSair;
    private javax.swing.JLabel jLData;
    private javax.swing.JLabel jLData1;
    private javax.swing.JLabel jLData2;
    private javax.swing.JLabel jLData3;
    private javax.swing.JLabel jLData4;
    private javax.swing.JLabel jLEspecie;
    private javax.swing.JLabel jLRaca;
    private javax.swing.JLabel jLTitulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTCargo;
    private javax.swing.JTextField jTCpf;
    private javax.swing.JTextField jTEdi;
    private javax.swing.JTextField jTEspecialidade;
    private javax.swing.JTextField jTID;
    private javax.swing.JTextField jTNome;
    private javax.swing.JTextField jTRg;
    private javax.swing.JTextField jTSalario;
    private javax.swing.JTextField jTSetor;
    private javax.swing.JLabel lblNome;
    // End of variables declaration//GEN-END:variables
}
