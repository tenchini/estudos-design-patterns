package br.com.estudos.patterns.strategy;

import java.text.DecimalFormat;

public class CompraPix implements StrategyCompra {
  @Override
  public String pagar(Item item) {
    double valorComDesconto = item.getPreco() * 0.9;
    System.out.println("Compra realizada no PIX: " + item + ", valor com desconto de 10% do PIX: R$" +String.format("%.2f", valorComDesconto)+ ", obrigado pela compra!");
    return "";
  }
  }
