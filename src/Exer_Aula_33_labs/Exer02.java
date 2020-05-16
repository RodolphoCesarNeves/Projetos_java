package Exer_Aula_33_labs;


public class Exer02 {

	public static void main(String[] args) {
		ContaCorrente conta= new ContaCorrente();
		conta.setNumero("123456");
		conta.setAgencia("1234");
		conta.setEspecial(true);
		conta.setLimiteEspecial(500);
		conta.setSaldo(-10);
	
		
		System.out.println("Saldo da conta " + conta.getNumero() + " = " + conta.getSaldo());
		
		boolean saqueEfetuado= conta.realizarSaque(10);
		
		if(saqueEfetuado) 
		{
			System.out.println("Saque efetuado com sucesso");
			System.out.println("Saldo atual da conta = " + conta.getSaldo());
		}else 
		{
			System.out.println(" N�o foi poss�vel realizar saque. Saldo insuficiente");
		}
		
		saqueEfetuado= conta.realizarSaque(500);
		System.out.println("Tentativa de Saque de 500");
		
		if(saqueEfetuado) 
		{
			System.out.println("Saque efetuado com sucesso");
			System.out.println("Saldo atual da conta = " + conta.getSaldo());
		}else 
		{
			System.out.println(" N�o foi poss�vel realizar saque. Saldo insuficiente");
		}
		
		System.out.println("Dep�sito de 500 reais");
		conta.depositar(500);
		System.out.println(" O novo saldo � de " + conta.getSaldo());
		
		if (conta.verificarUsoChequeEspecial()) 
		{
			System.out.println("Est� usando cheque especial");
		}else 
		{
			System.out.println("N�o est� usando cheque especial");
		}
				
	}	

	}


