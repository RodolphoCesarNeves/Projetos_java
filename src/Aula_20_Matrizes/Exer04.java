/* Faça um programa para armazenar em uma matriz, os compromissos de uma agenda pessoal. Cada dia do mês deve conter 24 horas, onde cada uma destas 24 horas
 * podemos associar uma tarefa específica(compromisso agendado). O programa deve ter uma menu onde o usuário indica o dia do mês que deseja alterar e a 
 * hora, entrando em seguida com o compromisso, ou então, 
 * 
 */
package Aula_20_Matrizes;

import java.util.Scanner;

public class Exer04 {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		
		String[][] compromissos= new String[31][24];
		
		boolean sair= false;
		Byte opcao;
		boolean diaValido=false;
		int dia=0;
		boolean horaValida=false;
		int hora=0;
		
		while(!sair) 
		{
			System.out.println("Digite 1 para adicionar compromisso");
			System.out.println("Digite 2 para verificar compromisso");
			System.out.println("Digite 0 para sair");
			
			opcao=scan.nextByte();
			
			if(opcao==1)
			{
				diaValido=false;
				dia=0;
				while(!diaValido) 
				{
					System.out.println("Entre com o dia do mês");
					dia=scan.nextInt();
					
					if(dia>0 && dia <31) 
					{
						diaValido=true;
					}else 
					{
						System.out.println("Dia inválido. digite novamente");
					}
				}
				horaValida=false;
				hora=0;
				while(!horaValida) 
				{
					System.out.println("Entre com a hora do compromisso");
					hora=scan.nextInt();
					
					if(hora>=0 && hora <24) 
					{
						horaValida=true;
					}else 
					{
						System.out.println("Hora inválida, digite novamente");
					}
				}
				
				dia --;// como a matriz começa a contar do 0 (zero) temos que decrementar um valor do dia, já quevais de 1 a 31
				System.out.println("Digite o compromisso");
				compromissos[dia][hora]=scan.next();
				
			}
			
			
			
			else if(opcao==2)
			{	diaValido=false;
				dia=0;
				
				while(!diaValido) 
				{
					System.out.println("Entre com o dia do mês");
					dia=scan.nextInt();
					
					if(dia>0 && dia <31) 
					{
						diaValido=true;
					}else 
					{
						System.out.println("Dia inválido. digite novamente");
					}
				}
				horaValida=false;
				hora=0;
				
				while(!horaValida) 
				{
					System.out.println("Entre com a hora do compromisso");
					hora=scan.nextInt();
					
					if(hora>=0 && hora <24) 
					{
						horaValida=true;
					}else 
					{
						System.out.println("Hora inválida, digite novamente");
					}
				}
				
				dia --;// como a matriz começa a contar do 0 (zero) temos que decrementar um valor do dia, já quevais de 1 a 31
				if (compromissos[dia][hora] ==null) 
				{
					System.out.println("Nenhum compromisso agendado para esta data/hora");
					System.out.println();
				}else 
				{
					
					System.out.println("O compromisso agendado é:");
					System.out.println(compromissos[dia][hora]);
				}
				
			}else if(opcao==0) 
			{
				sair=true;
			}else 
			{
				System.out.println("Opção inválida. Digite novamente");
			}
		}
		

	}

}
