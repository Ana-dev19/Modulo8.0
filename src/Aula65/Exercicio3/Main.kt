package Aula65.Exercicio3

fun main(){
    val finder = MaiorNumeroFinder()
    val maiorNumero = finder.encontrarMaiorNumero()

    if (maiorNumero != null) {
        println("O maior número é: $maiorNumero")
    } else {
        println("Não foi possível determinar o maior número.")
    }
}
