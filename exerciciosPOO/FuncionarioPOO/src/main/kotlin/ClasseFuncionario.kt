class Funcionario(nome: String, cargo: String, horaServico: Int){
    var nome = nome
    var cargo = cargo
    var setor = ""
    var horaServico = horaServico
    var sexo = ""

    fun calcularSalario(){
        val salario = (horaServico * 15) * 30
        println("O salário do funcionario $nome é $salario /Mês")
    }


    constructor(
        nome: String,
        cargo: String,
        horaServico: Int,
        setor: String,
        sexo: String
    ): this(nome, cargo,horaServico){
        this.setor = setor
        this.sexo = sexo
    }

}