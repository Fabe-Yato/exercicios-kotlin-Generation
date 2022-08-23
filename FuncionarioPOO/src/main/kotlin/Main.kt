fun main(args: Array<String>) {
    val funcionario1 = Funcionario("Jonas", "Desenvolvedor Mobile", 8,
                                    "Desenvolvimento", "Masculino")

    println("Detalhas do funcionário: ")
    println("Nome: ${funcionario1.nome}\n" +
            "Cargo: ${funcionario1.cargo}\n" +
            "Horas de serviço: ${funcionario1.horaServico} horas\n" +
            "Setor: ${funcionario1.setor}\n" +
            "Sexo: ${funcionario1.sexo}")
    funcionario1.calcularSalario()

}