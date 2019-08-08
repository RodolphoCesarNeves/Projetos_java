package exercicios_java;

import java.util.Scanner;

public class LerNomes2 {
	
	public static void main(String args[]) 
{
	Scanner teclado = new Scanner (System.in);
	String nome[] = new String [10];
	for (int x=0; x<10; x++) 
	{	System.out.println("Digite o Nome " + x);
		nome[x]= teclado.nextLine();
	}
	
	System.out.println("Os nomes Digitados foram: \n");
	for (int i=0; i<nome.length;i++) 
	{
		System.out.println(nome[i]);
	}
}

}
