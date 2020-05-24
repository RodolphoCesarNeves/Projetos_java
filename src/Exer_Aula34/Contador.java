package Exer_Aula34;

public class Contador {
	private static int contador;
	
	
	
	public Contador() {		
		
	}
	
public Contador(int contador) {	
	this.contador=contador;
		
	}

	public static int getContador() {
		return contador;
	}

	public static void setContador(int contador) {
		Contador.contador = contador;
	}
	
	public static int zerarContador() 
	{
		contador=0;
		return contador;
	}
	
	public static int incrementarContador(int increment) 
	{	contador+=(increment +1);		
		return contador;
	}
	
	

	

}
