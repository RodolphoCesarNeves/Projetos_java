package funcinario;

import java.util.Scanner;

public class teste {
	public static void main(String args[]) 
	{
		Scanner teclado= new Scanner(System.in);
		funcionarios func = new funcionarios();
		System.out.println ("Digite o nome do funcion�rio");
		func.nome=teclado.nextLine();
		System.out.println ("Digite o departamento");
		func.departamento= teclado.nextLine();
		System.out.println ("Digite a data de entrada");
		func.dataentrada= teclado.nextLine();
		System.out.println ("Digite o seu sal�rio");
		func.salario=Double.parseDouble(teclado.nextLine());
		func.recebeAumento(800,func.departamento);
		func.calculaGanhoAnual();
		
		
	}
	

}
