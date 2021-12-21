fun main() {
    val testInputStr = readInput("Day01_test")
    val testInput = testInputStr.map { ti -> ti.toInt() }
    var incCnt = 0

    for (i in 1 until testInput.size - 2) {
        if ((testInput[i] + testInput[i + 1] + testInput[i + 2]) > (testInput[i - 1] + testInput[i] + testInput[i + 1])) {
            incCnt += 1
        }
    }

    print(incCnt)
}