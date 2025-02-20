package br.com.estudos.patterns.builder;

public class Paciente {
  private String nome;
  private String email;
  private String cpf;

  public Paciente(String nome, String email, String cpf) {
    this.nome = nome;
    this.cpf = cpf;
    this.email = email;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public String imprimir() {
    String ficha = "Fica do paciente:\n";

    if(this.nome != null) {
      ficha += "Nome: " + this.nome + "\n";
    }

    if(this.email != null) {
      ficha += "Email: " + this.email + "\n";
    }

    if(this.cpf != null) {
      ficha += "Cpf: " + this.cpf + "\n";
    }

    return ficha;
  }
}
