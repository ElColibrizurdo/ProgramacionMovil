//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    val x = 10
    val y = 8

    if (x in 1..y+1)
        println("Hola")

    val list = listOf("a", "b", "c")

    if (-1 !in 0..list.lastIndex) {
        println("-1 esta fuera de rango")
    }
    if (list.size !in list.indices) {
        println("El tamaño de la lista esta fuera del rango de la lista de indices valida")
    }

    for (x in 1..5) {
        print(x)
    }
    println()

    for (x in 1..10 step 2) {
        print(x)
    }
    println()

    for (x in 9 downTo 0 step 3) {
        print(x)
    }

    val items = listOf("apple", "banana", "kiwifruit")
    for (item in items) {
        println(item)
    }

    when {
        "orange" in items -> println("jugo")
        "apple" in items -> println("una manzana")
    }

    
}