//Criar uma classe para representar uma conta corrente que possui um número, um saldo, um status qwe informa se ela é especial ou não, um limite.
//Desenvolver métodos para realziar saque (verificando se o cliente pode realizar saques), depositar dinheiro, consultar saldo e verificar
// se o cliente está usando cheque especial ou não. Desenvolver um programa para testar a classe.

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
			System.out.println(" Não foi possível realizar saque. Saldo insuficiente");
		}
		
		saqueEfetuado= conta.realizarSaque(500);
		System.out.println("Tentativa de Saque de 500");
		
		if(saqueEfetuado) 
		{
			System.out.println("Saque efetuado com sucesso");
			System.out.println("Saldo atual da conta = " + conta.saldo);
		}else 
		{
			System.out.println(" Não foi possível realizar saque. Saldo insuficiente");
		}
		
		System.out.println("Depósito de 500 reais");
		conta.depositar(500);
		System.out.println(" O novo saldo é de " + conta.saldo);
		
		if (conta.verificarUsoChequeEspecial()) 
		{
			System.out.println("Está usando cheque especial");
		}else 
		{
			System.out.println("Não está usando cheque especial");
		}
				
	}	

}
