import java.time.LocalDate
import java.time.format.DateTimeFormatter

fun main() {

    var applyingFor:String? = null
    var desiredSalary:String? = null
    var workStartDate = LocalDate.parse("2022-10-30")
    var dateFormat = DateTimeFormatter.ofPattern("mm-dd-yyyy")
    var formattedWorkStartDate = workStartDate.format(dateFormat)
    var lastName = " "
    var firstName =" "
    var middle = " "
    var address = " "
    var city = " "
    var birthdate = " "
    var state = " "
    var zip = " "
    var homePHone = " "
    var cellPhone = " "
    var emailAddress = " "
    var socialSecurityNUmber:String? = null
    var isUsCitizen:String? =null
    var hasBeenConvicted:String? = null
    var haveDrugScreenTest:String? = null
