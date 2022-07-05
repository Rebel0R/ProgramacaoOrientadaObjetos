package ricardo;

//Todos estes dados da conta corrente, devem ser inicializados no momento da criação no Modo Constr
public class ContaCorrente extends Correntista{
     
     private double limite;
	 
     public ContaCorrente(String nome, long cpf, int numAgencia, int numConta, int senha, double saldo,
    		              String logradouro, int numero, String cidade, String undFederativa, double limite) {
			super(nome, cpf, numAgencia, numConta, senha, saldo, logradouro, numero, cidade, undFederativa);
			this.limite = limite;
	 }
     
     @Override
     public void depositarConta(double valor) {
    	 if(valor>0) {
    		 System.out.println("--- DEPÓSITO EM ANDAMENTO ---");
    		 this.saldo += valor;
    		 System.out.println("--- DEPÓSITO EFETUADO COM SUCESSO! ---");
    		 System.out.println("Valor depositado -  R$"+valor);
    		 System.out.println("Valor do salto atual -  R$" + this.saldo);
    	 }else {
    		 System.out.println("!!! ERRO !!!");
    		 System.out.println("!!! VALOR INVÁLIDO !!!");
    	 }
     }
     @Override
     public void sacarConta(double valor, int novaSenha) {
    	 if(valor>0) {
    		if(this.saldo>(this.limite *-1)) {
    			if(this.senha == novaSenha) {
        			double limiteTotal = this.saldo + this.limite;
        			if(limiteTotal>=valor) {
        				System.out.println("--- SAQUE EM ANDAMENTO ---");
        	    		if(this.saldo<=0) {
        	    			limiteTotal -= valor;
        	    			this.saldo = limiteTotal;
        	    			System.out.println("Valor sacado -  R$"+valor);
            	    		System.out.println("--- SAQUE EFETUADO COM SUCESSO! ---");
            	    		System.out.println("--- CONTA EM DÉBITO COM O BANCO ---");
            	    		System.out.println("Valor do salto atual -  R$" + this.saldo);
        	    		}else {
        	    			limiteTotal -= valor;
        	    			this.saldo = limiteTotal;
        	    			System.out.println("Valor sacado -  R$"+valor);
            	    		System.out.println("--- SAQUE EFETUADO COM SUCESSO! ---");
            	    		System.out.println("Valor do salto atual -  R$" + this.saldo);
        	    		}
        	    		
        			}else {
        				System.out.println("!!! ERRO !!!");
               		    System.out.println("!!! SAQUE CANCELADO !!!");
        			}
        		}else {
        			System.out.println("!!! ERRO !!!");
           		    System.out.println("!!! SENHA INVÁLIDO !!!");
        		}
    		}else {
    			System.out.println("!!! ERRO !!!");
       		    System.out.println("!!! SALDO INVÁLIDO !!!");
       		    System.out.println("VALOR SALDO - R$"+this.saldo);
    		}
    		
    	 }else {
    		 System.out.println("!!! ERRO !!!");
    		 System.out.println("!!! VALOR INVÁLIDO !!!");
    	 }
     }
     
     public void imprimirSaldo(int novaSenha) {
         if(this.senha == novaSenha) {
        	 System.out.println("--- BANCO CENTRAL ---");
        	 System.out.println("DADOS ->  CONTA CORRENTE");
        	 System.out.println("AGÊNCIA - "+this.numAgencia +" CONTA - "+this.numConta);
        	 super.imprimirDados();
        	 System.out.println("SALDO - R$"+this.saldo);
        	 System.out.println("LIMITE - R$"+this.limite);
         }else {
        	 System.out.println("!!! ERRO !!!");
    		 System.out.println("!!! SENHA INVÁLIDO !!!");
         }
     }

	 public int getNumAgencia() {
		return numAgencia;
	 }

	 public void setNumAgencia(int numAgencia) {
		this.numAgencia = numAgencia;
	 }

	 public int getNumConta() {
		return numConta;
	 }

	 public void setNumContaC(int numContaC) {
		this.numConta = numContaC;
	 }

	 public int getSenha() {
		return senha;
	 }

	 public void setSenha(int senha) {
		this.senha = senha;
	 }

	 public double getSaldo() {
		return saldo;
	 }

	 public double getLimite() {
		return limite;
	 }

	 public void setLimite(double limite) {
		this.limite = limite;
	 }
     
     
     
}
