package aula_25;

public class testeCarro {
	public static void main (String[] args)
	{
		carro van = new carro();
		van.marca= "Fiat";
		van.modelo="Ducato";
		van.numPassageiros=10;
		van.capCombustivel=100;
		van.consumoCombustivel=0.2;
		
		System.out.println(van.marca);
		System.out.println(van.modelo);
		van.exibirAutonomia();
	System.out.println("A autonomia do carro é " + van.obterAutonomia() + " Km");
	
	double qtdCombustivel= van.calcularCombustivel(10);
	
	System.out.println("A quantidade de combustível é igual a " + qtdCombustivel);
		
	}
	

}
