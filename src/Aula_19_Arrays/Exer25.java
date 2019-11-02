/* Criar um vetor A com 10 elementos inteiros. Construir um vetor B de mesmo tipo e tamanho, obedecendo as seguintes regras de 
 * formação:
 * a) B deverá receber 1 quando A for par;
 * b) B deverá receber 0 quando A for ímpar; 
 */
package Aula_19_Arrays;

import java.util.Scanner;

public class Exer25 {
	public static void main (String[] args) 
	{
		Scanner scan= new Scanner(System.in);
		
		int[] vetorA= new int[10];
		int[] vetorB= new int[vetorA.length];
		
		for(int i=0; i<vetorA.length;i++) 
		{	
			System.out.println("Entre com um número para a posição "+ i);
			vetorA[i]=scan.nextInt();
			/*
			if(vetorA[i]%2==0)
			{
				vetorB[i]=1;
			}else 			
			{
				vetorB[i]=0;
			}
			*/
			// Pode ser utilizado o operador ternário no lugar do if/else
			
			vetorB[i] = (vetorA[i]%2==0) ? 1 : 0;
		}
		
		System.out.print("Vetor A: ");
		for(int i=0; i<vetorA.length;i++) 
		{
			System.out.print(vetorA[i]+ " ");
		}
		System.out.println();
		
		System.out.print("Vetor B: ");
		for(int i=0; i<vetorB.length;i++) 
		{
			System.out.print(vetorB[i]+ " ");
		}
		System.out.println();
		
		
		
		
		
		
		
	}

}