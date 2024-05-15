package fundamentosBasicos.Modulo2;

public class Carro {
	//encapsulamento
	private String cor;
	private int ano;
	private String marca;
	private String modelo;
	private int velocidade = 0;
	
	public Carro(String cor, int ano, String marca, String modelo) {
		this.cor = cor;
		this.ano = ano;
		this.marca = marca;
		this.modelo = modelo;
	}
	
	
	
	public String getCor() {
		return cor;
	}



	public void setCor(String cor) {
		this.cor = cor;
	}



	public int getAno() {
		return ano;
	}



	public void setAno(int ano) {
		this.ano = ano;
	}



	public String getMarca() {
		return marca;
	}



	public void setMarca(String marca) {
		this.marca = marca;
	}



	public String getModelo() {
		return modelo;
	}



	public void setModelo(String modelo) {
		this.modelo = modelo;
	}



	public void AumentarVelocidade() {
		velocidade+=10;
	}
	public void DiminuirVelocidade() {
		velocidade-=10;
	}	
	
	public String toString() {
		return String.format("o Carro %s é da marca %s do ano %d tem a cor %s e esta a %d (km/h) ",modelo,marca,ano,cor,velocidade);
	}
}
