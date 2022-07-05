package ricardo;

public class ElevadorTeste {
     public static void main(String[] args) {
		Elevador elevador1 = new Elevador(12, 6, "Edificio Anchieta");
		
		elevador1.entrarElevador(6);
		elevador1.subirAndar();
		elevador1.sairElevador(5);
		elevador1.sairElevador(1);
		elevador1.sairElevador(1);
		elevador1.entrarElevador(1);
		elevador1.subirAndar();
		System.out.println(elevador1.getAndar());
		//System.out.println(elevador1.getAndar());
		elevador1.descerAndar();
		elevador1.descerAndar();
		//elevador1.descerAndar();
		elevador1.imprimirRelatorioElevador();
	}
}
