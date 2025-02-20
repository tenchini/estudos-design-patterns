package br.com.estudos.patterns.factory;

public class Dolar implements Moeda {
    @Override
    public String getPrefixo() {
        return "$";
    }
}
