//João Vitor Stopa Ferreira 2210177


import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class CadProduto extends javax.swing.JFrame {

    private Produto produto;
    private BDMud mudFunc = new BDMud();
    
//Singleton
    private static CadProduto cadProdA;
    
    public CadProduto() {
        initComponents();
    }

    
    public static CadProduto getCadProd(){
        if(cadProdA == null){
            cadProdA = new CadProduto();
            System.out.println("Produto Novo");
        }
        else{
            System.out.println("Produto antigo");
        }
        return cadProdA;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        Title = new javax.swing.JLabel();
        Nome = new javax.swing.JLabel();
        cNome = new javax.swing.JTextField();
        Preço = new javax.swing.JLabel();
        cPreço = new javax.swing.JTextField();
        btConfirmar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        Codigo = new javax.swing.JLabel();
        cCodigo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbProd = new javax.swing.JTable();
        btAlterarP = new javax.swing.JButton();
        btApagarP = new javax.swing.JButton();
        btPesquisarP = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btSair = new javax.swing.JButton();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Title.setText("Cadastro Produtos");

        Nome.setText("Nome:");

        cNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cNomeActionPerformed(evt);
            }
        });

        Preço.setText("Preço:");

        cPreço.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cPreçoActionPerformed(evt);
            }
        });

        btConfirmar.setText("Confirmar");
        btConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConfirmarActionPerformed(evt);
            }
        });

        btExcluir.setText("Excluir");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        Codigo.setText("Codigo:");

        cCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cCodigoActionPerformed(evt);
            }
        });

        tbProd.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nome", "Preço", "Codigo"
            }
        ));
        jScrollPane1.setViewportView(tbProd);

        btAlterarP.setText("Alterar produto");
        btAlterarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarPActionPerformed(evt);
            }
        });

        btApagarP.setText("Apagar produto");
        btApagarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btApagarPActionPerformed(evt);
            }
        });

        btPesquisarP.setText("Pesquisar produto");
        btPesquisarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisarPActionPerformed(evt);
            }
        });

        jLabel1.setText("Alterações pelo Codigo do Produto");

        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Preço)
                    .addComponent(Codigo)
                    .addComponent(Nome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(Title))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btConfirmar)
                        .addGap(18, 18, 18)
                        .addComponent(btExcluir))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(cNome, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                        .addComponent(cPreço)
                        .addComponent(cCodigo)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(65, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btApagarP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btAlterarP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btPesquisarP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(207, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(166, 166, 166))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btSair)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Title)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nome)
                    .addComponent(cNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Preço)
                    .addComponent(cPreço, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Codigo)
                    .addComponent(cCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btConfirmar)
                    .addComponent(btExcluir))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btAlterarP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btApagarP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btPesquisarP)
                        .addGap(144, 144, 144)
                        .addComponent(btSair))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cPreçoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cPreçoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cPreçoActionPerformed

    private void cNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cNomeActionPerformed

    private void cCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cCodigoActionPerformed

    private void btConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConfirmarActionPerformed
        Confirmar();
        Tabela();
    }//GEN-LAST:event_btConfirmarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        Excluir();
    }//GEN-LAST:event_btExcluirActionPerformed

    private void btPesquisarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarPActionPerformed
        Pesquisar();
    }//GEN-LAST:event_btPesquisarPActionPerformed

    private void btAlterarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarPActionPerformed
        Alterar();
        Tabela();
    }//GEN-LAST:event_btAlterarPActionPerformed

    private void btApagarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btApagarPActionPerformed
        Apagar();
        Tabela();
    }//GEN-LAST:event_btApagarPActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        Sair();
    }//GEN-LAST:event_btSairActionPerformed

    public void Confirmar(){
                
    produto = new Produto();
    
    try{
        produto.setNome(cNome.getText());
        produto.setCodigo(Integer.parseInt(cCodigo.getText()));
        produto.setPreço(Integer.parseInt(cPreço.getText()));
        
        
        produto = mudFunc.cadProduto(produto);
        
        if(produto != null){
            JOptionPane.showMessageDialog(null, "Cadastro realizado", "Cadastro", 1);
            Excluir();
        }
        else{
            JOptionPane.showMessageDialog(null,"produto já existente.","Produto",0);
            cCodigo.setText("");
            cCodigo.requestFocus();
    }
    }
        catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(null, "Apenas números em Cpf,Rg e telefone.", "Erro", 0);
            cPreço.setText("");
            cCodigo.setText("");
            cCodigo.requestFocus();
        }
 
    }
    public void Sair(){
        int resp = JOptionPane.showConfirmDialog(null, "Confirme para Sair.","Excluir",JOptionPane.YES_NO_CANCEL_OPTION);
        if(resp == 0){
            this.dispose();
        }
    }
    public void Excluir(){
        cCodigo.setText("");
        cNome.setText("");
        cPreço.setText("");
        cNome.requestFocus();
    }
    
    public void Tabela(){
        DefaultTableModel modelo = (DefaultTableModel) tbProd.getModel();
        int posLin = 0; 
        
        modelo.setRowCount(posLin);
        
        for(Produto prod : mudFunc.getBDProd()){
            modelo.insertRow(posLin, new Object []{prod.getNome(), prod.getPreço(), prod.getCodigo()});
            posLin++;
        }
    }
    
    public void Alterar(){
        produto = new Produto();
      
         try{
            produto.setCodigo(Integer.parseInt(cCodigo.getText()));
       
            produto = mudFunc.atualizaProdCod(produto);
         
            if(produto != null){
              cCodigo.setText(Integer.toString(produto.getCodigo()));
              cNome.setText(produto.getNome());
              cPreço.setText(Integer.toString(produto.getPreço()));
              JOptionPane.showMessageDialog(null, "Alterar Produto", "Produtos", 1);
               Excluir();
             }
            else{
              JOptionPane.showMessageDialog(null, "Produto inexistente", "Produto", 0);
              cCodigo.setText("");
              cCodigo.requestFocus();
            }
        } 
        catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(null, "Codigo deve conter apenas números.", "Erro de sistema", 0);
            cCodigo.setText("");
            cCodigo.requestFocus();
        } 
    }
      
    public void Apagar(){
    produto = new Produto ();
       
        try{
           produto.setCodigo(Integer.parseInt(cCodigo.getText()));
           
           produto = mudFunc.consProdCodigo(produto);
           
           if (produto != null){
               cNome.setText(produto.getNome());
               cCodigo.setText(Integer.toString(produto.getCodigo()));
               cPreço.setText(Integer.toString(produto.getPreço()));
               int x = JOptionPane.showConfirmDialog(null,"Confirme a pessoa para excluir.","Confirme Dados",JOptionPane.YES_NO_CANCEL_OPTION);
               if (x == 0){
                   mudFunc.removeProdCodigo(produto);
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
    public void Pesquisar(){
       produto = new Produto ();
       
        try{
           produto.setCodigo(Integer.parseInt(cCodigo.getText()));
           
           produto = mudFunc.consProdCodigo(produto);
           
           if (produto != null){
               cNome.setText(produto.getNome());
               cCodigo.setText(Integer.toString(produto.getCodigo()));
               cPreço.setText(Integer.toString(produto.getPreço()));
               JOptionPane.showMessageDialog(null,"Confirme o produto.","Dados",1);
               Excluir();   
           }
           else{
               JOptionPane.showMessageDialog(null, "Produto inexistente.", "Produto", 0);
               Excluir();
           }   
        }
        catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(null, "Codigo não encontrado.", "Erro", 0);
       }
    }
    
    
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
            java.util.logging.Logger.getLogger(CadProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Codigo;
    private javax.swing.JLabel Nome;
    private javax.swing.JLabel Preço;
    private javax.swing.JLabel Title;
    private javax.swing.JButton btAlterarP;
    private javax.swing.JButton btApagarP;
    private javax.swing.JButton btConfirmar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btPesquisarP;
    private javax.swing.JButton btSair;
    private javax.swing.JTextField cCodigo;
    private javax.swing.JTextField cNome;
    private javax.swing.JTextField cPreço;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTable tbProd;
    // End of variables declaration//GEN-END:variables
}