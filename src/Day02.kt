fun main() {
    val numMaxBolasPorColor = mapOf<String,Int>("red" to 12,"green" to 13, "blue" to 14)

    fun part1(input: List<String>): Int {
        val partidasJugadas = readInput("Day02_test")

        var partidasValidas = mutableListOf<Any>()

        for (partida in partidasJugadas) {

            val partidaDividida = partida.split(":")

            val idPartida = partidaDividida[0].filter { it -> it.isDigit() }.toInt()

            val jugadaPorPartida = partidaDividida[1].replace(";", ",")
            for (bolaColor in jugadaPorPartida){
                Pair(1,1) //terminar esto
            }
        }
        return 1
    }
}

