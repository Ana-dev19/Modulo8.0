package Aula65.Exercicio2

class DiaDaSemana {
    fun exibirDiaCorrespondente(diaSemana: Int): String{
        return when (diaSemana) {
            1 -> "Domingo"
            2 -> "Segunda-feira"
            3 -> "Terça-feira"
            4 -> "Quarta-feira"
            5 -> "Quinta-feira"
            6 -> "Sexta-feira"
            7 -> "Sábado"
            else -> "Valor inválido"
        }
    }
}
