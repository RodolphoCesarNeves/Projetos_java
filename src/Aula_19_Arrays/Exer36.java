/* Criar um vetor A com 11 elementos, indexados de 0 até 10. Sendo que cada elemento do vetor A é formado pela potência de base 2 elevado ao expoente
 * igual a posição do respectivo elemento, ou seja: A[i]=2^i. Sugestão: int A[11]
 * 
 */
package Aula_19_Arrays;


public class Exer36 {
	
	public static void main(String[] args) 
	{
		
		
		
		double [] vetorA= new double[11];		
		
		for(int i=0;i<vetorA.length;i++) 
		
		{
			vetorA[i]=Math.pow(2, i);
		}
		
		System.out.print("Vetor A: ");
		for(int i=0; i<vetorA.length;i++) 
		{
			System.out.print(vetorA[i]+ " ");
		}
		System.out.println();
	
		
		
	}

}
