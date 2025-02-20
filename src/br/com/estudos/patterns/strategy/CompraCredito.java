package br.com.estudos.patterns.strategy;

public class CompraCredito implements StrategyCompra {
  @Override
  public String pagar(Item item) {
    double valorComAcrescimo = item.getPreco() * 1.05;
    System.out.println("Compra realizada no crédito: " + item + ", valor com acréscimo de 5% do cartão de crédito: R$" +String.format("%.2f", valorComAcrescimo)+ ", obrigado pela compra!");
      return "";
  }
}
