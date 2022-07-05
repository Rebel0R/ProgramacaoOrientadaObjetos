package ricardo;

public class NumeroNaoNaturalException extends Exception{
     
	public NumeroNaoNaturalException() {
		super("Número não natural informado!");
	}
	
	/*public NumeroNaoNaturalException(String mensagem) {
		super(mensagem);
	}*/
}
