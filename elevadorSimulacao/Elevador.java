package ricardo;
//Ricardo Antonio Rebelo Junior  Ra:2065770
public class Elevador {
     private int andar; //ex: terreo = 0
     private int totalAndares; //desonciderando o terreo (0)
     private int capacidadePessoas;
     private int quantidadePessoas;
     private String predio;
     
     public Elevador(int totalAndares, int capacidadePessoas, String predio) {
    	 this.totalAndares = totalAndares;
    	 this.capacidadePessoas = capacidadePessoas;
    	 this.predio = predio;
    	 this.andar = 0;
    	 this.quantidadePessoas = 0;
     }
     
     public void subirAndar() {
    	 if(this.quantidadePessoas > 0 && this.quantidadePessoas <= this.capacidadePessoas) {
    		 if(this.andar < this.totalAndares) {
    			 this.andar ++;
    			 System.out.println("Subindo...");
    			 System.out.println("Andar -  "+this.andar+" alcan�ado!");
    		 }else if(this.andar == this.totalAndares){
    			 System.out.println("Ultimo andar!");
    		 }
    	 }else {
    		 System.out.println("Quantidade de pessoas fora do padr�o do elevador!");
    	 }
    	 
     }
     
     public void descerAndar() {
    	 if(this.quantidadePessoas > 0 && this.quantidadePessoas <= this.capacidadePessoas) {
               if(this.andar <= this.totalAndares) {
    		       if(this.andar<=0) {
    		    	  System.out.println("Imposs�vel descer. O elevador est� no t�rreo.");
    		       }else {
	            	   this.andar --;
	    		       System.out.println("Descendo...");
	    		       System.out.println("Andar -  "+this.andar+" alcan�ado!");
    		       }
    	     }
    	 }else {
    		 System.out.println("Quantidade de pessoas fora do padr�o do elevador!");
    	 }
     }
     
     public void entrarElevador(int pessoa) {
    	 if(pessoa > 0) {
    		 this.quantidadePessoas += pessoa;
        	 if(this.quantidadePessoas <= this.capacidadePessoas){
        		 System.out.println("Entram "+pessoa+" pessoa(s) no elevador.");
        		 System.out.println("Quantidade atual: "+this.quantidadePessoas);
        	 }else {
        		 this.quantidadePessoas -= pessoa;
        		 System.out.println("N�mero de pessoas superior a capacidade m�xima permitida!");
        		 System.out.println("Opera��o cancelada.");
        	 }
    	 }else {
    		 System.out.println("N�mero de pessoas inferior a zero, opera��o cancelada!");
    	 }
     }
     
     public void sairElevador(int pessoa) {
    	 if(pessoa > 0) {
    		 this.quantidadePessoas -= pessoa;
        	 if(this.quantidadePessoas >= 0) {
        		 System.out.println("Sairam "+pessoa+" pessoa(s) do elevador.");
        		 System.out.println("Quantidade atual: "+this.quantidadePessoas);
        	 }else {
        		 this.quantidadePessoas += pessoa;
        		 System.out.println("Numero de pessoas inferior a capacidade minima do elevador.");
        		 System.out.println("Opera��o cancelada.");
        	 }
    	 }else {
    		 System.out.println("N�mero de pessoas inferior a zero, opera��o cancelada!");
    	 }
     }
     
     public void imprimirRelatorioElevador() {
    	 System.out.println("====================");
    	 System.out.println("Rel�torio do Elevador");
    	 System.out.println("Pr�dio ->  "+this.predio);
    	 System.out.println("Capacidade Max. Permitida: "+this.capacidadePessoas);
    	 System.out.println("Quantidade de pessoas no elevador: "+this.quantidadePessoas);
    	 System.out.println("Total de andares do "+this.predio+": "+this.totalAndares);
    	 if(this.andar == 0) {
    		 System.out.println("Andar atual: T�rreo.");
    	 }else {
    		 System.out.println("Andar atual: "+this.andar+"� andar.");
    	 }
    	 System.out.println("=====================");
    	 
     }

	public int getAndar() {
		return andar;
	}

	public int getTotalAndares() {
		return totalAndares;
	}

	public int getCapacidadePessoas() {
		return capacidadePessoas;
	}

	public int getQuantidadePessoas() {
		return quantidadePessoas;
	}

	public String getPredio() {
		return predio;
	}
}
