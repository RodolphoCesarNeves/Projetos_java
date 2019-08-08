package funcinario;

public class funcionarios {
	String nome;
	String departamento;
	double salario;
	String dataentrada;
	String rg;
	
	
	public funcionarios() 
	{
		this.nome=nome;
		this.departamento=departamento;
		this.salario=salario;
		this.rg=rg;
		
		
	}

	void recebeAumento(double aumento,String departamento ) 
	{
		if ((this.departamento.equalsIgnoreCase("ti")|| this.departamento.equalsIgnoreCase("informática") ||this.departamento.equalsIgnoreCase("desenvolvimento")
				|| this.departamento.equalsIgnoreCase("testes")) && (this.salario<=1500)) 
		{			
			double novosalario= this.salario + aumento;
			this.salario= novosalario;
			
			System.out.println("O funcionário " + this.nome + " do departamento de " + this.departamento + 
					" vai ter um aumento de " + aumento);
			System.out.println("O novo salário será de: " +novosalario );
			
		}else 
		{
			System.out.println("O funcionário " + this.nome + " do departamento de " + this.departamento +
				" Não teve aumento"	);
		}
	
		
	}
	
	
	
	void calculaGanhoAnual() 
	{
		double ganhoAnual= this.salario *12;
		System.out.println("O ganho anual será de: " + ganhoAnual);
	}

	
	
}
	