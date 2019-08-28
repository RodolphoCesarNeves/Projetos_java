package aula_27_contaCorrente;

public class contaCorrente {
	int numero;
	double saldo;
	boolean especial;
	double limite;
	
	void sacar(double saque) 
	{
		if (saque<=0) 
		{
			System.out.println("O valor de saque tem que ser maior do que R$0,00");
		}
		else if (saque>saldo) 
		{
			System.out.println("O valor de saque é maior do que o saldo disponível");
		}
		else if (saque>limite) 
		{
			System.out.println("O valor de saque é maior do que o limite permitido");
		}
		else if (especial==true) 
		{
			System.out.println("O valor vai ser sacado utilizando cheque especial");
			saldo= saldo-saque;
		}else
		{
			saldo= saldo-saque;
			System.out.println("O valor R$"+ saque + " foi sacado da conta");
		}	
		
	}
	
	void depositarDinheiro(double valordeposito) 
	{
		saldo= saldo+valordeposito;
		System.out.println("O valor R$"+ valordeposito + " foi depositado na conta " + numero );
	}
	
	void consultarSaldo() 
	{
		System.out.println("O saldo atual é de R$"+ saldo);
		
	}
	

}
