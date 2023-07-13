package Exercicio2

fun main() {
    val formas = arrayOf(
        Retangulo(10f, 20f),
        Circulo(5f),
        Quadrado(10f),
        Retangulo(5f, 10f),
        Circulo(3f)
    )

    for (forma in formas) {
        when (forma) {
            is Retangulo -> println("Retângulo:")
            is Circulo -> println("Círculo:")
            is Quadrado -> println("Quadrado:")
        }
        println("Área: ${forma.calcularArea()}")
        println("Perímetro: ${forma.calcularPerimetro()}")
        println("--------------------")
    }
}
