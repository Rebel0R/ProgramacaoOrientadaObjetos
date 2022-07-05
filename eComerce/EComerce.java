package ricardo;

import java.util.ArrayList;
import java.util.List;

public class EComerce {
     private String nomeEmpresa;
     private int cnpj;
     private int inscricaoEstadual;
     private String webSite;
     private List <Cliente> listaCliente;
     private List <Produto> listaProduto;
	 
     public EComerce(String nomeEmpresa, int cnpj, int inscricaoEstadual, String webSite) {
		super();
		this.nomeEmpresa = nomeEmpresa;
		this.cnpj = cnpj;
		this.inscricaoEstadual = inscricaoEstadual;
		this.webSite = webSite;
		this.listaCliente = new ArrayList <Cliente>();
		this.listaProduto = new ArrayList <Produto>();
	 }
     
     public void imprimirDadosEmpresa() {
    	 System.out.println("--- Dados Empresa ---");
    	 System.out.println("Nome: " + this.nomeEmpresa);
    	 System.out.println("CNPJ: " + this.cnpj);
    	 System.out.println("Inscrição Estadual: " + this.inscricaoEstadual);
    	 System.out.println("Domínio: " + this.webSite);
     }
     
     public void cadastrarProdutos(int codigo, String nomeProduto, double precoUn, int quantEstoque) throws NumeroNaoNaturalException, Exception {
    	 try {
	    	 if(codigo<0 || quantEstoque <0 || precoUn <0) {
	    		 throw new NumeroNaoNaturalException();
	    	 }
	    	 Produto produto = new Produto(codigo, nomeProduto, precoUn, quantEstoque);
	    	 this.listaProduto.add(produto);
	    	 System.out.println("--- Produto "+nomeProduto + " foi cadastrdo com sucesso! ---");
    	 } catch(NumeroNaoNaturalException nnne) {
    		 System.out.println(nnne.getMessage());
    	 } catch(Exception e){
    		 System.out.println("ERRO: " + e.getMessage());
    	 }
     }
     
     public void cadastrarClientes(int cpf, String nome, int senha) throws NumeroNaoNaturalException, Exception{
    	 try {
	    	 if(cpf<0 || senha<0) {
	    		throw new NumeroNaoNaturalException();
	    	 }
	    	 Cliente cliente = new Cliente(cpf, nome, senha);
	    	 this.listaCliente.add(cliente);
	    	 System.out.println("--- Cliente "+nome+" foi cadastrado com sucesso! ---");
    	 } catch(NumeroNaoNaturalException nnne) {
    		 System.out.println(nnne.getMessage());
    	 } catch(Exception e){
    		 System.out.println("ERRO: " + e.getMessage());
    	 }
     }
     
     public void listarProdutosCadastrados() {
    	 for(Produto produto : this.listaProduto) {
    		 produto.imprimirDadosProdutos();
    	 }
    	 System.out.println("Lista Total dos Produtos impressa!");
    	 System.out.println();
     }
     
     public void efetuarVenda(int cpf, int senha, int codigo, int quantidade) throws NumeroNaoNaturalException, SenhaException, CpfException, Exception{
    	 try {
	    	 if(cpf<0 || senha<0 || codigo<0 || quantidade <0) {
	    		 throw new NumeroNaoNaturalException();
	    	 }
	    	 for(Cliente cliente : this.listaCliente) {
	    		 if(cliente.getCpf() == cpf) {
	    			 if(cliente.getSenha() == senha) {
	    				 for(Produto produto : this.listaProduto) {
	    					 if(produto.getCodigo() == codigo) {
	    						 produto.realizarVenda(quantidade);
	    						 break;
	    					 }
	    				 }
	    			 }else {
	    				 System.out.println("Venda Negada!");
	    				 throw new SenhaException();
	    			 }
	    		 }else {
	    			 System.out.println("Venda Negada!");
	    			 throw new CpfException();
	    		 }
	    	 }
    	 } catch(NumeroNaoNaturalException nnne) {
    		 System.out.println(nnne.getMessage());
    	 } catch(SenhaException se) {
    	     System.out.println(se.getMessage());
    	 } catch(CpfException ce) {
    		 System.out.println(ce.getMessage());
    	 } catch(Exception e){
    		 System.out.println("ERRO: " + e.getMessage());
    	 }
     }
     
     public void reporEstoque(int codigo, int quantidade) {
    	 for(Produto produto: this.listaProduto) {
    		 if(produto.getCodigo() == codigo) {
    			 produto.atualizarEstoque(quantidade);
    		 }
    	 }
     }
}
