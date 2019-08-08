package exercicios_java;


public class LerIdade {
	public static void main(String args[]) 
	{	
		int idade[]= {34,31,22,23,19,34,45,25,27,27};
		int soma=0;
		for (int valor: idade) {
			soma+=valor;
		}
		int media= soma/idade.length;
		System.out.println("A média das idades é: " + media);
	}
		
}
