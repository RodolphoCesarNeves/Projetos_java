package Exer_Aula_34_labs;

public class Exer01 {
	
	static void imprimirValor() 
	{
		System.out.println(Contador.obterValor());
	}

	public static void main(String[] args) {
		
		imprimirValor();
		Contador.incrementar();
		imprimirValor();
		Contador.zerar();
		imprimirValor();
		Contador.incrementar();
		Contador.incrementar();
		Contador.incrementar();
		imprimirValor();
		
		Contador cont1= new Contador();
		Contador cont2= new Contador();
		Contador cont3= new Contador();
		imprimirValor();
	}

}
