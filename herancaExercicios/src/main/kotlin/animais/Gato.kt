package animais

class Gato(
    nome: String,
    idade: Int
) : Animal(nome, idade) {

    override fun emitirSom() {
        println("O gato mia: miau")
    }

    override fun correr() {
        println("O gato corre de maneira quadrupede")
        println("O gato pode correr até 48km/h")
    }
}