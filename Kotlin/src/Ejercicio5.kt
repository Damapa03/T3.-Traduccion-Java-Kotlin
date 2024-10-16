class Personaje5(var nombre: String, var vida: Int, var ataque: Int) {
    fun mostrarInfo() {
        println("Nombre: $nombre, Vida: $vida, Ataque: $ataque")
    }
}
fun main(args: Array<String>) {
    val goku = Personaje5("Goku", 100, 50)
    goku.mostrarInfo()
}
