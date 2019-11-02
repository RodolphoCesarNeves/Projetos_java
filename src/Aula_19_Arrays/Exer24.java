/* N�mewros pal�ndromos s�o aqueles escritos da direita para a esquerda, t�m o mesmo valor quando escritos da esquerda para direita.
 * Exemplo: 545; 789987; 97379; 123454321; etc. Escreva um programa que verifique se um dado vetor A de 10 elementos inteiros � um
 * pal�ndromo, ou seja, se o primeiro elemento do vetor � igual ao pen�ltimo e assim por diante, at� verificar todos os elementos ou
 * chegar a conclus�o que o vetor n�o � um pal�ndromo. 
 */
package Aula_19_Arrays;

import java.util.Scanner;

public class Exer24 {
	public static void main (String[] args) 
	{
		Scanner scan= new Scanner(System.in);
		
		int[] vetorA= new int[10];		
		
		
		for (int i=0; i<vetorA.length;i++) 
		{
			System.out.println("Entre com o valor para a posi��o: "+ i);
			vetorA[i]=scan.nextInt();		
		}
		
		//Ex.: 1221
		//Nesse caso o for s� precisa percorrer at� a metade para saber que o n�mero � pal�ndromo (vetorA.length/2)
		boolean palindromo= true;
		for (int i=0; i<(vetorA.length/2);i++) 
		{
			if(vetorA[i] != vetorA[vetorA.length-1-i]) 
			{
				palindromo= false;
				break;
			}
		}
		
		System.out.print("Vetor A: ");
		for (int i=0; i<vetorA.length;i++) 
		{
			System.out.print(vetorA[i]+ " ");
		}
		
		System.out.println();
		
		if (palindromo) 
		{
			System.out.println("Pal�ndromo");
		}else 
		{
			System.out.println("N�o � Pal�ndromo");
		}
		
		
		
		
		
		
	}

}
