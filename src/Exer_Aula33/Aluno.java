package Exer_Aula33;

import java.util.Scanner;

public class Aluno {
	private String nome;
	private int matricula;
	private String curso;
	private String[] disciplina= new String[3];
	private Double[] nota= new Double[3];
	
	
	public Aluno() {
		super();
		
	}

	Scanner teclado= new Scanner(System.in);

	public Aluno(String nome, int matricula, String curso, String[] disciplina, Double[] nota) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.curso = curso;
		this.disciplina = disciplina;
		this.nota = nota;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getMatricula() {
		return matricula;
	}


	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}


	public String getCurso() {
		return curso;
	}


	public void setCurso(String curso) {
		this.curso = curso;
	}


	public String[] getDisciplina() {
		return disciplina;
	}


	public void setDisciplina(String[] disciplina) {
		this.disciplina = disciplina;
	}


	public Double[] getNota() {
		return nota;
	}


	public void setNota(Double[] nota) {
		this.nota = nota;
	}
	
	public void InformarDisciplina() 
	{
		for(int i=0;i<disciplina.length;i++)
		{
			System.out.println("Informe a disciplina " + (i+1));
			disciplina[i]= teclado.nextLine();
			
		}
	}
	
	public void informarNotas() 
	{
		if(disciplina!=null) 
		{
			for(int i=0;i<nota.length;i++)
			{
				System.out.println("Informr a nota da disciplina "+ disciplina[i]);
				nota[i]=teclado.nextDouble();
			}
		}else 
		{
			System.out.println("Nenhuma disciplina informada!!!");
		}
	}
	
	public void verificarAprovacao() 
	{
		for(int i=0;i<nota.length;i++) 
		{
			if(nota[i]>=7) 
			{
				System.out.println("APROVADO em " + disciplina[i] + " com nota " + nota[i]);
			}else 
			{
				System.out.println("REPROVADO em "+ disciplina[i] +" com nota " + nota[i]);
			}
		}
	}
	
	

}
