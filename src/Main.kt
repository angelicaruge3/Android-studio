import java.io.IO.println
import java.io.IO.readln
import java.text.DecimalFormat

//creado por la estudiante Angelica Ruge Castellanos.


fun main() {
    // Solicitar al usuario su peso y estatura
    println("Ingrese su peso en kilogramos (kg):")
    val peso =  readLine()?.toDoubleOrNull()


    println("Ingrese su estatura en metros (m):")
    val estatura = readLine()?.toDoubleOrNull()

    // Validación de entrada
    if (peso == null || estatura == null || peso <= 0.0 || estatura <= 0.0) {
        println("Datos no válidos. Por favor ingrese valores numéricos positivos.")
        return
    }
    // Calcular el IMC
    val imc = calcularIMC(peso, estatura)

    // Mostrar el IMC
    println("Su Índice de Masa Corporal (IMC) es: %.2f".format(imc))

    // Determinar el estado nutricional según el IMC
    val estadoNutricional = determinarEstadoNutricional(imc)
    println("Estado nutricional: $estadoNutricional")
}





// Función para calcular el IMC
fun calcularIMC(peso: Double, estatura: Double): Double {
    return peso / (estatura * estatura)
}

// Función para determinar el estado nutricional según el IMC
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
