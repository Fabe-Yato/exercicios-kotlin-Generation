package animais

class Cachorro(
    nome: String,
    idade: Int
): Animal(nome, idade){

    override fun emitirSom() {
        println("O cachorro late: auau")
    }

    override fun correr() {
        println("O cachorro corre de maneira quadrupede")
        println("O cachorro pode correr até 68km/h")
    }
}