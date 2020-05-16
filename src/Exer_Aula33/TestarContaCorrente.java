package Exer_Aula33;

import java.util.Scanner;

public class TestarContaCorrente {

	public static void main(String[] args) {
		ContaCorrente conta = new ContaCorrente();
		conta.setSaldo(800.00);
		conta.setValorEspecial(300.00);
		conta.setStatus(true);
		Scanner teclado = new Scanner(System.in);		
		
		int i=4;
		while ( i!=0) 
		{
			System.out.println("Digite uma opção:"+
					"\n[1] Realizar Depósito "+
					"\n[2] Realizar Saque " +
					"\n[3] Realizar Consultar Saldo " +
					"\n[0] Sair");			
			i=teclado.nextInt();
			if (i==1) 
			{
				conta.depositarDinheiro();
			}else if(i==2) 
			{
				conta.realizarSaque();
			}else if(i==3) 
			{
				conta.consultarSaldo();
			}else if(i==0) 
			{
				System.out.println("Operação encerrada!");
				i=0;
			}
		}
		

	}

}
