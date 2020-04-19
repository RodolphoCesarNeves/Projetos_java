package Aula_30;

public class Carro {
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
	
	
	public Carro(String marca, String modelo, int numPassageiros, double capCombustivel, double consumoCombustivel) {
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		this.capCombustivel = capCombustivel;
		this.consumoCombustivel = consumoCombustivel;
	}

	public Carro() {}
	
	

	public Carro(String marca, String modelo, int numPassageiros) {
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		System.out.println("Chamando construtor com três parâmetros");

	}

	public Carro(String marca, String modelo) {
		this(marca, modelo, 10);
		System.out.println("Chamando construtor com dois parâmetros");
	}

	// exemplo de método sem retorno
	void exibirAutonomia() 
	{
		System.out.println("A autonomia do carro é " + this.capCombustivel * this.consumoCombustivel + " Km");
	}
//exemplo de método com retorno
	
	double obterAutonomia()
	{
		return capCombustivel* this.consumoCombustivel;
	}
	//exemplo de método com parâmetro
	
	double calcularCombustivel(double km) 
	{
		double qtdCombustivel= km/this.consumoCombustivel;
		return qtdCombustivel;
		
	}
	

}
