/*Ler um vetor A com 10 elementos inteiros correspondentes as idades de um grupo de pessoas. Escreva um programa que determine
 * e escreva a quantidade de pessoas que possuem idade superior a 35 anos. 
 */
package Aula_19_Arrays;

import java.util.Scanner;

public class Exer17 {
	public static void main(String[] args) 
	{
		Scanner scan= new Scanner(System.in);
		int[] vetorA= new int[10];
		
		for(int i=0; i<vetorA.length;i++) 
		{
			System.out.println("Informe a idade da "+(i+1) + "°" +" pessoa");
			vetorA[i]= scan.nextInt();
		}
		
		int qtd=0;
		for (int i=0; i<vetorA.length;i++) 
		{
			if(vetorA[i]>35) 
			{
				qtd++;
			}
		}
		
		System.out.print("Vetor A: ");
		for (int i=0; i< vetorA.length;i++) 
		{
			System.out.print(vetorA[i]+ " ");
		}
		
		System.out.println();
		
		System.out.println("Qtd pessoas idade > 35: "+qtd );		
		
	}

}
