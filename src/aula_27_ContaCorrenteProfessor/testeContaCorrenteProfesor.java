package aula_27_ContaCorrenteProfessor;

public class testeContaCorrenteProfesor {
	public static void main (String[] args) 
	{
		ContaCorrente conta= new ContaCorrente();
		conta.numero="123456";
		conta.agencia="123";
		conta.especial=true;
		conta.limiteEspecial=500;
		conta.saldo=10;
		
		System.out.println("Saldo da conta " + conta.numero + " = " + conta.saldo);
		
		boolean saqueEfetuado= conta.realizarSaque(10);
		
		if(saqueEfetuado) 
		{
			System.out.println("Saque efetuado com sucesso");
			System.out.println("Saldo atual da conta = " + conta.saldo);
		}else 
		{
			System.out.println(" N�o foi poss�vel realizar saque. Saldo insuficiente");
		}
		
		saqueEfetuado= conta.realizarSaque(500);
		System.out.println("Tentativa de Saque de 500");
		
		if(saqueEfetuado) 
		{
			System.out.println("Saque efetuado com sucesso");
			System.out.println("Saldo atual da conta = " + conta.saldo);
		}else 
		{
			System.out.println(" N�o foi poss�vel realizar saque. Saldo insuficiente");
		}
		
		System.out.println("Dep�sito de 500 reais");
		conta.depositar(500);
		System.out.println(" O novo saldo � de " + conta.saldo);
		
		if (conta.verificarUsoChequeEspecial()) 
		{
			System.out.println("Est� usando cheque especial");
		}else 
		{
			System.out.println("N�o est� usando cheque especial");
		}
				
	}	

}
