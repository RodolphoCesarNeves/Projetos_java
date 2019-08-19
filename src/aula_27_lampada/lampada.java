package aula_27_lampada;

public class lampada {
	String modelo;
	String tensao;
	int potencia;
	String cor;
	String tipoLuz;
	int garantiaMeses;
	String[] tipos;
	boolean tipoAbajour;
	int luminosidade;
	boolean estahligada;
	
	void acender() 
	{
		estahligada=true;
	}
	
	void apagar() 
	{
		estahligada= false;
	}
	
	void verificar() 
	{
		if (estahligada) 
		{
			System.out.println("A lâmpada está ligada");
		}else 
		{
			System.out.println("A lâmpada está desligada");
		}
	}
	
	

}
