package activity_03_a
import mu.KotlinLogging
private val logger = KotlinLogging.logger{}
var names: ArrayList<String> = ArrayList()
fun main() {
    names.addAll(listOf("Matt", "Marco", "Alek", "Alfonzo", "Joaquin","Jc","Ej", "Rafaella","Patrick"
        ,"Hamza","Eugene","Molly","Sarah","Isiah","Luka", "Lebron","Kobe","Mj","Larry","Paul"))
    addStudent("carmelo")
    removeStudent("carmelo")
    countStudent()

    logger.info {"Count of Students: ${countStudent()}"}
    logger.info { "Is Matt in the list? ${isStudentInRecord("carmelo")}" }
    logger.info{"${searchStudentWildSearch("Al")}"}
    logger.info{"${searchStudent("Matt")}"}
    logger.info{"${showStudents()}"}
}
fun isStudentInRecord(checkName: String): Boolean{
    return names.contains(checkName)
}
fun addStudent(addName: String) {
    names.add(addName)
}
fun removeStudent(removeName: String){
    names.remove(removeName)
}
fun countStudent(): Int{
  return names.size

}
fun searchStudentWildSearch(searchStudent:String): ArrayList<String> {
    var result: ArrayList<String> = ArrayList()
for (name in names){
    if (name.contains(searchStudent)){
      result.add(name)
    }
}
    return result
}
fun searchStudent(searchStudent:String): ArrayList<String> {
    var result: ArrayList<String> = ArrayList()
    for (name in names) {
        if (name.equals(searchStudent)) {
            result.add(name)
        }
    }
    return result
}

fun showStudents(): ArrayList<String>{
return names
}
