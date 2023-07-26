package Aula65.Exercicio1
import org.junit.Assert.assertEquals
import org.junit.Test

class ProdutoTest {
    @Test
    fun `encontra produto mais barato`() {
        val precoProduto1 = 10.0
        val precoProduto2 = 5.0
        val precoProduto3 = 8.0

        val produtos = listOf("Produto 1", "Produto 2", "Produto 3")
        val precos = listOf(precoProduto1, precoProduto2, precoProduto3)

        val indiceProdutoMaisBarato = precos.indexOf(precos.minOrNull())

        val produtoMaisBarato = produtos[indiceProdutoMaisBarato]
        val precoMaisBarato = precos[indiceProdutoMaisBarato]

        assertEquals("Produto 2", produtoMaisBarato)
        assertEquals(5.0, precoMaisBarato, 0.01)
    }
    @Test
    fun `verifica resultado quando ha precos iguais`() {
        val precoProduto1 = 10.0
        val precoProduto2 = 5.0
        val precoProduto3 = 5.0

        val produtos = listOf("Produto 1", "Produto 2", "Produto 3")
        val precos = listOf(precoProduto1, precoProduto2, precoProduto3)

        val indiceProdutoMaisBarato = precos.indexOf(precos.minOrNull())

        val produtoMaisBarato = produtos[indiceProdutoMaisBarato]
        val precoMaisBarato = precos[indiceProdutoMaisBarato]

        assertEquals("Produto 2", produtoMaisBarato)
        assertEquals(5.0, precoMaisBarato, 0.01)
    }
}





