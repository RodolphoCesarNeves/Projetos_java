package exercicios_java;

import java.util.Scanner;

public class LerString {
	public static void main (String args[]) 
	{
		Scanner teclado= new Scanner (System.in);
		System.out.println("Digite um nome");
		String nome = teclado.nextLine();
		//O n�mero de caracteres da string
		System.out.println("O nome tem " + nome.length() + " caracteres");
		//A string com todas suas letras em mai�sculo
		System.out.println("O nome digitado em mai�sculo foi: " + nome.toUpperCase());
		//O n�mero de vogais da string
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
		
		//Se a string digitada come�a com �UNI� (ignorando	mai�sculas/min�sculas)
		 if (nome.toUpperCase().startsWith("UNI"))
				 {
			 		System.out.println(" O nome come�a com as iniciais "+ "UNI");
				 }
		 
		 //Se a string digitada termina com �RIO� (ignorando mai�sculas/min�sculas)
		 if(nome.toUpperCase().endsWith("RIO")) 
		 {
			 System.out.println(" O nome termina com as letras " + "RIO");
		 }
		 
		 //Se a string � um pal�ndromo ou n�o
		 String palavrainvertida= "";		 		 
		 	for (int i=nome.length()-1; i>=0; i--)
		 	{	
		 		palavrainvertida+=nome.charAt(i);
		 	}
		 	
		 if (palavrainvertida.equalsIgnoreCase(nome)) 
		 {
			 System.out.println("A palavra " + nome +  " � um pal�ndromo");	
		 } else 
		 {
			 System.out.println("A palavra " + nome +  " n�o � um pal�ndromo");	
		 }
			 
			 		
				 
	}


	

}
