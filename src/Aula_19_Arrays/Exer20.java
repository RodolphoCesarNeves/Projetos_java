/*Implementar um programa que obtenha a cota��o do d�lar(U$) em rela��o ao real (R$), e a seguir armazene em A com 20 elementos as 
 * seguintes convers��es:
 * A[i]= cota��o do d�lar *i, para todo i variando de 1 a 20. 
 */
package Aula_19_Arrays;

import java.util.Scanner;

public class Exer20 {
	public static void main (String[] args) 
	{
		Scanner scan= new Scanner(System.in);
		double[] vetorA= new double[20];
		double cotacao; 
		
		System.out.println("Entre com a cota��o do D�lar:");
		cotacao= Double.parseDouble(scan.nextLine());
		
		for (int i=0; i<vetorA.length;i++) 
		{
			vetorA[i]=cotacao * (i+1);
			
		}
		
		System.out.println("Os valores covertidos s�o: ");
		for(int i=0; i<vetorA.length;i++) 
		{
			System.out.println("U$ "+ (i+1) +" = "+ "R$ "+vetorA[i]);
		}
		
		
		
	}

}
