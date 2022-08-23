class Cliente(private var nome: String,
              private var endereco: String,
              private var telefone: String){

    private var listaCompras = mutableListOf<String>()

    init{
        if(nome == ""){
            throw Exception("O nome digitado é inválido")
        }
        else{
            boasVindas()
        }
    }

    fun boasVindas(){
        println("Bom dia $nome, bem vindo a sua lista de compras")
    }

    fun adicionarLista(){
        println("======SESSÃO ADICONAR======\n Caso queira voltar digite 9")
        print("Digite o item que deseja adicionar: ")
        val item = readln()
        if(item.isNotBlank()){
            listaCompras.add(item)
            println("O item foi adionado com sucesso!!!")
        }
        else if(item == "9"){
            println("Voltando...")
        }
        else{
            println("O item digitado é inválido")
        }
        println()
    }

    fun removerLista(){
        println("======SESSÃO REMOVER======\n Caso queira voltar digite 9")
        print("Digite o item que deseja remover: ")
        val item = readln()
        if(listaCompras.contains(item)){
            listaCompras.remove(item)
            println("O item foi removido com sucesso!!!")
        }
        else if(item == "9"){
            println("Voltando....")
        }
        else{
            println("O item não existe na lista")
        }
        println()
    }

    fun exibirLista(){
        println("======SESSÃO EXIBIR======")
        var valor = 1
        listaCompras.forEach(){
            println("Item $valor: $it")
            valor += 1
        }
        println()
    }

    fun dadosUsuario(){
        println("Nome: $nome")
        println("Endereço: $endereco")
        println("Telefone: $telefone")
        println()
    }

}