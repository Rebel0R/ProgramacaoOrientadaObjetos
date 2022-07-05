package ricardo;

public class Endereco {
     protected String logradouro;
     protected int numero;
     protected String cidade;
     protected String undFederativa;
	 
     public Endereco(String logradouro, int numero, String cidade, String undFederativa) {
		this.logradouro = logradouro;
		this.numero = numero;
		this.cidade = cidade;
		this.undFederativa = undFederativa;
	 }
     
     public void atualizarEndereco(String logradouro, int numero, String cidade, String undFederativa) {
    	this.logradouro = logradouro;
 		this.numero = numero;
 		this.cidade = cidade;
 		this.undFederativa = undFederativa;
     }
     
     public void imprimirEndereco() {
    	 System.out.println("Logradouro - "+this.logradouro+", Nº - "+this.numero); 
    	 System.out.println("Cidade - "+this.cidade+", UF - "+this.undFederativa); 
     }
     
	 public String getLogradouro() {
		return logradouro;
	 }

	 public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	 }

	 public int getNumero() {
		return numero;
	 }

	 public void setNumero(int numero) {
		this.numero = numero;
	 }

	 public String getCidade() {
		return cidade;
	 }

	 public void setCidade(String cidade) {
		this.cidade = cidade;
	 }

	 public String getUndFederativa() {
		return undFederativa;
	 }

	 public void setUndFederativa(String undFederativa) {
		this.undFederativa = undFederativa;
	 }

     
     
     
}
