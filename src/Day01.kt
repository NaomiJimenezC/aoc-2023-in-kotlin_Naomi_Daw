fun main() {
    fun getCalibrationValueOfALine(lineOfText:String):Int{
        val numberInTheLine = lineOfText.filter { it.isDigit() }
        val firstDigit = numberInTheLine.first()
        val lastDigit = numberInTheLine.last()
        val calibrationValue = "$firstDigit$lastDigit".toInt()
        return calibrationValue
    }

    fun part1(input: List<String>): Int {
        val calibrationValues = mutableListOf<Int>()
        for (puzzle in  input){
            calibrationValues.add(getCalibrationValueOfALine(puzzle))
        }
        return calibrationValues.sum()
    }

    fun part2(input: List<String>): Int {
        return input.size
    }




    val input = readInput("Day01")
    val calibratios_values = part1(input)

    println(calibratios_values)
}
