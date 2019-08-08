package exercicios_java;

import java.util.Arrays;

public class LerSalario {
	public static void main(String args[]) 
	{
		Double salario[]= {2000.00,2200.00, 2700.00,3800.00, 5100.00,4200.00,600.00};	
		Arrays.sort(salario);		
		System.out.println("O maior salário é: " + salario[salario.length-1]);
		System.out.println("O menor salário é: " + salario[0]);
	}

}
