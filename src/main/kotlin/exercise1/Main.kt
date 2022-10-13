package exercise1

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



    println("Last name:$lastName")
    println("First name:$firstName")
    println("middle: $middle")
    println("Address: $address")
    println("City: $city")
    println("Birthdate: $birthdate")
    println("State: $state")
    println("Zip: $zip")
    println("Home phone: $homePHone")
    println("Cellphone: $cellPhone")
    println("Email address: $emailAddress")
    println("Social security number: $socialSecurityNUmber")
    println("Are you a U.S citizen? $isUsCitizen")
    println("Have you ever been convicted of a felony? $hasBeenConvicted")
    println("If selected for employment are you willing to submit pre-employment drug screening test? $haveDrugScreenTest")



}