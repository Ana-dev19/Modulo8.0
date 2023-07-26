package Aula65.Exercicio3

import org.junit.Assert.assertEquals
import org.junit.Test

class MaiorNumeroTest {

    @Test
    fun `encontra maior número - caso com números positivos`() {
        val numbers = mutableListOf(10.0, 2.5, 18.7, 5.0, 11.3)

        val maiorNumero = numbers.maxOrNull()

        if (maiorNumero != null) {
            assertEquals(18.7, maiorNumero, 0.01)
        }
    }

    @Test
    fun `encontra maior número - caso com números negativos`() {
        val numbers = mutableListOf(-10.0, -2.5, -18.7, -5.0, -11.3)

        val maiorNumero = numbers.maxOrNull()

        if (maiorNumero != null) {
            assertEquals(-2.5, maiorNumero, 0.01)
        }
    }

    @Test
    fun `encontra maior número - caso com números negativos e positivos`() {
        val numbers = mutableListOf(10.0, -2.5, 18.7, -5.0, 11.3)

        val maiorNumero = numbers.maxOrNull()

        if (maiorNumero != null) {
            assertEquals(18.7, maiorNumero, 0.01)
        }
    }

    @Test
    fun `encontra maior número - caso com apenas um número`() {
        val numbers = mutableListOf(5.0)

        val maiorNumero = numbers.maxOrNull()

        if (maiorNumero != null) {
            assertEquals(5.0, maiorNumero, 0.01)
        }
    }
}