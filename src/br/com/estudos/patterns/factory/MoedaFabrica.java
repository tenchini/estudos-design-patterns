package br.com.estudos.patterns.factory;

public class MoedaFabrica {
  public static Moeda getInstance(String pais) {
    return switch (pais) {
      case "BR" -> new Real();
      case "US", "CA" -> new Dolar();
      case "UK" -> new Euro();
      default -> throw new IllegalArgumentException("País não encontrando.");
    };
  }
}

// public static Moeda getInstance(String pais){
//    switch (pais) {
//        case "BR": return new Real();
//        case "US", "CA": return new Dolar();
//        case "UK": return new Euro();
//        default: throw new IllegalArgumentException("País não encontrado.");
//    }
// }
