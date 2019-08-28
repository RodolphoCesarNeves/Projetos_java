package aula_27_ContaCorrenteProfessor;

public class ContaCorrente {
	String numero;
	String agencia;
	boolean especial;
	double limiteEspecial;
	double valorEspecialUsado;
	double saldo;
	
	boolean realizarSaque(double quantiaASacar) 
	{	//tem saldo na conta
		if(saldo>=quantiaASacar) 
		{
			saldo-=quantiaASacar;
			return true;
		}else 
		{	//n�o tem saldo na conta
			if(especial) 
			{	//verificar se o limite especial tem saldo
				double limite= limiteEspecial+saldo;
				if(limite>=quantiaASacar) 
				{
					saldo-=quantiaASacar;
					return true;
				}else 
				{
					return false;
				}
			}else 
			{	//n�o � especial e n�o tem saldo suficiente
				return false;
			}
		}
		
	}
	
	void depositar (double valorDepositado) 
	{
		saldo+=valorDepositado;
	}
	
	boolean verificarUsoChequeEspecial() 
	{
		return saldo<0;
	}
	

}
