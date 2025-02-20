package br.com.estudos.patterns.factory;

public class Euro implements Moeda {
    @Override
    public String getPrefixo() {
        return "€";
    }
}
