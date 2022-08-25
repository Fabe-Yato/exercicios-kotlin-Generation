package animais

class Cavalo(
    nome: String,
    idade: Int
) : Animal(nome, idade) {

    override fun emitirSom() {
        println("O cavalo relincha: Irrinhó")
    }

    override fun correr() {
        println("O cavalo corre de forma quadrupede")
        println("O cavalo pode chegar até 88km/h")
    }
}