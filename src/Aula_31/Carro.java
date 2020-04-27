package Aula_31;

public class Carro {

	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;

	



// exemplo de método sem retorno
          public void exibirAutonomia() 
{
	System.out.println("A autonomia do carro é " + this.capCombustivel * this.consumoCombustivel + " Km");
}
//exemplo de método com retorno

          public double obterAutonomia()
{
	return capCombustivel* this.consumoCombustivel;
}
//exemplo de método com parâmetro
          
          private double divideKMporCombustivel (double Km) 
          {
        	  return Km/this.consumoCombustivel;
          }

          public double calcularCombustivel(double km) 
{
				return divideKMporCombustivel(km);
	 
}

}
