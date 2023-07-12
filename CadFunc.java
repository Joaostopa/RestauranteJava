//João Vitor Stopa Ferreira    2210177  



import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;




public class CadFunc extends javax.swing.JFrame {
    private Funcionario funcionario;
    private BDMud mudFunc = new BDMud();

//Singleton   
    private static CadFunc cadFuncA;
    
    private CadFunc() {
        initComponents();
    }
    
    public static CadFunc getCadFunc(){
        if(cadFuncA == null){
            cadFuncA = new CadFunc();
            System.out.println("Funcionario novo");
        }
        else{
            System.out.println("Funcionario antigo");
        }
        return cadFuncA;
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jMenu4 = new javax.swing.JMenu();
        Nome = new javax.swing.JLabel();
        jNome = new javax.swing.JTextField();
        Cpf = new javax.swing.JLabel();
        jCpf = new javax.swing.JTextField();
        Rg = new javax.swing.JLabel();
        jRg = new javax.swing.JTextField();
        Endereco = new javax.swing.JLabel();
        jEndereco = new javax.swing.JTextField();
        Email = new javax.swing.JLabel();
        jEmail = new javax.swing.JTextField();
        btExcluir = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btPesquisa = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbFunc = new javax.swing.JTable();
        Telefone = new javax.swing.JLabel();
        jTelefone = new javax.swing.JTextField();
        btConfirmar = new javax.swing.JButton();
        btAlterar = new javax.swing.JButton();
        btApagar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jCheckBox1.setText("jCheckBox1");

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("jMenu3");

        jTextField1.setText("jTextField1");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jMenu4.setText("jMenu4");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Funcionarios ");

        Nome.setText("Nome: ");

        jNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNomeActionPerformed(evt);
            }
        });

        Cpf.setText("Cpf:");

        jCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCpfActionPerformed(evt);
            }
        });

        Rg.setText("Rg:");

        jRg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRgActionPerformed(evt);
            }
        });

        Endereco.setText("Endereco:");

        Email.setText("Email:");

        jEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEmailActionPerformed(evt);
            }
        });

        btExcluir.setText("Excluir ");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel1.setText("Cadastro de Funcionario");
        jLabel1.setToolTipText("");
        jLabel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        btPesquisa.setText("Pesquisar Pessoa");
        btPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisaActionPerformed(evt);
            }
        });

        tbFunc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nome", "Cpf", "Rg", "Email", "Telefone", "Endereco"
            }
        ));
        jScrollPane1.setViewportView(tbFunc);

        Telefone.setText("Telefone:");

        btConfirmar.setText("Confirmar");
        btConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConfirmarActionPerformed(evt);
            }
        });

        btAlterar.setText("Alterar Dados");
        btAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarActionPerformed(evt);
            }
        });

        btApagar.setText("Apagar Pessoa");
        btApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btApagarActionPerformed(evt);
            }
        });

        jLabel2.setText("Alterações pelo Cpf da Pessoa");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Rg)
                            .addComponent(Nome))
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Telefone)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jNome, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRg, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(Cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(414, 414, 414)
                                .addComponent(Endereco)
                                .addGap(18, 18, 18)
                                .addComponent(jEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 645, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(27, 27, 27))
            .addGroup(layout.createSequentialGroup()
                .addGap(341, 341, 341)
                .addComponent(btConfirmar)
                .addGap(28, 28, 28)
                .addComponent(btExcluir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(338, 338, 338))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btPesquisa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btApagar)
                        .addGap(235, 235, 235))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btSair)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(182, 182, 182))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Nome)
                    .addComponent(jCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cpf))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Rg)
                    .addComponent(jEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Email))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Endereco))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btConfirmar)
                                    .addComponent(btExcluir))
                                .addGap(26, 26, 26)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btApagar)
                                    .addComponent(btAlterar)
                                    .addComponent(btPesquisa))
                                .addGap(35, 35, 35))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btSair))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Telefone)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jNomeActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        Excluir();  
    }//GEN-LAST:event_btExcluirActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        Sair();
    }//GEN-LAST:event_btSairActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void btPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisaActionPerformed
        Pesquisar();
    }//GEN-LAST:event_btPesquisaActionPerformed

    private void jEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jEmailActionPerformed

    private void jCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCpfActionPerformed

    private void btConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConfirmarActionPerformed
        Confirmar();
        Tabela();
    }//GEN-LAST:event_btConfirmarActionPerformed

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed
        Alterar();
        Tabela();
    }//GEN-LAST:event_btAlterarActionPerformed

    private void btApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btApagarActionPerformed
        Apagar();
        Tabela();
    }//GEN-LAST:event_btApagarActionPerformed

    private void jRgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRgActionPerformed
   
    public void Apagar(){
    funcionario = new Funcionario ();
       
        try{
           funcionario.setCpf(Integer.parseInt(jCpf.getText()));
           
           funcionario = mudFunc.consFuncCpf(funcionario);
           
           if (funcionario != null){
               jNome.setText(funcionario.getNome());
               jEndereco.setText(funcionario.getEndereco());
               jCpf.setText(Integer.toString(funcionario.getCpf()));
               jRg.setText(Integer.toString(funcionario.getRg()));
               jTelefone.setText(Integer.toString(funcionario.getTelefone()));
               jEmail.setText(funcionario.getEmail());
               int x = JOptionPane.showConfirmDialog(null,"Confirme a pessoa para excluir.","Confirme Dados",JOptionPane.YES_NO_CANCEL_OPTION);
               if (x == 0){
                   mudFunc.removeFuncCpf(funcionario);
                   JOptionPane.showMessageDialog(null, "Pessoa excluida.", "Pessoa", 0);
                   Excluir();  
               }
                 
           }
           else{
               JOptionPane.showMessageDialog(null, "Pessoa inexistente.", "Pessoa", 0);
               Excluir();
           }   
        }
        catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(null, "Cpf deve conter apenas números.", "Erro", 0);
       }
    }
  
    public void Alterar(){
        funcionario = new Funcionario ();
       
        try{
           funcionario.setCpf(Integer.parseInt(jCpf.getText()));
            
           
           funcionario = mudFunc.atualizaFuncCpf(funcionario);
           
           if (funcionario != null){
               jNome.setText(funcionario.getNome());
               jEndereco.setText(funcionario.getEndereco());
               jCpf.setText(Integer.toString(funcionario.getCpf()));
               jRg.setText(Integer.toString(funcionario.getRg()));
               jTelefone.setText(Integer.toString(funcionario.getTelefone()));
               jEmail.setText(funcionario.getEmail());
               JOptionPane.showMessageDialog(null,"Atualização de dados.","Dados",1);
               Excluir();   
           }
           else{
               JOptionPane.showMessageDialog(null, "Pessoa inexistente.", "Pessoa", 0);
               Excluir();
           }   
        }
        catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(null, "Cpf deve conter apenas números.", "Erro", 0);
       }
    }
    
   
    public void Tabela(){
        DefaultTableModel modelo = (DefaultTableModel) tbFunc.getModel();
        int posLin = 0; 
        
        modelo.setRowCount(posLin);
        
        for(Funcionario func : mudFunc.getBDFunc()){
            modelo.insertRow(posLin, new Object []{func.getNome(), func.getCpf(), func.getRg(), func.getEmail(), func.getTelefone(), func.getEndereco()});
            posLin++;
        }
    }
    
    
    public void Pesquisar(){
       funcionario = new Funcionario ();
       
        try{
           funcionario.setCpf(Integer.parseInt(jCpf.getText()));
           
           funcionario = mudFunc.consFuncCpf(funcionario);
           
           if (funcionario != null){
               jNome.setText(funcionario.getNome());
               jEndereco.setText(funcionario.getEndereco());
               jCpf.setText(Integer.toString(funcionario.getCpf()));
               jRg.setText(Integer.toString(funcionario.getRg()));
               jTelefone.setText(Integer.toString(funcionario.getTelefone()));
               jEmail.setText(funcionario.getEmail());
               JOptionPane.showMessageDialog(null,"Confirme a pessoa.","Dados",1);
               Excluir();   
           }
           else{
               JOptionPane.showMessageDialog(null, "Pessoa inexistente.", "Pessoa", 0);
               Excluir();
           }   
        }
        catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(null, "Cpf deve conter apenas números.", "Erro", 0);
       }
    }
      
    public void Confirmar(){
                
    funcionario = new Funcionario();
    try{
        funcionario.setNome(jNome.getText());
        funcionario.setEndereco(jEndereco.getText());
        funcionario.setCpf(Integer.parseInt(jCpf.getText()));
        funcionario.setRg(Integer.parseInt(jRg.getText()));
        funcionario.setTelefone(Integer.parseInt(jTelefone.getText()));
        funcionario.setEmail(jEmail.getText());
        
        funcionario = mudFunc.cadFunc(funcionario);
        
        if(funcionario != null){
            JOptionPane.showMessageDialog(null, "Cadastro realizado", "Cadastro", 1);
            Excluir();
        }
        else{
            JOptionPane.showMessageDialog(null,"Pessoa já existente.","Pessoa",0);
            jCpf.setText("");
            jRg.setText("");
            jEmail.setText("");
            jNome.requestFocus();
    }
    }
        catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(null, "Apenas números em Cpf,Rg e telefone.", "Erro", 0);
            jCpf.setText("");
            jRg.setText("");
            jTelefone.setText("");
            jCpf.requestFocus();
        }
 
    }

    public void Sair(){
        int resp = JOptionPane.showConfirmDialog(null, "Confirme para Sair.","Excluir",JOptionPane.YES_NO_CANCEL_OPTION);
        if(resp == 0){
            this.dispose();
        }
    }
    public void Excluir(){
        jNome.setText("");
        jEndereco.setText("");
        jCpf.setText("");
        jRg.setText("");
        jEmail.setText("");
        jTelefone.setText("");
        jNome.requestFocus();   
    }
    
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
            java.util.logging.Logger.getLogger(CadFunc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadFunc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadFunc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadFunc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadFunc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cpf;
    private javax.swing.JLabel Email;
    private javax.swing.JLabel Endereco;
    private javax.swing.JLabel Nome;
    private javax.swing.JLabel Rg;
    private javax.swing.JLabel Telefone;
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btApagar;
    private javax.swing.JButton btConfirmar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btPesquisa;
    private javax.swing.JButton btSair;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JTextField jCpf;
    private javax.swing.JTextField jEmail;
    private javax.swing.JTextField jEndereco;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JTextField jNome;
    private javax.swing.JTextField jRg;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTelefone;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tbFunc;
    // End of variables declaration//GEN-END:variables
}
