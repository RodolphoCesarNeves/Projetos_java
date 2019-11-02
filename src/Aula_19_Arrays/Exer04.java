//Criar um vetor A com 15 elementos inteiros. Construir um vetor B de mesmo tamanho, sendo que cada elemento do vetor B 
//dever� ser raiz quadrada dp respectivo elemento de A, ou seja, B[i] = sqrt(a[i])

package Aula_19_Arrays;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exer04 {
	
	public static void main (String[] args) 
	{
Scanner scan= new Scanner(System.in);
		
		int [] vetorA= new int[15];
		Double [] vetorB= new Double[vetorA.length];
		
		for(int i=0; i<vetorA.length;i++) 
		{
			System.out.println("Entre com o valor da posi��o " + i);
		    vetorA[i]= scan.nextInt();
		    	
		    	vetorB[i]= Math.sqrt(vetorA[i]);
		}
		System.out.print("Vetor A= ");
		for(int i=0; i<vetorA.length;i++) 
		{
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();
		
		DecimalFormat df= new DecimalFormat("###,###.##");
		
		System.out.print("Vetor B= ");
		for(int i=0; i<vetorB.length;i++) 
		{
			System.out.print(df.format(vetorB[i]) + " ");
		}
		System.out.println();
	}

}
