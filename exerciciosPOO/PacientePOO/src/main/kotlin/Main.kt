fun main(args: Array<String>) {
    print("Digite o seu nome: ")
    val nome = readln()

    println("Digite o ano de seu nascimento: ")
    val anoNascimento = readln().toInt()

    println("Digite o nome de um parente: ")
    val parentesco = readln()
    val paciente1 = Paciente(nome, anoNascimento, parentesco, "Rua dos DEVS", 72.5, 1.70)

    println("Confirme suas informações: \n" +
            "Nome: ${paciente1.nome} \n" +
            "Parentesco: ${paciente1.parentesco} \n"
    )
    paciente1.calcularIdadePaciente()
    paciente1.ReceitarRemedios()
    println("Peso: ${paciente1.peso} \n" +
            "Altura: ${paciente1.altura} \n"
    )
    paciente1.calcularIMC()

}