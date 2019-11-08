/* Ler um vetor A com 10 elementos e construir um vetor B de mesmo tipo e tamanho, e com os elementos de A, sendo que estes deverão estar invertidos, ou seja,
 * o primeiro elemento de A passa a ser o último elemento de B, o segundo elemento de A passa a ser o penúltimo elemento de B, e assim por diante. 
 */
package Aula_19_Arrays;

import java.util.Scanner;

public class Exer28 {
	public static void main (String[] args) 
	{
		Scanner scan= new Scanner(System.in);
		
		int[] vetorA= new int[10];
		int[] vetorB= new int[vetorA.length];
		
		for(int i=0;i<vetorA.length;i++) 
		{
			System.out.println("Entre com o valor da posição "+ i);
			vetorA[i]=scan.nextInt();
			//vetorB[i]=vetorA[vetorA.length-i-1];
			vetorB[vetorA.length-i-1]=vetorA[i];
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
