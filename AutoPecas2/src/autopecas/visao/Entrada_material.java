/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Cad_produto.java
 *
 * Created on 10/08/2010, 07:45:32
 */

package autopecas.visao;

import autopecas.logica.data;
import java.util.Date;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author Junior
 */
public class Entrada_material extends javax.swing.JFrame {

    data mostra_data;//variavel que vai chamar os metodos da data e hora
    MaskFormatter formatoPreco, formatoCnpj, formatoCep, formatoFone, formatoData;
    /** Creates new form Cad_produto */
    public Entrada_material() {
        initComponents();

        mostra_data = new data();//objeto inicializado
        mostra_data.le_data();
        jLabel_data.setText(mostra_data.dia_semana + ", " +
                            mostra_data.dia + " de " +
                            mostra_data.mes + " de " +
                            mostra_data.ano);

        timer1.start();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        timer1 = new org.netbeans.examples.lib.timerbean.Timer();
        jLabel_num_NF = new javax.swing.JLabel();
        tf_num_NF = new javax.swing.JTextField();
        jLabel_cod_forn = new javax.swing.JLabel();
        cb_cod_forn = new javax.swing.JComboBox();
        botao_salvar = new javax.swing.JButton();
        botao_alterar = new javax.swing.JButton();
        botao_excluir = new javax.swing.JButton();
        Botao_sair = new javax.swing.JButton();
        jButton_novo_reg = new javax.swing.JButton();
        jLabel_dt_cadastro = new javax.swing.JLabel();
        try  {    formatoData = new MaskFormatter("##/##/####");  }  catch(Exception erro)  {      JOptionPane.showMessageDialog(null, "Não foi possível setar a máscara em formatoData, erro = "+ erro);  }
        tf_dt_cadastro = new JFormattedTextField(formatoData);
        jLabel_data = new javax.swing.JLabel();
        jLabel_hora = new javax.swing.JLabel();
        tf_nome_fornecedor = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu_sair = new javax.swing.JMenu();

        timer1.addTimerListener(new org.netbeans.examples.lib.timerbean.TimerListener() {
            public void onTime(java.awt.event.ActionEvent evt) {
                timer1OnTime(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Auto Peças - Entrada de Material");

        jLabel_num_NF.setFont(new java.awt.Font("Arial", 0, 14));
        jLabel_num_NF.setText("Nº Nota");

        tf_num_NF.setFont(new java.awt.Font("Arial", 0, 14));

        jLabel_cod_forn.setFont(new java.awt.Font("Arial", 0, 14));
        jLabel_cod_forn.setText("Cód. Fornecedor");

        cb_cod_forn.setFont(new java.awt.Font("Arial", 0, 14));
        cb_cod_forn.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        botao_salvar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        botao_salvar.setText("Salvar");
        botao_salvar.setToolTipText("");
        botao_salvar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botao_salvar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        botao_salvar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        botao_alterar.setText("Alterar Registro");
        botao_alterar.setToolTipText("");
        botao_alterar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botao_alterar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        botao_alterar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        botao_excluir.setText("Excluir Registro");
        botao_excluir.setToolTipText("");
        botao_excluir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botao_excluir.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        botao_excluir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        Botao_sair.setText("Sair");
        Botao_sair.setToolTipText("");
        Botao_sair.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Botao_sair.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Botao_sair.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Botao_sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao_sairActionPerformed(evt);
            }
        });

        jButton_novo_reg.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton_novo_reg.setText("Novo Registro");
        jButton_novo_reg.setToolTipText("");
        jButton_novo_reg.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton_novo_reg.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton_novo_reg.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton_novo_reg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_novo_regActionPerformed(evt);
            }
        });

        jLabel_dt_cadastro.setFont(new java.awt.Font("Arial", 0, 14));
        jLabel_dt_cadastro.setText("Data da Entrada:");

        tf_dt_cadastro.setFont(new java.awt.Font("Arial", 0, 14));

        jLabel_data.setText("data");

        jLabel_hora.setText("hora");

        tf_nome_fornecedor.setFont(new java.awt.Font("Arial", 0, 14));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Cód Produto", "Descrição", "Quantidade", "Preço"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getColumn(0).setMinWidth(75);
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(75);
        jTable1.getColumnModel().getColumn(0).setMaxWidth(75);
        jTable1.getColumnModel().getColumn(2).setMinWidth(75);
        jTable1.getColumnModel().getColumn(2).setPreferredWidth(75);
        jTable1.getColumnModel().getColumn(2).setMaxWidth(75);
        jTable1.getColumnModel().getColumn(3).setMinWidth(90);
        jTable1.getColumnModel().getColumn(3).setPreferredWidth(90);
        jTable1.getColumnModel().getColumn(3).setMaxWidth(90);

        jMenuBar1.setBackground(new java.awt.Color(0, 204, 51));

        jMenu1.setBackground(new java.awt.Color(0, 204, 51));
        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu_sair.setBackground(new java.awt.Color(0, 204, 51));
        jMenu_sair.setText("Sair");
        jMenu_sair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu_sairMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu_sair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_data)
                            .addComponent(jLabel_hora)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel_num_NF)
                        .addGap(5, 5, 5)
                        .addComponent(tf_num_NF, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel_cod_forn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cb_cod_forn, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tf_nome_fornecedor, javax.swing.GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 780, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel_dt_cadastro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_dt_cadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jButton_novo_reg)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botao_salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botao_alterar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botao_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Botao_sair, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {Botao_sair, botao_alterar, botao_excluir, botao_salvar, jButton_novo_reg});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_num_NF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_num_NF)
                    .addComponent(jLabel_cod_forn)
                    .addComponent(cb_cod_forn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_nome_fornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_dt_cadastro)
                    .addComponent(tf_dt_cadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(99, 99, 99)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Botao_sair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botao_excluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botao_alterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botao_salvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_novo_reg, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                .addComponent(jLabel_data)
                .addGap(4, 4, 4)
                .addComponent(jLabel_hora))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {botao_salvar, jButton_novo_reg});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu_sairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu_sairMouseClicked
        // evento do menu sair
        dispose();
    }//GEN-LAST:event_jMenu_sairMouseClicked

    private void Botao_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao_sairActionPerformed
        // evento do menu sair
        dispose();
    }//GEN-LAST:event_Botao_sairActionPerformed

    private void jButton_novo_regActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_novo_regActionPerformed
         // evento do botão novo/inserir
        tf_num_NF.setText("");//limpa o campo código
       //instruções para inserir data atual ao novo registro
        Date data = new Date();
        String dia = ""+data.getDate();
        String mes = ""+String.valueOf(data.getMonth()+1);
        String ano = ""+(1900+data.getYear());
        if (Integer.parseInt(dia)<=9)
            dia = "0"+dia;
        if (Integer.parseInt(mes)<=9)
            mes = "0"+mes;
        tf_dt_cadastro.setText(dia+mes+ano);
        tf_num_NF.requestFocus();//foca o cursor no campo nome
    }//GEN-LAST:event_jButton_novo_regActionPerformed

    private void timer1OnTime(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timer1OnTime
         // evento do timer1 que mostra os segundos
        mostra_data.le_hora();
        jLabel_hora.setText(mostra_data.hora);
    }//GEN-LAST:event_timer1OnTime

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Entrada_material().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Botao_sair;
    private javax.swing.JButton botao_alterar;
    private javax.swing.JButton botao_excluir;
    private javax.swing.JButton botao_salvar;
    private javax.swing.JComboBox cb_cod_forn;
    private javax.swing.JButton jButton_novo_reg;
    private javax.swing.JLabel jLabel_cod_forn;
    private javax.swing.JLabel jLabel_data;
    private javax.swing.JLabel jLabel_dt_cadastro;
    private javax.swing.JLabel jLabel_hora;
    private javax.swing.JLabel jLabel_num_NF;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenu_sair;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField tf_dt_cadastro;
    private javax.swing.JTextField tf_nome_fornecedor;
    private javax.swing.JTextField tf_num_NF;
    private org.netbeans.examples.lib.timerbean.Timer timer1;
    // End of variables declaration//GEN-END:variables

}
