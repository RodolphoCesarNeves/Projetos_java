/* Criar um vetor A com 10 elementos inteiros. Implementar um programa que defina e escreva a m�dia aritm�tica simples dos elementos
 * �mpares armazenados neste vetor * 
 */
package Aula_19_Arrays;

import java.util.Scanner;

public class Exer14 {
	
	public static void main(String[] args) 
	{
		int[] vetorA= new int[10];
		Scanner scan= new Scanner(System.in);
		
		
		for(int i=0; i<vetorA.length;i++) 
		{
			System.out.println("Entre com o valor na posi��o "+ i);
			vetorA[i]= scan.nextInt();		
			
		}
		
		int soma=0;		
		int impar=0;		
		
		for(int i=0; i<vetorA.length; i++) 
			{	if (vetorA[i]%2!=0) {
			soma +=vetorA[i];
			impar++;
			} 						}
		
		System.out.print("Vetor A= ");
		for(int i=0; i<vetorA.length;i++) 
		{
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();
		
		if (soma==0) 
		{		
			System.out.println ("O vetor A n�o possui nenhum n�mero �mpar");
		}else
			
		System.out.println("Soma: " + soma);
		System.out.println("M�dia: "+ (soma/impar));
	
		}
		

}
