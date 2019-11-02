/* Criar um vetor A com 10 elementos inteiros.Implementar um programa que defina e escreva a quantidade de elementos armazewnados 
 * nesse vetor que são pares
 */
package Aula_19_Arrays;

import java.util.Scanner;

public class Exer11 {
	public static void main(String[] args) 
	{
		int[] vetorA= new int[10];
		Scanner scan= new Scanner(System.in);
		
		for(int i=0; i<vetorA.length;i++) 
		{
			System.out.println("Entre com o valor do "+(i+1)+"° "+ "número");
			vetorA[i]= scan.nextInt();
			
		}
		
		int qtdPares=0;
		for(int i=0; i<vetorA.length; i++) 
		{	
			if(vetorA[i]%2==0) 
			{
				qtdPares++;
			}
			
		}
		
		System.out.print("Vetor A= ");
		for(int i=0; i<vetorA.length;i++) 
		{
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();
		
		System.out.println("Qtd números pares: "+ qtdPares);
	
		}
		
	}


