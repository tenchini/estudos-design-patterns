  package br.com.estudos.patterns.builder;

  public class BuilderTeste {
    public static void main(String[] args) {
      //        Paciente guido = new Paciente("12345678910", "Guido", "guido@cubos.academy");
      PacienteBuilder builder = new PacienteBuilder();

      builder.setNome("Vinicius");
      builder.setEmail("vinicius@gmail.com");
      builder.setCpf("12345678910");

      Paciente vinicius = builder.getResultado();

      System.out.println(vinicius.imprimir());

    }
  }
