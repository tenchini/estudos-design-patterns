package br.com.estudos.patterns.strategy;

public class Compra {
    private StrategyCompra estrategia;

    public Compra(StrategyCompra estrategia) {
        this.estrategia = estrategia;
    }

    public String processarCompra(Item item) {
        return estrategia.pagar(item);
    }
}