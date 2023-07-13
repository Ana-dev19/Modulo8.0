package Exercicio1

 class Livro(nome: String, preco: Double, codigoDeBarras: String, val autor: String) : Produto(nome, preco, codigoDeBarras) {
    override fun mostrarDetalhesDoItem() {
        println("Nome: $nome")
        println("Preço: $preco")
        println("Autor: $autor")
    }
}