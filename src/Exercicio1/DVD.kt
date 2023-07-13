package Exercicio1

class DVD(nome: String, preco: Double, codigoDeBarras: String, val duracao: Double) : Produto(nome, preco, codigoDeBarras) {
    override fun mostrarDetalhesDoItem() {
        println("Nome: $nome")
        println("Preço: $preco")
        println("Duração: $duracao")
    }
}