package Exer_Aula33;

import java.util.Scanner;

public class ContaCorrente {
	private int numero;
	private double saldo;
	private boolean status;
	private double limite;
	private double valorEspecial;
	
	
	
	public ContaCorrente(int numero, double saldo, boolean status, double limite, double valorEspecial) {
		super();
		this.numero = numero;
		this.saldo = saldo;
		this.status = status;
		this.limite = limite;
		this.valorEspecial= valorEspecial;
	}

	public ContaCorrente() {
		super();
		
	}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}

	Scanner teclado = new Scanner(System.in);
	Scanner re = new Scanner(System.in);
	
	
	public void realizarSaque() 
	{	if(status==false) {
		System.out.println ("Informa o valor do saque");
		Double valor= teclado.nextDouble();
		if (valor<=saldo && valor >=limite) 
		{
			saldo= (saldo-valor);			
		}else if(valor>saldo) 
		{
			System.out.println("Saldo insuficiente");
		}else if(valor <limite) 
		{
			System.out.println("Limite pra saque atingido");
		}
		}else 
		{    System.out.println ("Informa o valor do saque");
		Double valor= teclado.nextDouble();
			if (valor<=saldo && valor >=limite) 
			{
				saldo= (saldo-valor);			
			}else if (valor >saldo && valor <=(valorEspecial+saldo) && valor >=limite) 
			{
				System.out.println("Saldo insuficiente. Deseja utilzar cheque especial? S/N");
				String resposta= re.nextLine();
				if(resposta.equalsIgnoreCase("s")) 
				{	saldo-=valor;
					valorEspecial-=-saldo;
				}if(resposta.equalsIgnoreCase("n")) 
				{
					System.out.println("Não foi possível realizar o saque");
				}			
			}			
			else if(valor >saldo && valor >(valorEspecial+saldo)) 
			{
				System.out.println("Saldo insuficiente da conta e do cheque especial");
			}else if(valor <limite) 
			{
				System.out.println("Limite pra saque atingido");
			}
			
		}
	}
	
	double valorDeposito;
	public void depositarDinheiro() 
	{
		System.out.println("Informe o valor do depósito");
		valorDeposito= teclado.nextDouble();
		saldo+=valorDeposito;
		System.out.println("Depósito de "+"R$ "+ valorDeposito + " realizado com sucesso");
	}
	
	public void consultarSaldo() 
	{
		System.out.println("O saldo em conta é: R$" + getSaldo());
	}

	public double getValorEspecial() {
		return valorEspecial;
	}

	public void setValorEspecial(double valorEspecial) {
		this.valorEspecial = valorEspecial;
	}
	
}
