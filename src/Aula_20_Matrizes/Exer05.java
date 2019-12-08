/* Modifique o programa anterior de maneira a guardar os compromissos de todo o ano, organizados por mês, dia e hora (Só 8h por dia)
 * 
 */
package Aula_20_Matrizes;

import java.util.Scanner;

public class Exer05 {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		
		String[][][] compromissos= new String[12][31][8];
		
		boolean sair=false;
		Byte opcao;
		boolean mesValido=false;
		int mes=0;
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
				
				mesValido=false;
				mes=0;			
				
				while(!mesValido) 
				{
					System.out.println("Entre com o mês");
					mes=scan.nextInt();
					
					if(mes>0 && mes <=12) 
					{
						mesValido=true;
					}else 
					{
						System.out.println("Mês inválido. digite novamente");
					}
				}
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
					
					if(hora>=0 && hora <8) 
					{
						horaValida= true;
					}else 
					{
						System.out.println("Hora inválida. Informe no intervalo das 0h às 7h");
					}
				}
				mes --;
				dia --;// como a matriz começa a contar do 0 (zero) temos que decrementar um valor do dia, já quevais de 1 a 31
				System.out.println("Digite o compromisso");
				compromissos[mes][dia][hora]=scan.next();
			}
			
			
			else if(opcao==2) 
			{
				
				mesValido=false;
				mes=0;			
				
				while(!mesValido) 
				{
					System.out.println("Entre com o mês");
					mes=scan.nextInt();
					
					if(mes>0 && mes <=12) 
					{
						mesValido=true;
					}else 
					{
						System.out.println("Mês inválido. digite novamente");
					}
				}
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
					
					if(hora>=0 && hora <8) 
					{
						horaValida= true;
					}else 
					{
						System.out.println("Hora inválida. Informe no intervalo das 0h às 7h");
					}
				}
				
				mes --;
				dia --;// como a matriz começa a contar do 0 (zero) temos que decrementar um valor do dia, já quevais de 1 a 31				
				
				if (compromissos[mes][dia][hora] ==null) 
				{
					System.out.println("Nenhum compromisso agendado para este data/hora");
					System.out.println();
				}else 
				{
					
					System.out.println("O compromisso agendado é:");
					System.out.println(compromissos[mes][dia][hora]);
				}
			}
			
			else if(opcao==0) 
			{
				sair=true;
			}else 
			{
				System.out.println("Opção inválida. Digite novamente");
			}		
			
		}				
			
		}
		

	}


