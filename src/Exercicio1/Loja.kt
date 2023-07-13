package Exercicio1

import java.util.*

class Loja {
    companion object {
    @JvmStatic
    fun main(args: Array<String>) {
        val scanner = Scanner(System.`in`)
        val produtos = arrayOfNulls<Produto>(5)

        for (i in produtos.indices) {
            println("-----Olá! Bem-vindo a nossa loja. Insira as informações do produto desejado ${i + 1}-------")
            println("Tipo (Livro/CD/DVD): ")
            val tipo = scanner.nextLine()
            print("Nome: ")
            val nome = scanner.nextLine()
            print("Preço: ")
            val preco = scanner.nextDouble()
            scanner.nextLine()
            print("Código de barras: ")
            val codigoDeBarras = scanner.nextLine()

            when (tipo) {
                "Livro" -> {
                    print("Autor: ")
                    val autor = scanner.nextLine()
                    produtos[i] = Livro(nome, preco, codigoDeBarras, autor)
                }
                "CD" -> {
                    print("Número de faixas: ")
                    val numeroDeFaixas = scanner.nextInt()
                    scanner.nextLine()
                    produtos[i] = CD(nome, preco, codigoDeBarras, numeroDeFaixas)
                }
                "DVD" -> {
                    print("Duração: ")
                    val duracao = scanner.nextDouble()
                    scanner.nextLine()
                    produtos[i] = DVD(nome, preco, codigoDeBarras, duracao)
                }
            }
        }

        for (produto in produtos) {
            produto?.mostrarDetalhesDoItem()
            println()
        }

        val produtoBuscado = produtos[0]
        val produtoEncontrado = produtos.indexOf(produtoBuscado)
        if (produtoEncontrado != -1) {
            println("Produto encontrado na posição $produtoEncontrado do vetor.")
        } else {
            println("Produto não encontrado.")
        }

        val produtoComMesmoCodigo = Livro("Livro 3", 39.90, "123456789", "Autor 3")
        val produtoComCodigoDiferente = Livro("Livro 4", 59.90, "678912345", "Autor 4")

        println(produtoBuscado == produtoComMesmoCodigo)
        println(produtoBuscado == produtoComCodigoDiferente)
    }
}
}