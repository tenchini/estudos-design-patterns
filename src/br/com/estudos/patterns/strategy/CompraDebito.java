package br.com.estudos.patterns.strategy;

public class CompraDebito implements StrategyCompra {
  @Override
  public String pagar(Item item) {
    System.out.println("Compra realizada no débito: " + item + ", valor: R$" +String.format("%.2f", item.getPreco())+ ", obrigado pela compra!");
    return "";
  }
}
