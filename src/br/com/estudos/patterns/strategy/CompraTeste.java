package br.com.estudos.patterns.strategy;

public class CompraTeste {
    public static void main(String[] args) {
        Item notebook = new Item("Notebook Acer Nitro 5", 4200.0);
        Item mouse = new Item("Mouse VXE", 332.99);
        Item headset = new Item("Logitech G733", 989.91);

        // Compra com crédito
        Compra compraCredito = new Compra(new CompraCredito());
        System.out.println(compraCredito.processarCompra(notebook));

        // Compra com débito
        Compra compraDebito = new Compra(new CompraDebito());
        System.out.println(compraDebito.processarCompra(mouse));

        // Compra com PIX (com desconto de 10%)
        Compra compraPix = new Compra(new CompraPix());
        System.out.println(compraPix.processarCompra(headset));
    }
}
