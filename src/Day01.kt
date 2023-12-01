fun main() {
    fun part1(input: List<String>): Int {
        return input.size
    }

    fun part2(input: List<String>): Int {
        return input.size
    }

    // test if implementation meets criteria from the description, like:
    fun getCalibrationValueOfALine(lineOfText:String):String{
        val numberInTheLine = lineOfText.filter { it.isDigit() }
        val firstDigit = numberInTheLine.first()
        val lastDigit = numberInTheLine.last()
        val calibrationValue = "$firstDigit$lastDigit"
        return calibrationValue
    }

    val testInput = readInput("Day01_test")
    check(part1(testInput) == 1)

    val input = readInput("Day01")
    val calibratios_values = mutableListOf<String>()

    println(calibratios_values)
}
