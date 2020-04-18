package Aula_29;

public class Carro {
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
	Carro()
	{
		System.out.println("Classe Carro foi instanciada");
	}
	
	Carro(String marca_, String modelo_, int numPassageiros_, double capCombustivel_,double consumoCombustivel_)
	{
		marca= marca_;
		modelo=modelo_;
		numPassageiros= numPassageiros_;
		capCombustivel= capCombustivel_;
		consumoCombustivel= consumoCombustivel_;
	}
	
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
