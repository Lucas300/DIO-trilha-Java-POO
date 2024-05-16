package fundamentosBasicos.Modulo2.heranca;

public class Cachorro extends Animal {
    // Atributo específico da classe Cachorro
    private String raca;

    // Construtor da classe Cachorro
    public Cachorro(String nome, int idade, String raca) {
        super(nome, idade);  // Chama o construtor da classe base (Animal)
        this.raca = raca;
    }

    // Método getter e setter para o atributo raca
    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    // Sobrescrita do método fazerSom
    @Override
    public void fazerSom() {
        System.out.println("O cachorro está latindo");
    }

    // Sobrescrita do método exibirInfo para incluir a raça
    @Override
    public void exibirInfo() {
        super.exibirInfo();  // Chama o método da classe base
        System.out.println("Raça: " + raca);
    }
}