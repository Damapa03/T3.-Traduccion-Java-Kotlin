fun main(args: Array<String>) {
    println(multiplicar(5))
    // Lambda en Java (requiere interfaz funcional)
    val operacion: Operacion = Operacion { a: Int, b: Int -> a + b }
    println(operacion.sumar(3, 4))
}
fun multiplicar(num: Int): Int {
    return num * 2
}
fun interface Operacion {
    fun sumar(a: Int, b: Int): Int
}
