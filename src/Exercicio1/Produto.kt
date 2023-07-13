package Exercicio1

abstract class Produto(val nome: String, val preco: Double, val codigoDeBarras: String) {
    abstract fun mostrarDetalhesDoItem()

    override fun equals(other: Any?): Boolean {
        if (other is Produto) {
            return codigoDeBarras == other.codigoDeBarras
        }
        return false
    }
}