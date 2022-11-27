package activity_01_j
import mu.KotlinLogging
private val logger =KotlinLogging.logger{}

fun main(args: Array<String>) {
    var hashMap: HashMap<String, Double> = HashMap<String, Double>()
    var result: Double = 0.00
    hashMap.put("Bread", 60.00)
    hashMap.put("Milk", 70.00)
    hashMap.put("Canned goods", 80.00)
    hashMap.put("Meat and Seafood",150.00)
    hashMap.put("Pasta",90.00)
    for (key in hashMap.keys) {
        var number : Double? =hashMap.get(key)
        result = result + number!!
    }
    print("$result")
}
