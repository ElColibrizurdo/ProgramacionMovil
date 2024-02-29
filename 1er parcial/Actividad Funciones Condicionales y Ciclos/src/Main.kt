import javax.swing.tree.DefaultTreeCellEditor.DefaultTextField


//Torres Alvarez Angel 6NM61 Funciones, Condicionales y Ciclos
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    println("area del rectangulo" + AreaRectangulo(6.15f, 8.15f));
    println("Volumen del prisma rectangular" + VolumenPrismaRectangular(6.15f, 10.55f, 8.45f));
    //println(Promedio(4.5f))
    println("No se puede poner valores por defecto en una funcion y despues meter un dato sin especificar pa quien es")
    println("El promedio asignado dos valores es" + Promedio(4.5f, calif3 = 10f))
    println("El promedio asignando un valor a las 3 calif es " + Promedio(4.5f, 6.8f, calif3 = 10f))
    println("El promedio con los dos valores por defecto y asignando uno al libre es " + Promedio(calif3 = 10f))

    DeterminarTriangulo(55.45f, 55.45f, 86.44f)
    DeterminarString("Hola")
    DetermnarNumVecesNombres();
}

fun AreaRectangulo(base: Float, altura: Float): Float {

    return base * altura;
}

fun VolumenPrismaRectangular(longitud: Float, ancho: Float, altura: Float): Float {

    val multi = AreaRectangulo(ancho, altura)
    return longitud * multi;
}

fun Promedio(calif1: Float = 8f, calif2: Float = 8f, calif3: Float): Float {

    return (calif1 + calif2 + calif3) / 3
}

fun DeterminarTriangulo(Lado1: Float, Lado2: Float, Lado3: Float) {

    val Triangulo: String;
    val contador = 0

    if (Lado1 == Lado2 && Lado3 == Lado1) {
        println("Es un equilatero")
    }else if (Lado1 == Lado3 || Lado1 == Lado2) {
        if (!(Lado3 == Lado2)) {
          println("Es un isoceles")
        }
    } else {
        println("Es un escaleno")
    }
}

fun DeterminarString(cadena: Any) {
    when (cadena) {
        is Double -> println("Es double")
        is Float -> println("Es Float")
        is Int -> println("Es Int")
        is String -> println("Es String")
        else -> println("Es otro")
    }
}

fun DetermnarNumVecesNombres() {

    val nombres = arrayOf("Pedro Luis", "Juan Manuel", "Juan Luis", "María Inés", "Romeo", "Ernesto",
        "Juan Pedro", "Ariadna", "Mireya María", "Ana Sofía", "José Juan")

    val contador = 0

    for (elemento in nombres) {

        if (elemento == "Pedro Luis") {
            contador+1
        }
    }

    println("El numero de veces que se repite el nombre Pedro Luis es $contador")
}

