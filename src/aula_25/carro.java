package aula_25;

public class carro {
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
	// exemplo de método sem retorno
	void exibirAutonomia() 
	{
		System.out.println("A autonomia do carro é " + capCombustivel * consumoCombustivel + " Km");
	}
//exemplo de método com retorno
	
	double obterAutonomia()
	{
		return capCombustivel* consumoCombustivel;
	}
	//exemplo de método com parâmetro
	
	double calcularCombustivel(double km) 
	{
		double qtdCombustivel= km/consumoCombustivel;
		return qtdCombustivel;
		
	}
	
}
