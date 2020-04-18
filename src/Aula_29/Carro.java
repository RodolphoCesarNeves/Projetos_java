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
