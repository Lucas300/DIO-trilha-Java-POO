package fundamentosBasicos.Modulo2.heranca;

public class Program {

	    public static void main(String[] args) {
	        // Cria um objeto Animal
	        Animal animal = new Animal("Gato", 5);
	        animal.fazerSom();
	        animal.exibirInfo();

	        // Cria um objeto Cachorro
	        Cachorro cachorro = new Cachorro("Cachorro", 3, "Labrador");
	        cachorro.fazerSom();
	        cachorro.exibirInfo();
	    
	}

}
