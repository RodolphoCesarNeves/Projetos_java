package Aula_32;

public class Carro {
	private String marca;
	private String modelo;
	private int numPassageiros;
	private double capCombustivel;
	public double getCapCombustivel() {
		return capCombustivel;
	}

	public void setCapCombustivel(double capCombustivel) {
		this.capCombustivel = capCombustivel;
	}

	public double getConsumoCombustivel() {
		return consumoCombustivel;
	}

	public void setConsumoCombustivel(double consumoCombustivel) {
		this.consumoCombustivel = consumoCombustivel;
	}

	private double consumoCombustivel;
	
	
	public String getMarca() 
	{
		return this.marca;
	}
	
	public void setMarca(String marca) 
	{
		this.marca=marca;
	}
	
	public String getModelo() 
	{
		return this.modelo;
	}
	
	public void setmodelo(String modelo) 
	{
		this.modelo=modelo;
	}
	
	public int getNumPassageiros() 
	{
		return this.numPassageiros;
	}
	
	public void setNumPassageiros(int numPassageiros) 
	{
		this.numPassageiros=numPassageiros;
	}

}
