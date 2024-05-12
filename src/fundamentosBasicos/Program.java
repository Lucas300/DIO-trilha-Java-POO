package fundamentosBasicos;

public class Program {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();

		pessoa.nome = "Lucas";
		pessoa.sobrenome = "Daniel";
		pessoa.idade = 24;
		
		System.out.println(pessoa.nome + " "+pessoa.sobrenome+" tem "+pessoa.idade);
	}

}
