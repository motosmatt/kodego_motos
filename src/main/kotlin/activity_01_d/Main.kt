package activity_01_d
import mu.KotlinLogging
private val logger = KotlinLogging.logger{}
fun main() {

    logger.info { "Input first amount: " }
    var amount1 = readln().toIntOrNull()
    if (amount1 == null) {
        do {
            logger.error { "Please input a valid integer: " }
            amount1 = readln().toIntOrNull()
        } while (amount1 == null)

    }
    logger.info { "Input 2nd amount: " }
    var amount2 = readln().toIntOrNull()
    if (amount2 == null) {
        do {
            logger.error { "Please input a valid integer: " }
            amount2 = readln().toIntOrNull()
        } while (amount2 == null)
    }
    logger.info { "Input 3rd amount: " }
    var amount3 = readln().toIntOrNull()
    if (amount3 == null) {
        do {
            logger.error { "Please input a valid integer: " }
            amount3 = readln().toIntOrNull()
        } while (amount3 == null)
    }
    logger.info { "Input 4th amount: " }
    var amount4 = readln().toIntOrNull()
    if (amount4 == null) {
        do {
            logger.error { "Please input a valid integer: " }
            amount4 = readln().toIntOrNull()
        } while (amount4 == null)

    }
    logger.info { "Input 5th amount: " }
    var amount5 = readln().toIntOrNull()
    if (amount5 == null) {
        do {
            logger.error { "Please input a valid integer: " }
            amount5 = readln().toIntOrNull()
        } while (amount5 == null)
    }
    logger.info { "Divide the value by how many?: " }
    var divideTheValue = readln().toIntOrNull()
    if (divideTheValue == null){
        do {
            logger.error{"It will only accept an Integer as input"}
            divideTheValue = readln().toIntOrNull()
        }  while (divideTheValue == null)
    }

}
