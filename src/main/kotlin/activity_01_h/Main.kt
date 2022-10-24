package activity_01_h
import mu.KotlinLogging
private val logger =KotlinLogging.logger{}

fun main(args: Array<String>) {


    var i: Int
    var j: Int
    var flag: Int

    logger.info{("Enter first number: ")}
    var a = readln().toInt()

    logger.info{("Enter 2nd number: ")}
    var b = readln().toInt()
    if (a > b)
    { logger.info {"$a"}
    }
    else{
        logger.info{  "$b"}
    }

    i = 1
    while (i <= a) {

        if (i == 1 || i == 0) {
            i++
            continue
        }

        flag = 1
        j = 2
        while (j <= i / 2) {
            if (i % j == 0) {
                flag = 0
                break
            }
            ++j
        }
        if (flag == 1) logger.info{(i)}
        i++
    }
    i = 1
    while (i <= b) {

        if (i == 1 || i == 0) {
            i++
            continue
        }

        flag = 1
        j = 2
        while (j <= i / 2) {
            if (i % j == 0) {
                flag = 0
                break
            }
            ++j
        }
        if (flag == 1)
            logger.info{(i)}
        i++
    }
}
