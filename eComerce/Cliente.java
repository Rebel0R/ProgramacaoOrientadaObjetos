package ricardo;

public class Cliente {
    
	 private int cpf;
	 private String nome;
	 private int senha;
	 
	 public Cliente(int cpf, String nome, int senha) {
		
		this.cpf = cpf;
		this.nome = nome;
		this.senha = senha;
	 }
	 
	 public void imprimirDadosCliente() {
		 System.out.println("--- Dados Cliente ---");
		 System.out.println("Nome: " + this.nome);
		 System.out.println("Cpf: " + this.cpf);
	 }

	 public int getCpf() {
		return cpf;
	 }

	 public String getNome() {
		return nome;
	 }

	 public int getSenha() {
		return senha;
	 }
	 
	 
}
