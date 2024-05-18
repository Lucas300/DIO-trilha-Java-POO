package fundamentosBasicos.Modulo2.polimorfismo.Animais;

public class Program {

	public static void main(String[] args) {
		// Cria um array de objetos Animal
        Animal[] animais = {new Cachorro(), new Gato(), new Animal()};

      
        for (Animal animal : animais) {
            animal.fazerSom(); 
        }

	}

}
