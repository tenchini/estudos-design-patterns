package br.com.estudos.patterns.singleton;

public class TesteConexao {
  public static void main(String[] args) {
    Conexao conexao = Conexao.getInstance("cubosacademy");
    Conexao conexao2 = Conexao.getInstance("vinicius");

    System.out.println(conexao.bancoDeDados);
    System.out.println(conexao2.bancoDeDados);
  }
}
