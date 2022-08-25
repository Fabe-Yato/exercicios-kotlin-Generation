package animais

class CavaloMarinho(
    nome: String,
    idade: Int
) : Animal(nome, idade) {

    override fun emitirSom() {
        println("O cavalo marinho não emite som")
    }

    fun nadar() {
        println("Os cavalos-marinhos são encontrados principalmente em \n" +
                "águas rasas tropicais e temperadas em todo o mundo"
        )
        println("O cavalo marinho pode nadar até 150 cm/h")
    }
}