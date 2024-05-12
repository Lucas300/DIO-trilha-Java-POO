package fundamentosBasicos;

public class Program {

	public static void main(String[] args) {

		String nome = "Lucas";
		String sobrenome = "Daniel";
		int idade = 24;
		
		Pessoa pessoa = new Pessoa(nome,sobrenome,idade);
		
		
		System.out.println(pessoa);
	}

}
