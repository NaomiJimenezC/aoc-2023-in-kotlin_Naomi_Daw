import kotlin.reflect.typeOf

fun pairsBalls(partidaDividida: List<String>): MutableList<Pair<Int, String>> {
    val jugadaPorPartida = partidaDividida[1].replace(";", ",")
    val jugadasParseadas = mutableListOf<Pair<Int, String>>()
    for (bolaColor in jugadaPorPartida.split(",")) {
        var numeroBola = bolaColor.filter { it -> it.isDigit() }.toInt()
        var colorBola = bolaColor.filter { it -> it.isLetter() }
        jugadasParseadas.add(Pair(numeroBola, colorBola))
    }
    return jugadasParseadas
}



fun part1(partidasJugadas: List<String>):Int{
    val numMaxBolasPorColor = mapOf<String,Int?>("red" to 12,"green" to 13, "blue" to 14)
    var partidasValidas = mutableListOf<Int>()

    for (partida in partidasJugadas) {

        val partidaDividida = partida.split(":")

        val idPartida = partidaDividida[0].filter { it -> it.isDigit() }.toInt()

        val jugadasParseadas = pairsBalls(partidaDividida)

        if (jugadasParseadas.all { it.first <= (numMaxBolasPorColor[it.second]?.toInt() ?: 0) }){
            partidasValidas.add(idPartida)
        }

    }
    return partidasValidas.sum()
}


fun part2(partidasJugadas:List<String>):Int{
    val resultados = mutableListOf<Int>()
    for (partidaJugada in partidasJugadas){
        val resultadosPartida = partidaJugada.split(":")
        val bolasResultado = pairsBalls(resultadosPartida)
        val resultadosDivididosPorColores = bolasResultado.groupBy({ it.second },{it.first})
        val cubosMinimosPorJuego = mutableListOf<Int>()
        resultadosDivididosPorColores.values.forEach { it -> cubosMinimosPorJuego.add(it.max()) }
        val powerForGame =cubosMinimosPorJuego.reduce { factor1, factor2 -> factor1 * factor2 }
        resultados.add(powerForGame)
    }
    return resultados.sum()
}

fun main() {
    val partidasJugadas = readInput("Day02")
    val parte1 = part1(partidasJugadas)
    println(parte1)

    val parte2 = part2(partidasJugadas)
    println(parte2)
}

