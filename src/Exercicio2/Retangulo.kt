package Exercicio2

import kotlin.math.PI

open class Retangulo (val lado: Float, val altura: Float) : Forma() {
    override fun calcularArea(): Float {
        return lado * altura
    }

    override fun calcularPerimetro(): Float {
        return 2 * (lado + altura)
    }
}

class Circulo(val raio: Float) : Forma() {
    override fun calcularArea(): Float {
        return (raio * raio * PI).toFloat()
    }

    override fun calcularPerimetro(): Float {
        return (2 * raio * PI).toFloat()
    }
}

class Quadrado(lado: Float) : Retangulo(lado, lado)
