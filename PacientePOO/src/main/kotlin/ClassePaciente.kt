class Paciente(nome: String, anoNascimento: Int, parentesco: String){
    var nome = nome
    var parentesco = parentesco
    var anoNascimento = anoNascimento
    var alergia = ""
    var peso = 0.0
    var altura = 0.0
    var endereco = ""


    fun calcularIMC(){
        val IMC = peso / (altura * altura)
        when(IMC){
            in 0.0..18.5 -> println("Paciente abaixo do peso")
            in 18.6..24.9 -> println("Paciente com peso ideal")
            in 25.0..29.9 -> println("Paciente levemente acima do peso")
            in 30.0..34.9 -> println("Obesidade grau I")
            in 35.0..39.9 -> println("Paciente com Obesidade grau II")
            in 40.0..200.0 -> println("Paciente com Obesidade grau III")
        }
    }

    fun ReceitarRemedios(){
        println("Digite a alergia do paciente: ")
        alergia = readln()
        when(alergia.lowercase()){
            "rinite" -> println("Para rinite é recomendado Loratadina comprimido")
            "sinusite" -> println("Para sinusite é recomendado Decongex Plus")
            "asma" -> println("Para asma é recomendado Corticoides inalatórios.")
        }
    }

    fun calcularIdadePaciente(){
        val idade = 2021 - anoNascimento
        println("A idade do paciente é: $idade anos")
    }


    constructor(
        nome: String,
        anoNascimento: Int,
        parentesco: String,
        endereco: String,
        peso: Double,
        altura: Double
    ): this(nome, anoNascimento, parentesco){
        this.endereco = endereco
        this.peso = peso
        this.altura = altura
    }

}