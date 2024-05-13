package fundamentosBasicos;

public class Pessoa {
	//public , protected , private
	private String nome;
	private String sobrenome;
	private int idade;
	private Estado_civil Estado_civil;
	
	//construtor
		public Pessoa() {
		
		}
	
	//construtor com parametros
		public Pessoa(String nome, String sobrenome, int idade, fundamentosBasicos.Estado_civil estado_civil) {
			super();
			this.nome = nome;
			this.sobrenome = sobrenome;
			this.idade = idade;
			Estado_civil = estado_civil;
		}
	
	
	public String toString() {
				return String.format("%s %s tem %d %s", nome,sobrenome,idade,Estado_civil);
	}

	
	
}
