 // Exemplo de classe abstrata com método abstrato
abstract class Animal {
    public abstract void emitirSom();
  }
  
  // Exemplo de classe concreta que herda de Animal e implementa o método emitirSom()
  class Cachorro extends Animal {
    public void emitirSom() {
      System.out.println("O cachorro está latindo.");
    }
  }
  
  // Exemplo de classe que encapsula propriedades com acesso controlado
  class Pessoa {
    private String nome;
    private int idade;
    
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
  }
  
  // Exemplo de classe que herda de outra e sobrescreve um método
  class Gato extends Animal {
    public void emitirSom() {
      System.out.println("O gato está miando.");
    }
    
    // Exemplo de polimorfismo com método que recebe um objeto Animal como parâmetro
    public void brincar(Animal animal) {
      System.out.println("Estou brincando com um animal...");
      animal.emitirSom();
    }
  }
  
  public class DIO {
    public static void main(String[] args) {
      // Exemplo de uso de uma classe abstrata com uma referência para a classe concreta
      Animal animal = new Cachorro();
      animal.emitirSom();
      
      // Exemplo de uso de uma classe encapsulada
      Pessoa pessoa = new Pessoa();
      pessoa.setNome("João");
      pessoa.setIdade(25);
      System.out.println("Nome: " + pessoa.getNome());
      System.out.println("Idade: " + pessoa.getIdade());
      
      // Exemplo de uso de polimorfismo com uma classe que herda de outra
      Gato gato = new Gato();
      Animal outroAnimal = new Cachorro();
      gato.brincar(outroAnimal);
    }
  }
