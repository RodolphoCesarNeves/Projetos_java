package aula_27_contaCorrente;

import java.util.Scanner;

public class testeContacorrente {
	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		contaCorrente cc= new contaCorrente();
		cc.limite=7800.00;
		cc.especial=false;		
		System.out.println("Informe o n�mero da conta corrente");
		cc.numero= Integer.parseInt(teclado.nextLine());
		for(int i=0; i<=4; i++) {
			System.out.println("\nEscolha uma opera��o");
			System.out.println( "1- Sacar \n" +
								"2- Depositar \n" +
								"3- Consultar Saldo \n" +
								"4- Sair");
			 i=Integer.parseInt(teclado.nextLine());
		
		
			 if(i!=1 && i!=2 && i!=3 && i!=4)
				{
					System.out.println("Valor inv�lido \n");	
					i=0;
				
				}
				
		
		if (i==1) 
		{
			System.out.println("Informe o valor de saque");
			cc.sacar(Double.parseDouble(teclado.nextLine()));
		}
		
		if (i==2) 
		{
			System.out.println("Informe o valor do dep�sito");
			cc.depositarDinheiro(Double.parseDouble(teclado.nextLine()));
		}
		if(i==3) 
		{
			cc.consultarSaldo();
		}
		if(i==4)
		{
			System.out.println("Opera��o finalizada!!!");
			break;
		}
			
	   
		}
		
	}

}
