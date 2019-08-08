package exercicios_java;


public class LerNomes {
	public static void main (String args[]) 
	{	
		String nome[] = new String [10];
		nome[0]= "Anny";
		nome[1]= "Rodolpho";
		nome[2]= "Joana";
		nome[3]= "Renata";
		nome[4]= "Severino";
		nome[5]= "Sandra";
		nome[6]= "Maria Luiza";
		nome[7]= "Martinho";
		nome[8]= "Welson";
		nome[8]= "Magnólia";
		nome[9]= "Dona Lucy";
		
		/*for (int i=0; i < nome.length; i++) 
		{
			System.out.println(nome[i]);
		}*/
		//Utilizando o for Each
		for (String valor:nome)
			System.out.println(valor);
	}
	

}
