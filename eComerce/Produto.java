package ricardo;

public class Produto {
     
	private int codigo;
	private String nomeProduto;
	private double precoUn;
	private int quantEstoque;
	
	public Produto(int codigo, String nomeProduto, double precoUn, int quantEstoque) {
		
		this.codigo = codigo;
		this.nomeProduto = nomeProduto;
		this.precoUn = precoUn;
		this.quantEstoque = quantEstoque;
	}
	
	public void imprimirDadosProdutos() {
		System.out.println("--- Dados Produtos ---");
		System.out.println("Nome: "+ this.nomeProduto);
		System.out.println("Codigo: " + this.codigo);
		System.out.println("Preço Unitário: R$"+ this.precoUn);
		System.out.println("Quantidade em Estoque: " + this.quantEstoque);
	}
    
	public void realizarVenda(int quantidade) {
		if(quantidade <= this.quantEstoque) {
			this.quantEstoque -= quantidade;

			System.out.println("--- Dados Produtos ---");
			System.out.println("Nome: "+ this.nomeProduto);
			System.out.println("Codigo: " + this.codigo);
			System.out.println("Preço Unitário: R$"+ this.precoUn);
			System.out.println("Quantidade vendida: " + quantidade);
			System.out.println("Quantidade em Estoque: " + this.quantEstoque);
			System.out.println("Valor total da venda: R$" + quantidade*this.precoUn);
			System.out.println("--- Venda Realizada!---");
			System.out.println();
		}
	}
	
	public void atualizarEstoque(int quantidade) {
		this.quantEstoque += quantidade;
		System.out.println("--- Quantidade em estoque atualizada! ---");
		imprimirDadosProdutos();
		System.out.println();
	}
	public int getCodigo() {
		return codigo;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public double getPrecoUn() {
		return precoUn;
	}

	public int getQuantEstoque() {
		return quantEstoque;
	}
	
	
}
