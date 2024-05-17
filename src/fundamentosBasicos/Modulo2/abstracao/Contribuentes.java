package fundamentosBasicos.Modulo2.polimorfismo;

public abstract class Contribuentes {
	private String nome;
	private Double renda_anual;

	public Contribuentes() {

	}

	public Contribuentes(String nome, Double renda_anual) {
		this.nome = nome;
		this.renda_anual = renda_anual;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getRenda_anual() {
		return renda_anual;
	}

	public void setRenda_anual(Double renda_anual) {
		this.renda_anual = renda_anual;
	}

	public abstract double taxa();
}
