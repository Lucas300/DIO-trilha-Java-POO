package fundamentosBasicos;

public class Program {

	public static void main(String[] args) {
		String nome = "Lucas";
		String sobrenome = "Daniel";
		int idade = 24;
		String estado_civil = "SOLTEIRO";

		//                                             ou Estado_civil.SOLTEIRO             
		Pessoa pessoa = new Pessoa(nome,sobrenome,idade,Estado_civil.valueOf(estado_civil));
		
		System.out.println(pessoa);
	}
}
