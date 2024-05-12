package fundamentosBasicos;

public class Pessoa {
	//public , protected , private
	private String nome;
	private String sobrenome;
	private int idade;
	
	//construtor
		public Pessoa() {
		
		}
	
	//construtor com parametros
	public Pessoa(String nome, String sobrenome, int idade) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.idade = idade;
	}
	
	public String toString() {
				return String.format("%s %s tem %d", nome,sobrenome,idade);
	}
	
	
}
