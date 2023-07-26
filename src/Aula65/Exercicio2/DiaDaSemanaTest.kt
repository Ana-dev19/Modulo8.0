package Aula65.Exercicio2
import org.junit.Assert.assertEquals
import org.junit.Test

class DiaDaSemanaTest {
    @Test
    fun `exibe dia correspondente - segunda-feira`() {
        val diaDaSemana = DiaDaSemana()
        val diaCorrespondente = diaDaSemana.exibirDiaCorrespondente(2)
        assertEquals("Segunda-feira", diaCorrespondente)
    }

    @Test
    fun `exibe dia correspondente - domingo`() {
        val diaDaSemana = DiaDaSemana()
        val diaCorrespondente = diaDaSemana.exibirDiaCorrespondente(1)
        assertEquals("Domingo", diaCorrespondente)
    }

    @Test
    fun `exibe dia correspondente - sábado`() {
        val diaDaSemana = DiaDaSemana()
        val diaCorrespondente = diaDaSemana.exibirDiaCorrespondente(7)
        assertEquals("Sábado", diaCorrespondente)
    }

    @Test
    fun `exibe valor inválido`() {
        val diaDaSemana = DiaDaSemana()
        val diaCorrespondente = diaDaSemana.exibirDiaCorrespondente(9)
        assertEquals("Valor inválido", diaCorrespondente)
    }
}

