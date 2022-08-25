package animais

class Preguica(
    nome: String,
    idade: Int
) : Animal(nome, idade) {

    override fun emitirSom() {
        println("A preguiça só emite sons quando se sente ameaçada")
    }
    fun sobeEmArvores() {
        println("A preguiça não corre")
        println("Sua velocidade alcança apenas 0,27km/h")
    }
}