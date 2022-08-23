fun main(args: Array<String>) {
    val cliente1 = Cliente("Fabiano", "Rua DEV", "233455334")

    try{
        while(true){
            println("Digite uma opção: ")
            println("[1] Adicionar itens a lista            [2] Remover itens da lista")
            println("[3] Exibir os itens da lista           [4] Exibir os dados do usuário")
            println("[5] Sair do programa")
            print("Escolha: ")
            val escolha = readln().toInt()
            println()

            when(escolha){
                1 -> cliente1.adicionarLista()
                2 -> cliente1.removerLista()
                3 -> cliente1.exibirLista()
                4 -> cliente1.dadosUsuario()
                5 -> break
                else -> println("opção inválida")
            }
        }
    }catch (e: Exception){
        println(e.message)
    }

}