package ricardo;

public class ContaPoupanca extends Correntista{
     
	private double rendimento; //informar em numero decimal (ex: 0.10)
	
	public ContaPoupanca(String nome, long cpf, int numAgencia, int numConta, int senha, double saldo,
			String logradouro, int numero, String cidade, String undFederativa, double rendimento) {
		super(nome, cpf, numAgencia, numConta, senha, saldo, logradouro, numero, cidade, undFederativa);
		this.rendimento = rendimento;
	}
	@Override
	public void depositarConta(double valor) {
   	 if(valor>0) {
   		 System.out.println("--- DEPÓSITO EM ANDAMENTO ---");
   		 this.saldo += valor;
   		 this.saldo = calcularRendimento();
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
			if(this.saldo>0) {
				if(saldo>=valor) {
					if(this.senha == novaSenha) {
						System.out.println("--- SAQUE EM ANDAMENTO ---");
	    	    		this.saldo -= valor;
	    	    		System.out.println("Valor sacado -  R$"+valor);
	    	    		System.out.println("--- SAQUE EFETUADO COM SUCESSO! ---");
	    	    		System.out.println("Valor do salto atual -  R$" + this.saldo);
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
       		    System.out.println("!!! SALDO INVÁLIDO !!!");
       		    System.out.println("VALOR SALDO - R$"+this.saldo);
			}
		}else {
			 System.out.println("!!! ERRO !!!");
	   		 System.out.println("!!! VALOR INVÁLIDO !!!");
		}
	}
	
	public double calcularRendimento() {
		return this.saldo + (this.saldo * this.rendimento);
	}
		
    public void imprimirSaldo(int novaSenha) {
    	if(this.senha == novaSenha) {
       	 System.out.println("--- BANCO CENTRAL ---");
       	 System.out.println("DADOS ->  CONTA CORRENTE");
       	 System.out.println("AGÊNCIA - "+this.numAgencia +" CONTA - "+this.numConta);
       	 super.imprimirDados();
       	 System.out.println("SALDO - R$"+this.saldo);
       	 System.out.println("RENDIMENTO - R$"+this.rendimento);
        }else {
       	 System.out.println("!!! ERRO !!!");
   		 System.out.println("!!! SENHA INVÁLIDO !!!");
        }
    }
     
}
