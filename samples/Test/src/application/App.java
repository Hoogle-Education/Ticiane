package application;

import entities.Pessoa;
import entities.PessoaAlta;

public class App {
  
    public static void main(String[] args) throws Exception {

        // construo uma pessoa na variavel joao
        Pessoa joao = new Pessoa("Joao da Silva", 15);



        joao.setPhone("1297210721");

        System.out.println(joao.getName());
        System.out.println(joao.getAge());
        System.out.println(joao.getPhone());

        joao.pegaCoisaNoAlto(10);

        PessoaAlta maria = new PessoaAlta("Maria", 19);
        maria.pegaCoisaNoAlto(10);

        Pessoa pedro = new PessoaAlta("Pedro gomes", 32);

        System.out.println("-----------------------");

        String str = new String("Teste");
        System.out.println(str);

        Pessoa.SELIC = 2.3;

        System.out.println(Pessoa.SELIC);
        System.out.println("Selic joao : " + joao.SELIC);
        System.out.println("Selic joao : " + maria.SELIC);

    }
    
}
