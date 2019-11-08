/*Criar dois vetores A e B cada um com 10 elementos inteiros. Construir um vetor C de mesmo tipo e tamanho, obedecendo as seguintes 
 * regras de formatação:
 * a)C[i] deverá receber 1 quando A[i] for maior do que B[i];
 * b)C[i] deverá receber 0 quando A[i] fpr igual a B[i];
 * c)C[i] deverá receber -1 quando A[i], for menor que B[i] 
 */

package Aula_19_Arrays;

import java.util.Scanner;

public class Exer26 {

	public static void main (String[] args) 
	{
		Scanner scan= new Scanner(System.in);
		
		int[] vetorA= new int[10];
		int[] vetorB= new int[vetorA.length];
		int[] vetorC= new int[vetorA.length];
		
		for(int i=0; i<vetorA.length;i++) 
		{
			System.out.println("Entre com um número para posição A= "+ i);
			vetorA[i]=scan.nextInt();
		} 
		
		for(int i=0; i<vetorB.length;i++) 
		{
			System.out.println("Entre com um número para posição B= "+ i);
			vetorB[i]=scan.nextInt();
			
			if(vetorA[i]==vetorB[i]) 
			{
				vetorC[i]=0;
			}
			
			else if(vetorA[i]>vetorB[i]) 
			{
				vetorC[i]=1;
			}
			
			else
			{
				vetorC[i]=-1;
			}
		} 
		
		
		
		System.out.print("Vetor A: ");
		for(int i=0; i<vetorA.length;i++) 
		{
			System.out.print(vetorA[i]+ " ");
		}
		System.out.println();
		
		System.out.print("Vetor B: ");
		for(int i=0; i<vetorA.length;i++) 
		{
			System.out.print(vetorB[i]+ " ");
		}
		System.out.println();
		
		System.out.print("Vetor C: ");
		for(int i=0; i<vetorA.length;i++) 
		{
			System.out.print(vetorC[i]+ " ");
		}
		System.out.println();
		
		
		
		
	}
}
