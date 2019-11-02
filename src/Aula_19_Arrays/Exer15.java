/*Criar um vetor A com 10 elementos inteiros. Desenvolver um programa que defina o percentual de elementos pares e ímpares, respectivamente,
 * armazenados, neste valor. 
 */
package Aula_19_Arrays;

import java.util.Scanner;

public class Exer15 {
	
	public static void main(String[] args) 
	{
		int[] vetorA= new int[10];
		Scanner scan= new Scanner(System.in);
		
		
		for(int i=0; i<vetorA.length;i++) 
		{
			System.out.println("Entre com o valor na posição "+ i);
			vetorA[i]= scan.nextInt();		
			
		}
		
		//int soma=0;		
		int impar=0;
		//int par=0;
		
		for(int i=0; i<vetorA.length; i++) 
			{	if (vetorA[i]%2!=0) {
			//soma +=vetorA[i];
			impar++;
			}//else
				//par++; 
			}
		int par= vetorA.length -impar;
		
		/*int par=0;
		for(int i=0; i<vetorA.length; i++) 
		{	if (vetorA[i]%2==0) {
		//soma +=vetorA[i];
		par++;
		} 		}
		*/
		
		System.out.print("Vetor A= ");
		for(int i=0; i<vetorA.length;i++) 
		{
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();
		
		/*if (soma==0) 
		{		
			System.out.println ("O vetor A não possui nenhum número ímpar");
		}else
			
		System.out.println("Soma: " + soma);
		System.out.println("Média: "+ (soma/impar));
		*/
		double porcPar= par*100/vetorA.length;
		//double porcImpar= par*100/vetorA.length;
		double porcImpar= 100-porcPar;
		System.out.println("Porcentagem Pares: "+ porcPar+"%");
		System.out.println("Porcentagem Ímpares: "+ porcImpar+"%");
	
		}
		

}
