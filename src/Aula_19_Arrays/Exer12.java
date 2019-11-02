/* Criar um vetor A com 10 elementos inteiros.Implementar um programa que defina e escreva a soma de todos os elementos armazewnados 
 * nesse vetor
 */
package Aula_19_Arrays;

import java.util.Scanner;

public class Exer12 {
	
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
		{	
			soma +=vetorA[i];
			
		}
		
		System.out.print("Vetor A= ");
		for(int i=0; i<vetorA.length;i++) 
		{
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();
		
		System.out.println("Soma: "+ soma);
	
		}
		

}
