package Exer_Aula_33_labs;

public class Aluno {
	private String nome;
	private String matricula;
	private String nomeCurso;
	private String[] nomeDisciplinas;
	private Double[][] notasDisciplinas;
	
	
	public Aluno() {
		nomeDisciplinas= new String[3];
		notasDisciplinas= new Double[3][4];
		
	}


	public Aluno(String nome, String matricula, String nomeCurso) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.nomeCurso = nomeCurso;
		this.nomeDisciplinas= new String[3];
		this.notasDisciplinas= new Double[3][4];
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getMatricula() {
		return matricula;
	}


	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}


	public String getNomeCurso() {
		return nomeCurso;
	}


	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}


	public String[] getNomeDisciplinas() {
		return nomeDisciplinas;
	}


	public void setNomeDisciplinas(String[] nomeDisciplinas) {
		this.nomeDisciplinas = nomeDisciplinas;
	}


	public Double[][] getNotasDisciplinas() {
		return notasDisciplinas;
	}


	public void setNotasDisciplinas(Double[][] notasDisciplinas) {
		this.notasDisciplinas = notasDisciplinas;
	}
	
	public void mostrarInfo() 
	{
		System.out.println("Nomne: "+ nome);
		System.out.println("Matrícula: "+ matricula);
		System.out.println("Nome do Curso; "+ nomeCurso);
		
		for(int i=0; i<notasDisciplinas.length;i++) 
		{
			System.out.println("Notas da Disciplina " + nomeDisciplinas[i]);
			for (int j=0; j<notasDisciplinas[i].length;j++) 
			{
				System.out.print(notasDisciplinas[i][j] + " ");
			}
			System.out.println();
			
		}
		
		
	}
	
	public boolean verificarAprovado(int indice) 
	{
		if(obterMedia(indice)>=7) 
		{
			return true;
		}
		
		return false;
	}
	
	private double obterMedia(int indice)
	{
		double soma=0;
		
		for(int i=0; i<notasDisciplinas[indice].length;i++) 
		{
			soma+=notasDisciplinas[indice][i];
		}
		double media=soma/notasDisciplinas[indice].length;
		return media;
	}
	
	public void setNomeDisciplinaPos(int pos, String nomeDisciplina) 
	{
		this.nomeDisciplinas[pos]=nomeDisciplina;
	}
	
	public void setNomePosIJ(int PosI, int PosJ, double nota) 
	{
		this.notasDisciplinas[PosI][PosJ]=nota;
	}
	
	
	

}
