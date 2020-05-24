package Exer_Aula_34_labs;

public class Exer02 {

	public static void main(String[] args) {
			
		ImprimirTela(Calculadora.somar(1, 2));
		ImprimirTela(Calculadora.subtrair(2, 1));
		ImprimirTela(Calculadora.multiplicar(2, 2));
		ImprimirTela(Calculadora.dividir(10, 2));
		ImprimirTela(Calculadora.potencia(2, 6));

	}
	
		static void ImprimirTela(int num) 
		{
			System.out.println(num);
		}

}
