fun main(args: Array<String>) {

    val cliente1 = Cliente(
        "Fabiano", "000.000.00-00",
        "119000000", "Rua Dev da Silva",
        "123456789", 50.66
    )

    println("Bom dia ${cliente1.nome}, seja bem vindo(a) em nossa loja!")
    println()
    println("Confirme seus dados: " +
            "\nCPF: ${cliente1.CPF}" +
            "\nTelefone: ${cliente1.tel} " +
            "\nEndereco: ${cliente1.endereco} " +
            "\nCartao de Crédito:  ${cliente1.cartaoCredito}")
    println()
    cliente1.comprarProduto()

}