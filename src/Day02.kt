import kotlin.reflect.typeOf

fun main() {
    val partidasJugadas = readInput("Day02")
    val numMaxBolasPorColor = mapOf<String,Int?>("red" to 12,"green" to 13, "blue" to 14)


    fun part1(input: List<String>):Int{
        var partidasValidas = mutableListOf<Int>()

        for (partida in partidasJugadas) {

            val partidaDividida = partida.split(":")

            val idPartida = partidaDividida[0].filter { it -> it.isDigit() }.toInt()

            val jugadaPorPartida = partidaDividida[1].replace(";", ",")
            val jugadasParseadas = mutableListOf<Pair<Int,String>>()
            for (bolaColor in jugadaPorPartida.split(",")){
                var numeroBola = bolaColor.filter { it -> it.isDigit() }.toInt()
                var colorBola = bolaColor.filter { it -> it.isLetter() }
                jugadasParseadas.add(Pair(numeroBola,colorBola))
            }

            if (jugadasParseadas.all { it.first <= (numMaxBolasPorColor[it.second]?.toInt() ?: 0) }){
                partidasValidas.add(idPartida)
            }

        }
        return partidasValidas.sum()

    }
    val prueba = part1(partidasJugadas)
    println(prueba)
}

