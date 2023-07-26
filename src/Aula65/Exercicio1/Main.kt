package Aula65.Exercicio1

fun main(){
    val produtos = mutableListOf<Produto>()

    for (i in 1..3) {
        println("\nDigite o nome do Produto $i:")
        val nome = readLine().toString()

        println("\nDigite o preço do Produto $i:")
        val preco = readLine()?.toDoubleOrNull()

        if (preco != null) {
            val produto = Produto(nome, preco)
            produtos.add(produto)
        } else {
            println("Preço inválido! Tente novamente.")
            return
        }
    }

    val produtoMaisBarato = produtos.minByOrNull { it.preco }

    if (produtoMaisBarato != null) {
        println("\nVocê deve comprar o ${produtoMaisBarato.nome} que custa R$ ${produtoMaisBarato.preco}.")
    } else {
        println("Não foi possível determinar o produto mais barato.")
    }
}
