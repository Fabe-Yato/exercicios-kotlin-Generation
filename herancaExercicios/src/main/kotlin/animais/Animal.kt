package animais

abstract class Animal(
    var nome: String,
    var idade: Int
    ){

    abstract fun emitirSom()
    open fun correr(){}
}