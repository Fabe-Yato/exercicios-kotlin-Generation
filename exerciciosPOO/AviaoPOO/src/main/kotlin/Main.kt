fun main(args: Array<String>) {
  val aviao1 = Aviao(2009, 250, 89.9,
        "Boeing-447", "Azul",  "Latam")

  println("Descrição do avião:")

  println("Nome: ${aviao1.nome} \n" +
          "Companhia Aerea: ${aviao1.companhiaAerea}\n" +
          "Ano de Fabricação: ${aviao1.anoFabricacao}\n" +
          "Cor:  ${aviao1.cor}\n" +
          "velocidade: ${aviao1.velocidade} Km/H\n" +
          "gasolina: ${aviao1.gasolina}")

  aviao1.calcularTempoVoo()
  aviao1.verificarManuntencao()
  aviao1.encherTanque()
}