import animais.*

fun cachorro(){
    println()
    println("Você escolheu a opção cachorro")
    print("Dê um nome ao cachorro: ")
    var nomeCachorro = readln()

    print("Dê uma idade ao cachorro: ")
    var idadeCachorro = readln().toInt()

    val cachorro1 = Cachorro(nomeCachorro, idadeCachorro)
    println()
    println("Nome cachorro: ${cachorro1.nome}\n" +
            "Idade: ${cachorro1.idade}"
    )

    cachorro1.emitirSom()
    cachorro1.correr()
    println()

}
fun cavalo(){

    println()
    println("Você escolheu a opção cavalo")
    print("Dê um nome ao cavalo: ")
    var nomeCavalo = readln()

    print("Dê uma idade ao cavalo: ")
    var idadeCavalo = readln().toInt()

    val cavalo1 = Cavalo(nomeCavalo, idadeCavalo)
    println()
    println("Nome cavalo: ${cavalo1.nome}\n" +
            "Idade: ${cavalo1.idade}"
    )

    cavalo1.emitirSom()
    cavalo1.correr()
    println()
}
fun preguica(){

    println()
    println("Você escolheu a opção preguiça")
    print("Dê um nome ao preguiça: ")
    var nomePreguica = readln()

    print("Dê uma idade ao preguiça: ")
    var idadePreguica = readln().toInt()

    val preguica1 = Preguica(nomePreguica, idadePreguica)
    println()
    println("Nome preguiça: ${preguica1.nome}\n" +
            "Idade: ${preguica1.idade}"
    )

    preguica1.emitirSom()
    preguica1.sobeEmArvores()
    println()

}
fun gato(){

    println()
    println("Você escolheu a opção gato")
    print("Dê um nome ao gato: ")
    var nomeGato = readln()

    print("Dê uma idade ao gato: ")
    var idadeGato = readln().toInt()

    val gato1 = Gato(nomeGato, idadeGato)
    println()
    println("Nome preguiça: ${gato1.nome}\n" +
            "Idade: ${gato1.idade}"
    )

    gato1.emitirSom()
    gato1.correr()
    println()

}
fun cavaloMarinho(){

    println()
    println("Você escolheu a opção cavalo marinho")
    print("Dê um nome ao cavalo marinho: ")
    var nomeCavaloMarinho = readln()

    print("Dê uma idade ao cavalo marinho: ")
    var idadeCavaloMarinho = readln().toInt()

    val cavaloMarinho1 = CavaloMarinho(nomeCavaloMarinho, idadeCavaloMarinho)
    println()
    println("Nome cavalo marinho: ${cavaloMarinho1.nome}\n" +
            "Idade: ${cavaloMarinho1.idade}"
    )

    cavaloMarinho1.emitirSom()
    cavaloMarinho1.nadar()

    println()
}