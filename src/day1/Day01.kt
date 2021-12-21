fun main() {
    val testInput = readInput("Day01_input")

    var incCnt = 0
    for(i in 1 until testInput.size) {
        if(testInput[i].toInt() > testInput[i-1].toInt()) {
            incCnt += 1
        }
    }

    print(incCnt)
}