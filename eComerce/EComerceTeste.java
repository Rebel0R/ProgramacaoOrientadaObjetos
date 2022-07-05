package ricardo;

public class EComerceTeste {
    public static void main(String[] args) throws NumeroNaoNaturalException, SenhaException, Exception {
		EComerce loja = new EComerce("Adega Portuges", 852369852, 1234, "www.adegaportuga.com");
		loja.imprimirDadosEmpresa();
		loja.cadastrarProdutos(1, "Refrigerante CocaCola", 5.50, 20);
		loja.cadastrarProdutos(2, "Espetos de Bambu", 2.20, 100);
		loja.cadastrarClientes(123456, "Roberto Marui", 456);
		loja.listarProdutosCadastrados();
		loja.efetuarVenda(123456, 456, 1, 2);
		loja.reporEstoque(1, 5);
		loja.cadastrarClientes(456123, "Maria de Paula", 852);
		loja.efetuarVenda(123456, 457, 1, 1);
	}
}
