/* Criar um vetor A com 10 elementos inteiros. Desenvolver um programa que calcule e escreva:
 * a) A soma de elementos armazenados neste vetor que s�o inferiores a 15;
 * b) A quantidade de elementos armazenados no vetor que s�o iguais a 15;
 * c) A m�dia dos elementos armazenados no vetor que s�o superiores a 15.
 */
package Aula_19_Arrays;

import java.util.Scanner;

public class Exer16 {
	public static void main(String[] args) 
	{	
		int[] vetorA= new int [10];
		Scanner scan= new Scanner(System.in);
		
		//Preenchendo os valores do vetor A
		for (int i=0;i<vetorA.length;i++) 
		{
			System.out.println("Entre com o valor na posi��o "+ i);
			vetorA[i]= scan.nextInt();
		}
		
		int somaMenor15=0;
		int igual15=0;
		int somaMaior15=0;
		int qtdMaior15=0;
		for(int i=0; i<vetorA.length;i++) 
		{
			if (vetorA[i]==15) 
			{
				igual15++;
			}
			else if (vetorA[i]<15) 
			{
				somaMenor15+=vetorA[i];
			}			
			else 
			{
				qtdMaior15++;
				somaMaior15+=vetorA[i];
			}
			
		}
		
		System.out.print("Vetor A= ");
		for (int i=0; i<vetorA.length;i++) 
		{
			System.out.print(vetorA[i]+ " ");
		}
		
		System.out.println();
		
		System.out.println("Qtd n�meros ==15: " + igual15);
		System.out.println("Soma n�meros <15: "+ somaMenor15);
		System.out.println("M�dia n�meros >15: "+ somaMaior15/qtdMaior15);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
