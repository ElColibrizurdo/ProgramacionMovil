
const val PI = 3.1416;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    val numeroDecimal = 5.1416

    println("1. Al numero decimal se el asigna el tipo de valor " + numeroDecimal::class.simpleName);

    val numeroFlotante: Float = numeroDecimal.toFloat();
    println("Para covertir el valor Double a Float usamos toFloat " + numeroFlotante::class.simpleName);

    val perimetroCirculo = PI*(numeroDecimal*2);
    println("Perimetro del circulo $perimetroCirculo");

    val x1 = 5.14;
    val x2 = 13.84;
    val y1 = 1.18;
    val y2 = 3.88;
    val m: Double;
    m = (y2-y1)/(x2-x1);

    println("la pendiente es $m")

    var pendiente: Double
    pendiente = -3.0 - 3.0 / -2.0 - 3.0

    println("Punto 6 es $pendiente y el resultado es incorrecto porque faltan paréntesis para que Kotlin pueda resolverlo correctamente.")

    pendiente = (-3.0 - 3.0) / (-2.0 - 3.0)

    println("El resultado correcto es $pendiente")
}