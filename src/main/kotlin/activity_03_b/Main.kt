package activity_03_b
import activity_03_a.names
import mu.KotlinLogging
private val logger = KotlinLogging.logger{}
var books: ArrayList<String> = ArrayList()
fun main() {
    books.addAll(listOf("The Notebook","Pride and Prejudice","Outlander","Twilight","Beautiful Disaster","Bared to You",
        "Gone with the Wind","The Time Traveler's Wife","The Fault in Our Stars","Divergent","Persuasion","Sense and Sensibility",
        "A Walk to Remember","Dear john","Safe haven","The Longest Ride","the wish","The Choice","The Best of Me"))
    addBook("see me")
    removeBook("see me")
    countBooks()
    logger.info{ "Is The Notebook on the list? ${isBookInRecord("The Notebook")} "}

}
fun isBookInRecord(checkBookName: String): Boolean {
    return books.contains(checkBookName)
}
fun addBook(addBook: String) {
    names.add(addBook)
}
fun removeBook(removeBook: String) {
    names.remove(removeBook)
}
fun countBooks(): Int {
    return names.size
}

