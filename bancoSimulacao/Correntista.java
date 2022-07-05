package ricardo;

//Ricardo A Rebelo Jr    2065770
public abstract class Correntista {
      protected String nome;
      protected long cpf;
      protected int numAgencia;
      protected int numConta;
      protected int senha;
      protected double saldo;
      protected Endereco enderecoPessoal;
	  
      public Correntista(String nome, long cpf, int numAgencia, int numConta, int senha, double saldo, String logradouro, int numero, String cidade, String undFederativa) {
    	this.numAgencia = numAgencia;
	    this.numConta = numConta;
	    this.senha = senha;
		this.saldo = saldo;
    	this.nome = nome;
		this.cpf = cpf;
		this.enderecoPessoal = new Endereco(logradouro, numero, cidade, undFederativa);
	  }
      
      public void imprimirDados(){
    	 System.out.println("---- Dados Correntista ----"); 
    	 System.out.println("Nome - "+this.nome); 
    	 System.out.println("CPF - "+this.cpf); 
    	 this.enderecoPessoal.imprimirEndereco();
    	 
      }
      
      public void atualizarEnderecoPessoal(String logradouro, int numero, String cidade, String undFederativa) {
  		this.enderecoPessoal.setLogradouro(logradouro);
  		this.enderecoPessoal.setNumero(numero);
  		this.enderecoPessoal.setCidade(cidade);
  		this.enderecoPessoal.setUndFederativa(undFederativa);
  	  }
      
      public abstract void depositarConta(double valor);
      public abstract void sacarConta(double valor, int novaSenha);
      
      
}
