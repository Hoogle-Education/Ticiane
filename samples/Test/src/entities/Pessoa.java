package entities;

import entities.interfaces.PegaAlgo;

public class Pessoa implements PegaAlgo {
  
  public static double SELIC = 10.25;

  private String name;
  private int age;
  private String phone;

  public Pessoa(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public Pessoa(String name, int age, String phone) {
    this.name = name;
    this.age = age;
    this.phone = phone;
  }

  public String getName() {
    return name;
  }
  
  public int getAge() {
    return age;
  }
  
  public String getPhone() {
    return phone;
  }
  
  public void setPhone(String phone) {
    this.phone = phone;
  }

  public void setPhone(long phone) {
    this.phone = String.valueOf(phone);
  }

  @Override
  public void pegaCoisaNoAlto(int altura) {
    if(altura > 5) System.out.println("nao consigo");
    else System.out.println("consigo");
  }

}
