import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

internal class PacienteTest{


    val paciente1 = Paciente("João", 2005, "Mãe",
        "minha casa", 500.0, 1569.0
    )

    @Test
      fun testarIMC(){

        var erro = false
        try {

            paciente1.calcularIMC(paciente1.peso, paciente1.altura)
            assertTrue(paciente1.peso > 0 && paciente1.altura > 0)

        }catch (e:Exception){
            erro = true
        }
        assertTrue(erro)

      }

    @Test
        fun verificarIdade(){
            paciente1.calcularIdadePaciente()
            assertFalse(paciente1.erroIdade)
        }
}