//João Vitor Stopa Ferreira 2210177


import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class BDMud{
    
        private Produto Prod;
	private  Funcionario Func;
        private final List<Produto>bdProd  = new ArrayList<Produto>();
	private final  List<Funcionario> bdFunc = new ArrayList<Funcionario>();


        public List<Funcionario> getBDFunc(){
            return bdFunc;
        }
        
        public List<Produto> getBDProd(){
            return bdProd;
        }
        
	public Funcionario cadFunc(Funcionario func){

		if(consFuncCpf(func)== null){
			bdFunc.add(func);
			return func;
		}
		else{
			return null;
		}

	}
        
        public Produto cadProduto(Produto prod){

		if(consProdCodigo(prod)== null){
			bdProd.add(prod);
			return prod;
		}
		else{
			return null;
		}

	}

	public Funcionario consFuncCpf (Funcionario func){
		for(int i = 0; i < bdFunc.size(); i++){
			if(func.getCpf() == bdFunc.get(i).getCpf()){
				return bdFunc.get(i);
			}
		}
		return null;
	}
        
        public Produto consProdCodigo(Produto prod){
		for(int i = 0; i < bdProd.size(); i++){
			if(prod.getCodigo() == bdProd.get(i).getCodigo()){
				return bdProd.get(i);
			}
		}
		return null;
	}
        
        
        public Funcionario removeFuncCpf(Funcionario func){
                Func = consFuncCpf(func);
            	if(Func != null){
                    bdFunc.remove(func);
                    return null;
		}
		else{
                    return func;
		}
		
	}
        public Produto removeProdCodigo(Produto prod){
                Prod = consProdCodigo(Prod);
            	if(Prod != null){
                    bdProd.remove(Prod);
                    return null;
		}
		else{
                    return prod;
		}
		
	}
        

    public Funcionario atualizaFuncCpf(Funcionario func){
		for(int i = 0; i < bdFunc.size(); i++){
			if(func.getCpf() == bdFunc.get(i).getCpf()){
                                String nome = JOptionPane.showInputDialog(null, "Atualize o nome: ", "Autalização", JOptionPane.QUESTION_MESSAGE);
                                func.setNome(nome);
                                String rg= JOptionPane.showInputDialog(null, "Atualize o Rg: ", "Autalização", JOptionPane.QUESTION_MESSAGE);
                                func.setRg(Integer.parseInt(rg));
                                String email = JOptionPane.showInputDialog(null, "Atualize o email: ", "Autalização", JOptionPane.QUESTION_MESSAGE);
                                func.setEmail(email);
                                String telefone = JOptionPane.showInputDialog(null, "Atualize o telefone: ", "Autalização", JOptionPane.QUESTION_MESSAGE);
                                func.setTelefone(Integer.parseInt(telefone));
                                String endereco = JOptionPane.showInputDialog(null, "Atualize o endereco: ", "Autalização", JOptionPane.QUESTION_MESSAGE);
                                func.setEndereco(endereco);
				bdFunc.set(i, func);  
                                return bdFunc.get(i);
			}
		}
                return null;
	}

        public Produto atualizaProdCod(Produto prod){
		for(int i = 0; i < bdProd.size(); i++){
			if(prod.getCodigo() == bdProd.get(i).getCodigo()){
                                String nome = JOptionPane.showInputDialog(null, "Atualize o nome: ", "Autalização", JOptionPane.QUESTION_MESSAGE);
                                prod.setNome(nome);
                                String codigo = JOptionPane.showInputDialog(null, "Atualize o codigo: ", "Autalização", JOptionPane.QUESTION_MESSAGE);
                                prod.setCodigo(Integer.parseInt(codigo));
                                String preço = JOptionPane.showInputDialog(null, "Atualize o preço: ", "Autalização", JOptionPane.QUESTION_MESSAGE);
                                prod.setPreço(Integer.parseInt(preço));
				bdProd.set(i, prod);  
                                return bdProd.get(i);
			}
		}
                return null;
	}
}