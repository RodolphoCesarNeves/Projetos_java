/* Criar um vetor A com 10 elementos inteiros. Desenvolver um programa que verifique se "todos" os elementos do vetor A são pares. Se
 * pelo menos um elemento do vetor não for par, o processo de repetição para percorrer os elementos do vetor deve ser encerrado, como
 * sugestão: Utilize uma variável do tipo flag pára atingir este propósito. 
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
			System.out.println("Entre com um número para a posição "+ i);			
			vetorA[i]= scan.nextInt();
			
			if(vetorA[i]%2!=0) 
			{
				System.out.println("O elemento "+ vetorA[i]+ " Não é par");
				System.out.println("O processo será encerrado");
				
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
