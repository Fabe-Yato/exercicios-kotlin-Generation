class Aviao(anoFabricacao: Int, gasolina: Int, velocidade: Double){
    var nome = ""
    var anoFabricacao = anoFabricacao
    var cor = ""
    var companhiaAerea = ""
    var gasolina = gasolina
    var velocidade = velocidade


    fun calcularTempoVoo(){
        val distancia = 300.0
        val tempoMedio = ((velocidade * distancia) / 60) /60
        println("A velocidade Média da viagem é: ${tempoMedio.toInt()} horas")

    }
    fun verificarManuntencao(){
        if(anoFabricacao <= 2015){
            println("Está na hora de fazer a manuntenção do avião")
        }
        else{
            println("O avião está com a manuntenção em dia")
        }
    }
    fun encherTanque(){
        if(gasolina <= 100){
            println("Gasolina:  $gasolina de 350\nA gasolina está baixa")
            gasolina += 300
            println("O avião agora está com a gasolina cheia, gasolina: $gasolina de 350")
        }
        else{
            println("Gasolina:  $gasolina de 350\nA gasolina está alta")
        }
    }

    constructor(
        anoFabricacao: Int,
        gasolina: Int,
        velocidade: Double,
        nome: String,
        cor: String,
        companhiaAerea: String
    ): this(anoFabricacao, gasolina, velocidade){
        this.nome = nome
        this.cor = cor
        this.companhiaAerea = companhiaAerea
    }
}