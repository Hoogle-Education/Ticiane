# POO

## métodos

métodos são analogos a funções, porém que estejam anexados em uma classe.

## encapsulamento (`getters` and `setters`)

controlam a manipulação dos atributos.

Antes:

```java
  public class Pessoa {
    public String nome;
    public int idade;
    public long telefone;
  }
```

Depois:

```java
public class Pessoa {
    
    private String nome;
    private int idade;
    private long telefone;

    public String getNome() {
      return nome;
    }

    // removo a setNome para controlar o acesso
    // public void setNome(String nome){
    //   this.nome = nome; // evita a ambiguidade
    // }

    ...

}

```

## Extends - Herança

```java
public class PessoaAlta extends Pessoa {

  public void pegaCoisaNoAlto(){
    // ...
  }

}
```