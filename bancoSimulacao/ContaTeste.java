package ricardo;

public class ContaTeste {
     public static void main(String[] args) {
		
    
    	 //ContaPoupanca conta1 = new ContaPoupanca("Ricardo Rebelo", 11111, 54545, 33335, 1234, 1000.0, "Rua x", 123, "Cidade Y", "ABC", 0.1);
    	 //conta1.imprimirSaldo(1234);
    	 //conta1.depositarConta(200.00);
    	 //conta1.sacarConta(200.00, 1234);
    	 //conta1.sacarConta(1233, 200);
    	 
    	ContaCorrente conta1 = new ContaCorrente("Ricardo Rebelo", 11111, 54545, 33335, 1234, 1000.0, "Rua x", 123, "Cidade Y", "ABC", 500.0);
    	conta1.imprimirSaldo(1234);
    	//conta1.depositarConta(500.00);
    	conta1.sacarConta(1500.00, 1234);
    	conta1.sacarConta(490.00, 1234);
    	 
	}
}
