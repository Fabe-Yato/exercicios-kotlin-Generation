class Cliente(nome: String, CPF: String, tel: String, endereco: String){

    var nome = nome
    var CPF = CPF
    var tel = tel
    var endereco = endereco
    var cartaoCredito = "123456789"
    var saldoConta  = 0.0


    constructor(
        nome: String,
        CPF: String,
        tel: String,
        endereco: String,
        cartaoCredito: String,
        saldoConta: Double
    ):this(nome, CPF, tel, endereco){
        this.cartaoCredito = cartaoCredito
        this.saldoConta = saldoConta
    }

    fun comprarProduto(){
        println("Produtos: \n" +
                "[1] The Witcher 3 - R$120,99          [2] The Last of Us - R$ 230,00\n" +
                "[3] Resident Evil 2 - R$150,00        [4] Batman: Arkham City - 59,99")
        print("Escolha o produto que deseja comprar: ")
        val produto = readln().toInt()
        val compra = when(produto){
            1 -> {
                if(saldoConta >= 120.99){
                    saldoConta -= 120.99
                    println("\nVocê comprou Batman: The Witcher 3")
                    println("Compra realizada com sucesso! seu novo saldo é R$$saldoConta")
                }
                else{
                    println("Compra negada, saldo indisponivel")
                }
            }
            2 ->{
                if(saldoConta >= 230){
                    saldoConta -= 230
                    println("\nVocê comprou Batman: The Last of Us")
                    println("Compra realizada com sucesso! seu novo saldo é R$$saldoConta")
                }
                else{
                    println("Compra negada, saldo indisponivel")
                }
            }
            3 -> {
                if(saldoConta >= 150){
                    saldoConta -= 150
                    println("\nVocê comprou Batman: Resident Evil 2")
                    println("Compra realizada com sucesso! seu novo saldo é R$$saldoConta")
                }
                else{
                    println("Compra negada, saldo indisponivel")
                }
            }
            4 -> {
                if(saldoConta >= 59.99){
                    saldoConta -= 59.99
                    println("\nVocê comprou Batman: Arkhan City")
                    println("Compra realizada com sucesso! seu novo saldo é R$$saldoConta")
                }
                else{
                    println("Compra negada, saldo indisponivel")
                }
            }
            else ->{
                println("Opção inválida")
            }
        }
        println(compra)
    }
}