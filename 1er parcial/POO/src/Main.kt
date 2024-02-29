import java.lang.invoke.VarHandle
//Actividad Programacion Orientada a Objetos
//Torres Alvarez Angel 6NM61
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    val Vehiculo = Vehiculo()

    Vehiculo.color = "Rojo"
    Vehiculo.marca = "Apache"
    Vehiculo.modelo = "triciclo"
    Vehiculo.placas = "2XKO"
    Vehiculo.encendido = false
    Vehiculo.gasolina = 10f

    println("Status del coche ${Vehiculo.encendido}")
    Vehiculo.Encender()
    println("Status del coche ${Vehiculo.encendido}")

    println("Nivel del tanque es ${Vehiculo.gasolina}")
    Vehiculo.Recarga(10.50f)
    println("Le meti 10.5 L de gsolina, ahora tiene ${Vehiculo.gasolina}")

    Vehiculo.color = ""
    Vehiculo.marca = ""
    Vehiculo.modelo = ""
    Vehiculo.placas = ""
    Vehiculo.encendido = false
    Vehiculo.gasolina = 0.00f

    println("Vamos a resetear los datos del Vehiculo")

    //Clase persona con datos de constructor
    val persona = Persona("Angel", "Torres", "Hombre", 1.80f)
    println("La persons tiene el nombre ${persona.nombre}")
    println("La persons tiene el apellido ${persona.apellidos}")
    println("La persons tiene el sexo ${persona.sexo}")
    println("La persons tiene una altura ${persona.altura}")
}

class Persona(val nombre: String, val apellidos: String, val sexo: String, val altura: Float) {


}

class Vehiculo {

    var color: String = ""
    var marca: String = ""
    var modelo: String = ""
    var placas: String = ""
    var encendido: Boolean = false
    var gasolina: Float = 0f

    fun Encender() {
        encendido = true
    }

    fun Apagar() {
        encendido = false
    }

    fun Recarga(recarga: Float) {
        gasolina += recarga
    }
}