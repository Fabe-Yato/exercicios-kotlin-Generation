fun main(args: Array<String>) {

    while(true){
        println("Digite o número do animal :")
        println("[1] Cachorro           [2] Cavalo\n" +
                "[3] Preguiça           [4] Gato\n" +
                "[5] Cavalo Marinho     [6] Sair do programa"
        )
        print("Escolha: ")
        var escolha = readln().toInt()

        when(escolha){
            1 -> cachorro()
            2 -> cavalo()
            3 -> preguica()
            4 -> gato()
            5 -> cavaloMarinho()
            6 -> break
            else -> println("Opção de animal inválida")
        }
    }

}