package Exer_Aula_33_labs;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		Aluno aluno = new Aluno();
		
		System.out.println("Entre com o nome do Aluno");
		aluno.setNome(scan.nextLine());
		
		System.out.println("Entre com o nome do Curso");
		aluno.setNomeCurso(scan.nextLine());
		
		System.out.println("Entre com a Matrícula");
		aluno.setMatricula(scan.nextLine());
		
		for(int i=0;i<aluno.getNomeDisciplinas().length;i++) 
		{
			System.out.println("Entre com o nome da disciplina " + (i+1));			
			aluno.setNomeDisciplinaPos(i, scan.nextLine());
			
		}
		
		for(int i=0;i<aluno.getNotasDisciplinas().length;i++) 
		{
			System.out.println("Obtendo notas da disciplina "+ aluno.getNomeDisciplinas()[i]);
			for(int j=0; j< aluno.getNotasDisciplinas()[i].length;j++) 
			{
				System.out.println("Entre com a nota "+ (j+1));
				aluno.setNomePosIJ(i, j, scan.nextDouble());
				
			}
		}
		
		aluno.mostrarInfo();
		
		for(int i=0;i<aluno.getNomeDisciplinas().length;i++) 
		{
			if(aluno.verificarAprovado(i)) 
			{
				System.out.println("Disciplina "+ aluno.getNomeDisciplinas()[i]+ " - Foi Aprovado");
			}else 
			{
				System.out.println("Disciplina "+ aluno.getNomeDisciplinas()[i]+ " - Foi Reprovado");
			}
		}
		
	}

}
