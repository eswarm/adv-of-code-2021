fun main() {
    val testInput = readInput("Day02_input")

    val submarine = Submarine()

    for (ip in testInput) {
        val splitStr = ip.split(" ")
        val subCommand = SubCommand(Direction.valueOf(splitStr[0]), splitStr[1].toInt())
        submarine.sendCommand(subCommand)
    }

    print(submarine.depth * submarine.distance)
}

/*
class Submarine {
    var distance = 0
    var depth = 0
    var aim = 0

    fun sendCommand(subCommand: SubCommand) {
        when (subCommand.direction) {
            Direction.forward ->
                distance += subCommand.displacement
            Direction.down ->
                depth += subCommand.displacement
            Direction.up ->
                depth -= subCommand.displacement
        }
    }


}

class SubCommand(val direction: Direction, val displacement: Int)

enum class Direction {
    forward,
    up,
    down
}

 */

