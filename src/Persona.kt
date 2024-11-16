class Persona {

    var peso:Double = 0.0
    var estatura:Double = 0.0

    constructor()
    constructor(peso: Double, estatura: Double){
        this.peso = peso
        this.estatura = estatura
    }
    fun toDuble (): Double {
        return (this.peso); (this.estatura);
    }

    fun calcularIMC(peso: Double, estatura: Double): Double {
        return peso / (estatura * estatura)
    }

    fun determinarEstadoNutricional(imc: Double): String {
        return when {
            imc < 16.0 -> "Delgadez severa"
            imc in 16.0..16.9 -> "Delgadez moderada"
            imc in 17.0..18.4 -> "Delgadez leve"
            imc in 18.5..24.9 -> "Normal"
            imc in 25.0..29.9 -> "Sobrepeso"
            imc in 30.0..34.9 -> "Obesidad "
            imc in 35.0..39.9 -> "Obesidad leve"
            imc >= 40.0 -> "Obesidad mórbida"
            else -> "Valor IMC fuera de rango"
        }
    }

}