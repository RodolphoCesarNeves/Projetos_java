/*Implementar um programa que obtenha a cotação do dólar(U$) em relação ao real (R$), e a seguir armazene em A com 20 elementos as 
 * seguintes conversções:
 * A[i]= cotação do dólar *i, para todo i variando de 1 a 20. 
 */
package Aula_19_Arrays;

import java.util.Scanner;

public class Exer20 {
	public static void main (String[] args) 
	{
		Scanner scan= new Scanner(System.in);
		double[] vetorA= new double[20];
		double cotacao; 
		
		System.out.println("Entre com a cotação do Dólar:");
		cotacao= Double.parseDouble(scan.nextLine());
		
		for (int i=0; i<vetorA.length;i++) 
		{
			vetorA[i]=cotacao * (i+1);
			
		}
		
		System.out.println("Os valores covertidos são: ");
		for(int i=0; i<vetorA.length;i++) 
		{
			System.out.println("U$ "+ (i+1) +" = "+ "R$ "+vetorA[i]);
		}
		
		
		
	}

}
