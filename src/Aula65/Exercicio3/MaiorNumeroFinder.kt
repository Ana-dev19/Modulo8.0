package Aula65.Exercicio3

class MaiorNumeroFinder {
    fun encontrarMaiorNumero(): Double? {
        val numbers = mutableListOf<Double>()

        for (i in 1..5) {
            println("=====================")
            println("Digite o número $i:")
            val input = readLine()?.toDoubleOrNull()

            if (input != null) {
                numbers.add(input)
            } else {
                println("Valor inválido. Digite um número válido.")
                return null
            }
        }

        return numbers.maxOrNull()
    }
}
