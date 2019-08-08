package exercicios_java;

import java.util.Scanner;

public class LerString {
	public static void main (String args[]) 
	{
		Scanner teclado= new Scanner (System.in);
		System.out.println("Digite um nome");
		String nome = teclado.nextLine();
		//O número de caracteres da string
		System.out.println("O nome tem " + nome.length() + " caracteres");
		//A string com todas suas letras em maiúsculo
		System.out.println("O nome digitado em maiúsculo foi: " + nome.toUpperCase());
		//O número de vogais da string
		nome.toLowerCase();
		int contarvogal=0;
		for(int i=0;i<nome.length();i++) 
		{
			char vogal=nome.charAt(i);
			if (vogal=='a'||vogal=='e' ||vogal=='i' ||vogal=='o' ||vogal=='u') 
			{
				contarvogal++;
			}
			
		}
		System.out.println("O nome " + nome + " tem " + contarvogal + " vogais");
		
		//Se a string digitada começa com “UNI” (ignorando	maiúsculas/minúsculas)
		 if (nome.toUpperCase().startsWith("UNI"))
				 {
			 		System.out.println(" O nome começa com as iniciais "+ "UNI");
				 }
		 
		 //Se a string digitada termina com “RIO” (ignorando maiúsculas/minúsculas)
		 if(nome.toUpperCase().endsWith("RIO")) 
		 {
			 System.out.println(" O nome termina com as letras " + "RIO");
		 }
		 
		 //Se a string é um palíndromo ou não
		 String palavrainvertida= "";		 		 
		 	for (int i=nome.length()-1; i>=0; i--)
		 	{	
		 		palavrainvertida+=nome.charAt(i);
		 	}
		 	
		 if (palavrainvertida.equalsIgnoreCase(nome)) 
		 {
			 System.out.println("A palavra " + nome +  " é um palíndromo");	
		 } else 
		 {
			 System.out.println("A palavra " + nome +  " não é um palíndromo");	
		 }
			 
			 		
				 
	}


	

}
