class Carro {
  private String marca;
  private String nome;
  public Carro(String marca, String nome) {
    this.marca = marca;
    this.nome = nome;
  }
  protected String nomeCompleto() {
    return marca + " " + nome;
  }
  public void andar() {
    System.out.println("O carro " + nomeCompleto() + " está andando");
  }
}
public class Cod2 {
  public static void main(String[] args) {
    Carro carro = new Carro("Fiat", "Gol");
    
    carro.andar();
  }
}


