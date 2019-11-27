/* Gere e imprima uma Matriz 4x4 com valores aleatórios entre 0-9. Após isso, determine o maior número da matriz e sua posição (linha,coluna) 
 */
package Aula_20_Matrizes;

import java.util.Random;

public class Exer01 {

	public static void main(String[] args) {
		
		int[][] numerosAleatorios= new int[4][4];
		
		Random numeroRandom= new Random();
		
		
		for(int i=0;i<numerosAleatorios.length;i++) 
		{
			for (int j=0;j<numerosAleatorios[i].length;j++) 
			{
				numerosAleatorios[i][j]= numeroRandom.nextInt(100);
			}			
		}
		
		//int maior=Integer.MIN_VALUE;
		int maior=0;
		int linha=0;
		int col=0;
		
		for(int i=0;i<numerosAleatorios.length;i++) 
		{
			for(int j=0;j<numerosAleatorios[i].length;j++) 
			{
				if(numerosAleatorios[i][j]>maior) 
				{
					maior=numerosAleatorios[i][j];
					linha=i;
					col=j;
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
		
		System.out.println("Maior valor= "+ maior);
		System.out.println("Linha= "+ linha);
		System.out.println("Coluna= "+ col);
		
		
		
		
		
		
		
		
		
		
		/*int[][] matrizA= new int[4][4];
		
		System.out.print("Matriz A: ");
		for(int i=0;i<matrizA.length;i++) 
		{
			for (int j=0;j<matrizA[i].length;j++) 
			{
				matrizA[i][j]=(int)(Math.random()*10);
				System.out.print(matrizA[i][j]+ " ");
			}
		}System.out.println();
		
		int maior=0;
		for(int i=0;i<matrizA.length;i++) 
		{
			for (int j=0;j<matrizA[i].length;j++)  
			{
				if (matrizA[i][j]>maior)
				maior=matrizA[i][j];				
			}
		}
		
		System.out.println("O maior número da matriz A é: "+ maior);
		
		*/

	}

}
