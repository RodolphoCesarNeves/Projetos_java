/* Programa para guardar dados de uma pesquisa, feita com uma amostra de pessoas da avenida mais movimentada da cidade onde você mora.
 * A pesquisa consiste em perguntar ao cidadão a quantidade de filhos e o nome de cada filho. Guardar estas informações em uma matriz, de forma que
 * cada pessoa entrevistada ocupe somente o espeço necessário na memória para guardar os nomes dos filhos.
 * imprimir a quantidade de pessoas entrevistadas, a quantidade de filhos de cada entrevistado, e os respectivos nomes dos filhos. * 
 */

/*                           						 Arrays Irregulares- Estrutura
 * 														
 * 
 * 				int[][]  arrayIrregular=new int[3][];
 * 				arrayIrregular[0]= new int[1];
 * 				arrayIrregular[1]= new int[2];
 * 				arrayIrregular[2]= new int[3];
 * 
 */
package Aula_20_Matrizes;

import java.util.Scanner;

public class MatrizIrregular {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Entre com o número de pessoas que serão entravistadas");
		int numEntrevistados=scan.nextInt();
		
		String[][] nomesFilhos= new String[numEntrevistados][];
		
		for(int i=0; i<nomesFilhos.length;i++) 
		{
			System.out.println("Entre com a quantidade de filho da pessoa "+ (i+1));
			int qtdFilhos= scan.nextInt();
			
			nomesFilhos[i]=new String[qtdFilhos];
			for(int j=0;j<nomesFilhos[i].length;j++) 
			{
				System.out.println("Digite o nome do filho "+ (j+1));
				
				nomesFilhos[i][j]=scan.next();
			}
			
		}
		
		for(int i=0; i<nomesFilhos.length;i++) 
		{
			System.out.println("Pessoa "+ (i+1)+ " tem "+ nomesFilhos[i].length+ " filhos");
			for(int j=0;j<nomesFilhos[i].length;j++) 
			{
				System.out.println(nomesFilhos[i][j]);
			}
			System.out.println();
		}

	}

}
