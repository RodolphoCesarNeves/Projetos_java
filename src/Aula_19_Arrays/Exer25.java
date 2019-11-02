/* Criar um vetor A com 10 elementos inteiros. Construir um vetor B de mesmo tipo e tamanho, obedecendo as seguintes regras de 
 * forma��o:
 * a) B dever� receber 1 quando A for par;
 * b) B dever� receber 0 quando A for �mpar; 
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
			System.out.println("Entre com um n�mero para a posi��o "+ i);
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
			// Pode ser utilizado o operador tern�rio no lugar do if/else
			
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