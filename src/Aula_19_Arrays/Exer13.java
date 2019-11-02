/* Criar um vetor A com 10 elementos inteiros. Implementar um programa que determina a soma dos elementos armazenados neste vetor
 * que são múltiplos  de 5.
 */
package Aula_19_Arrays;

import java.util.Scanner;

public class Exer13 {
	public static void main(String[] args) 
	{
		int[] vetorA= new int[10];
		Scanner scan= new Scanner(System.in);
		
		
		for(int i=0; i<vetorA.length;i++) 
		{
			System.out.println("Entre com o valor na posição "+ i);
			vetorA[i]= scan.nextInt();
			
			
		}
		
		int soma=0;
	
		for(int i=0; i<vetorA.length; i++) 
			{	if (vetorA[i]%5==0) {
			soma +=vetorA[i];
			} 
								}
		
		System.out.print("Vetor A= ");
		for(int i=0; i<vetorA.length;i++) 
		{
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();
		
		if (soma==0) 
		{		
			System.out.println ("O vetor A não possui nenhum número múltiplo de 5");
		}else
		System.out.println("Soma: "+ soma);
	
		}
		

}
