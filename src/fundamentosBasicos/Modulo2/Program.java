package fundamentosBasicos.Modulo2;

public class Program {

	public static void main(String[] args) {
		Carro carro = new Carro("branco",2024,"Fiat","mobi");

		carro.AumentarVelocidade();
		carro.AumentarVelocidade();
		carro.AumentarVelocidade();

		carro.DiminuirVelocidade();
		
		System.out.println(carro);
	}

}
