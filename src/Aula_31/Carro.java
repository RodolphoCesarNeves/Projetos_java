package Aula_31;

public class Carro {

	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;

	



// exemplo de m�todo sem retorno
          public void exibirAutonomia() 
{
	System.out.println("A autonomia do carro � " + this.capCombustivel * this.consumoCombustivel + " Km");
}
//exemplo de m�todo com retorno

          public double obterAutonomia()
{
	return capCombustivel* this.consumoCombustivel;
}
//exemplo de m�todo com par�metro
          
          private double divideKMporCombustivel (double Km) 
          {
        	  return Km/this.consumoCombustivel;
          }

          public double calcularCombustivel(double km) 
{
				return divideKMporCombustivel(km);
	 
}

}
