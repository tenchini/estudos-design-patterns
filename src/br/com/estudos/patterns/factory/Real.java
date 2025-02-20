package br.com.estudos.patterns.factory;

public class Real implements Moeda {
  @Override
  public String getPrefixo() {
    return "R$";
  }
}
