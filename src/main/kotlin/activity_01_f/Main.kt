package activity_01_f
import mu.KotlinLogging
private val logger = KotlinLogging.logger{}

//Create an application that will accept 2 string inputs.
//
//Your application will print all unique characters in both Strings.
//
//
//
//Scope :
//
//String
//
//Loops


fun main() {
    logger.info { "Enter String 1: " }
    var string = readln()
    if (string == null) {
        do {
            string = readln()
        } while (string == null)
    }
    var str = "qwertyuiop"

    for (i in 0 until str.length) {
        logger.info { (str[i]) }
    }

    logger.info { "Enter String 2: " }
    var string2 = readln()
    if (string2 == null) {
        do {
            string = readln()
        } while (string == null)

    }
    var str2 = "asdfghjkl"

    for (i in 0 ..8) {
        logger.info { (str2[i]) }
    }
}