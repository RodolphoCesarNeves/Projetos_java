package aula_25;

public class carro {
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
	// exemplo de m�todo sem retorno
	void exibirAutonomia() 
	{
		System.out.println("A autonomia do carro � " + capCombustivel * consumoCombustivel + " Km");
	}
//exemplo de m�todo com retorno
	
	double obterAutonomia()
	{
		return capCombustivel* consumoCombustivel;
	}
	//exemplo de m�todo com par�metro
	
	double calcularCombustivel(double km) 
	{
		double qtdCombustivel= km/consumoCombustivel;
		return qtdCombustivel;
		
	}
	
}
