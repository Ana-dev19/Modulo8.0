package Exercicio1

class CD (nome: String, preco: Double, codigoDeBarras: String, val numeroDeFaixas: Int) : Produto(nome, preco, codigoDeBarras) {
    override fun mostrarDetalhesDoItem() {
        println("Nome: $nome")
        println("Preço: $preco")
        println("Número de faixas: $numeroDeFaixas")
    }
}