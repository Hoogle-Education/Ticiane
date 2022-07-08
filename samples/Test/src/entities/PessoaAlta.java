package entities;

public class PessoaAlta extends Pessoa {

  public PessoaAlta(String name, int age) {
    super(name, age); // reutilizou o construtor da super classe
  }

  @Override
  public void pegaCoisaNoAlto(int altura) {
    System.out.println("sempre consigo");
  }

}
