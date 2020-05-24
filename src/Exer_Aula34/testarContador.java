package Exer_Aula34;

public class testarContador {

	public static void main(String[] args) {
		
		Contador.setContador(10);
		Contador.incrementarContador(5);
		System.out.println(" O valor do contador é " +Contador.getContador());
		Contador.zerarContador();
		System.out.println(" O valor do contador é " +Contador.getContador());
		Contador.incrementarContador(1);
		System.out.println(" O valor do contador é " +Contador.getContador());
	}

}
