/* Gere e imprima uma Matriz 10x10 com valores aleatórios entre 0-9. Após isso, indique qual o maior e o menor valor da linha 5, e qual é o maior
 * e o menor valor da coluna 7 
 */
package Aula_20_Matrizes;

import java.util.Random;

public class Exer02 {

	public static void main(String[] args) {
		
		int[][] numerosAleatorios = new int[10][10];
		
		Random numeroRandom= new Random();
		
		for(int i=0;i<numerosAleatorios.length;i++) 
		{
			for(int j=0;j<numerosAleatorios[i].length;j++) 
			{
				numerosAleatorios[i][j]=numeroRandom.nextInt(100);
			}
		}
		
		for(int i=0;i<numerosAleatorios.length;i++) 
		{
			for (int j=0;j<numerosAleatorios[i].length;j++) 
			{
				System.out.print(numerosAleatorios[i][j]+ " ");
				
			}System.out.println();			
		}System.out.println();
		
		int maiorL5=0;
		int menorL5=101;
		int linha=5;
		for(int i=0;i<numerosAleatorios[linha].length;i++) 
		{
				if(numerosAleatorios[linha][i]>maiorL5) 
				{
					maiorL5=numerosAleatorios[linha][i];
				}
				if(numerosAleatorios[linha][i]<menorL5) 
				{
					menorL5=numerosAleatorios[linha][i];
				}
				
			}
		
		System.out.println("Maior valor da linha 5= "+ maiorL5);
		System.out.println("Menor valor da linha 5= "+ menorL5);
		
		

		int maiorC7=0;
		int menorC7=101;
		int col=7;
		for(int i=0;i<numerosAleatorios.length;i++) 
		{
				if(numerosAleatorios[i][col]>maiorC7) 
				{
					maiorC7=numerosAleatorios[i][col];
				}
				if(numerosAleatorios[i][col]<menorC7) 
				{
					menorC7=numerosAleatorios[i][col];
				}
				
			}
		
		System.out.println("Maior valor da coluna 7= "+ maiorC7);
		System.out.println("Menor valor da coluna 7= "+ menorC7);
			
		}
		
		
		/*
		int maiorlinha=0;
		int menorlinha=Integer.MAX_VALUE;
		int maiorcol=0;		
		int menorcol=Integer.MAX_VALUE;
		for(int i=0;i<numerosAleatorios.length;i++) 
		{
			for(int j=0;j<numerosAleatorios[i].length;j++) 
			{
				if(numerosAleatorios[5][j]>maiorlinha) 
				{
					maiorlinha=numerosAleatorios[5][j];
				}
				if(numerosAleatorios[5][j]<menorlinha) 
				{
					menorlinha=numerosAleatorios[5][j];
				}
				
				if(numerosAleatorios[i][7]>maiorcol) 
				{
					maiorcol=numerosAleatorios[i][7];
				}
				if(numerosAleatorios[i][7]<menorcol) 
				{
					menorcol=numerosAleatorios[i][7];
				}
			}
		}
		
		for(int i=0;i<numerosAleatorios.length;i++) 
		{
			for (int j=0;j<numerosAleatorios[i].length;j++) 
			{
				System.out.print(numerosAleatorios[i][j]+ " ");
				
			}System.out.println();			
		}System.out.println();
		
		System.out.println("Maior valor da linha 5= "+ maiorlinha);
		System.out.println("Menor valor da linha 5= "+ menorlinha);
		System.out.println("Maior valor da coluna 7= "+ maiorcol);
		System.out.println("Menor valor da coluna 7= "+ menorcol);
	
		*/
	}


