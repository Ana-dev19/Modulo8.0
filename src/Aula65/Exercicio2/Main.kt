package Aula65.Exercicio2


fun main() {
    val diaDaSemana = DiaDaSemana()

    println("Digite um número de 1 a 7 para representar o dia da semana:")
    val diaSemana = readLine()?.toIntOrNull()

    if (diaSemana != null) {
        val diaCorrespondente = diaDaSemana.exibirDiaCorrespondente(diaSemana)
        println(diaCorrespondente)
    } else {
        println("Valor inválido. Digite um número válido de 1 a 7.")
    }
}