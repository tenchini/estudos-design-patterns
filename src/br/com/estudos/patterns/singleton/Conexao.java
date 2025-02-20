package br.com.estudos.patterns.singleton;

public final class Conexao {
  private static Conexao instancia;
  public String bancoDeDados;

  private Conexao(String bancoDeDados) {
    this.bancoDeDados = bancoDeDados;
  }

  public static Conexao getInstance(String bancoDeDados) {
    if (instancia == null) {
       instancia = new Conexao(bancoDeDados);
    }
    return instancia;
  }
}
