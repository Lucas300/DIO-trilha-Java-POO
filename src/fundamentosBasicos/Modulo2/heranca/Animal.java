package fundamentosBasicos.Modulo2.heranca;

public class Animal {
	// Atributos da classe Animal
	private String nome;
	private int idade;

	// Construtor da classe Animal
	public Animal(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	// Métodos getter e setter para os atributos
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	// Método comum a todos os animais
	public void fazerSom() {
		System.out.println("O animal está fazendo um som");
	}

	// Método para exibir informações do animal
	public void exibirInfo() {
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
	}
}
