package activity_01_h
import mu.KotlinLogging
private val logger =KotlinLogging.logger{}

fun main(args: Array<String>) {


    var int1: Int
    var int2: Int
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

    int1 = 1
    while (int1 <= a) {

        if (int1 == 1 || int1 == 0) {
            int1++
            continue
        }

        flag = 1
        int2 = 2
        while (int2 <= int1 / 2) {
            if (int1 % int2 == 0) {
                flag = 0
                break
            }
            ++int2
        }
        if (flag == 1) logger.info{(int1)}
        int1++
    }
    int1= 1
    while (int1 <= b) {

        if (int1 == 1 || int1 == 0) {
            int1++
            continue
        }

        flag = 1
        int2 = 2
        while (int2 <= int1 / 2) {
            if (int1 % int2 == 0) {
                flag = 0
                break
            }
            ++int2
        }
        if (flag == 1)
            logger.info{(int1)}
        int1++
    }
}
