import java.io.IO.println

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
    val imc = calcularimc(peso, estatura)

    // Función para calcular el IMC
    fun calcular(peso: Double, estatura: Double): Double {
        return peso / (estatura * estatura)
    }

    // Mostrar el IMC
    kotlin.io.println()

    // Determinar el estado nutricional según el IMC
  


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

val lstPersonas = mutableListOf<Persona>()

val persona1 = Persona(23.5, 1.54)
val persona2 = Persona(45.3, 1.68)
val persona3 = Persona(73.5, 1.69)

println(lstPersonas)

lstPersonas.forEach{est ->
    println(est)
}
}

fun calcularimc(peso: Double, estatura: Double){

}






