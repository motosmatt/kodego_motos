package activity_01_g
import mu.KotlinLogging
import java.util.*

private val logger = KotlinLogging.logger{}

fun main(args: Array<String>) {
        var str = "GIRAFARIG"
        var str2 = "Kayak"
        var reverseStr = ""
        var num = 202
        var reversedNum = 0
        var remainder: Int
        val originalNum = num
        var reverseStr2 = ""
        var strLength = str.length
        var strLength2 = str2.length
        for (i in strLength - 1 downTo 0) {
            reverseStr = reverseStr + str[i]
        }
        if (str.lowercase() == reverseStr.lowercase()) {
            logger.info{("$str is a Palindrome.")}
        } else {
            logger.info{("$str is not a Palindrome.")}
        }

        for (i in strLength2 - 1 downTo 0) {
            reverseStr2 = reverseStr2 + str2[i]
        }
        if (str2.lowercase() == reverseStr2.lowercase()) {
            logger.info{("$str2 is a Palindrome.")}
        } else {
            logger.info{("$str2 is not a Palindrome.")}
        }
    while (num != 0) {
        remainder = num % 10
        reversedNum = reversedNum * 10 + remainder
        num /= 10
    }

    if (originalNum == reversedNum) {
       logger.info { ("$originalNum is Palindrome.") }
    } else {
        logger.info{("$originalNum is not Palindrome.")}
    }

    }

