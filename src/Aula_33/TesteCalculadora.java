package Aula_33;

public class TesteCalculadora {
	public static void main(String args[]) 
	{
		MinhaCalculadora calc = new MinhaCalculadora();
		
		calc.soma(1, 2);
		calc.soma(1.0, 2.0);
		
		System.out.println("O soma de inteiros é: "+ calc.soma(1, 2));
		System.out.println("O soma de doubles é: "+ calc.soma(1.0, 2.0));
	}

}
