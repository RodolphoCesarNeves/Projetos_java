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
		
		System.out.print("O status da l�mpada �: ");	
		if (lampada.isLigada()) 
		{
			System.out.print("Ligada");
		}else 
		{
			System.out.print("Desligada");
		}
		System.out.println();
		if (lampada.isLigada()==false){
		System.out.println ("Deseja ligar a L�mpada ? S/N");
		String status = teclado.nextLine();
		if (status.equalsIgnoreCase("s"))
		{
			lampada.ligarLampada();
		}
		}else 
		{
		System.out.println ("Deseja desligar a L�mpada ? S/N");
		String status = teclado.nextLine();
		if(status.equalsIgnoreCase("s")) 
		{
			lampada.desligarLampada();
		}
		}
		
		System.out.print ("A l�mpada est�: ");
		if (lampada.isLigada()) 
		{
			System.out.print("Ligada");
		}else 
		{
			System.out.print("Desligada");
		}
		System.out.println();
		System.out.println ("A l�mpada possui as seguintes caracter�sticas: Tipo:" + lampada.getTipo()
							+ "\nCor: "+ lampada.getCor()
							+ "\nVoltagem: " + lampada.getVoltagem() +"V" 
							+ "\nPot�ncia: " + lampada.getPotencia() + "W"); 
		
		

	}

}
