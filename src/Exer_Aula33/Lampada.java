package Exer_Aula33;



public class Lampada {
	private String tipo;
	private int potencia;
	private int voltagem;
	private String cor;
	private boolean ligada;
	
	
	
	
	public Lampada(String tipo, int potencia, int voltagem, String cor, boolean ligada) {
		super();
		this.tipo = tipo;
		this.potencia=potencia;
		this.voltagem = voltagem;
		this.cor = cor;
		this.ligada = ligada;		
	}
	
	public Lampada() {
		
	}

	public void  ligarLampada() 
	{
		setLigada(true);
	}
	
	public void desligarLampada() 
	{
		setLigada(false);
	}
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getVoltagem() {
		return voltagem;
	}
	public void setVoltagem(int voltagem) {
		this.voltagem = voltagem;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public boolean isLigada() {
		return this.ligada;
	}
	public void setLigada(boolean ligada) {
		this.ligada = ligada;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	
	

}
