/* Capture do teclado valores para preenchimento de uma matriz M 3x3. Após a captura, imprima a matriz criada e encontre a quantidade de números pares,
 * a quantidade de números ímpares 
 */
package Aula_20_Matrizes;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {
		
		int[][] numeros= new int[3][3];
		
		Scanner scan= new Scanner(System.in);
		
		for(int i=0;i<numeros.length;i++) 
		{
			for(int j=0;j<numeros[i].length;j++) 
			{
				System.out.println("Entre com o valor da posição: " +"["+i+"]" +"["+ j+"]");
				numeros[i][j]=scan.nextInt();
			}
		}
		
		System.out.println("Matriz A: ");
		for(int i=0;i<numeros.length;i++) 
		{
			for(int j=0;j<numeros[i].length;j++) 
			{
				System.out.print(numeros[i][j]+ " ");
			}System.out.println();
		}System.out.println();
		
		int qtdPares=0;
		int qtdImapares=0;
		for(int i=0;i<numeros.length;i++) 
		{
			for(int j=0;j<numeros[i].length;j++) 
			{
				if(numeros[i][j]%2==0) 
				{
					qtdPares++;
				}else 
				{
					qtdImapares++;
				}
			}
		}
		System.out.println("Qtd Pares: "+ qtdPares);
		System.out.println("Qtd Ímpares: "+ qtdImapares);

	}

}
