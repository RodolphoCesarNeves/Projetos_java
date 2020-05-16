package Exer_Aula33;

import java.util.Scanner;

public class tastarLampada {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Lampada lampada = new Lampada();
		lampada.setVoltagem(220);
		lampada.setTipo("Led");
		lampada.setCor("Branca");
		lampada.setLigada(true);
		lampada.setPotencia(9);
		
		System.out.print("O status da lâmpada é: ");	
		if (lampada.isLigada()) 
		{
			System.out.print("Ligada");
		}else 
		{
			System.out.print("Desligada");
		}
		System.out.println();
		if (lampada.isLigada()==false){
		System.out.println ("Deseja ligar a Lâmpada ? S/N");
		String status = teclado.nextLine();
		if (status.equalsIgnoreCase("s"))
		{
			lampada.ligarLampada();
		}
		}else 
		{
		System.out.println ("Deseja desligar a Lâmpada ? S/N");
		String status = teclado.nextLine();
		if(status.equalsIgnoreCase("s")) 
		{
			lampada.desligarLampada();
		}
		}
		
		System.out.print ("A lâmpada está: ");
		if (lampada.isLigada()) 
		{
			System.out.print("Ligada");
		}else 
		{
			System.out.print("Desligada");
		}
		System.out.println();
		System.out.println ("A lâmpada possui as seguintes características: Tipo:" + lampada.getTipo()
							+ "\nCor: "+ lampada.getCor()
							+ "\nVoltagem: " + lampada.getVoltagem() +"V" 
							+ "\nPotência: " + lampada.getPotencia() + "W"); 
		
		

	}

}
