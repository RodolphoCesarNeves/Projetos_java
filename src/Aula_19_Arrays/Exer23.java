/* Criar um vetor A com 10 elementos inteiros. Desenvolver um programa que verifique se "todos" os elementos do vetor A s�o pares. Se
 * pelo menos um elemento do vetor n�o for par, o processo de repeti��o para percorrer os elementos do vetor deve ser encerrado, como
 * sugest�o: Utilize uma vari�vel do tipo flag p�ra atingir este prop�sito. 
 */
package Aula_19_Arrays;

import java.util.Scanner;

public class Exer23 {
	public static void main(String[] args) 
	{
		Scanner scan= new Scanner(System.in);
		int [] vetorA= new int[10];
		
		for(int i=0;i<vetorA.length;i++) 
		{
			System.out.println("Entre com um n�mero para a posi��o "+ i);			
			vetorA[i]= scan.nextInt();
			
			if(vetorA[i]%2!=0) 
			{
				System.out.println("O elemento "+ vetorA[i]+ " N�o � par");
				System.out.println("O processo ser� encerrado");
				
			break;
			}
		}
		
		/*
		System.out.print("Vetor A: ");
		for(int i=0; i<vetorA.length;i++) 
		{	
			System.out.print(vetorA[i]+ " ");
			if(vetorA[i]%2!=0) {			
			break;
		}
		}*/
		
		
		
	}

}
