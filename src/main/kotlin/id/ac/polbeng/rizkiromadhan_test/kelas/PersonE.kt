package id.ac.polbeng.rizkiromadhan_test.kelas

class PersonE {
    var firstName: String
    var lastName: String
    var age: Int = 20
    constructor(_firstName: String, _lastName: String){
        firstName = _firstName
        lastName = _lastName
    }
    constructor(_firstName: String, _lastName: String, _age: Int): this(_firstName, _lastName){
        age = _age
    }
    fun cetakInfo(){
        println("Name : ${firstName} ${lastName}")
        println("Age : ${age}")
    }
}
fun main(){
    val kekek = PersonE("Rizki", "Romadhan")
    kekek.cetakInfo()
    println()
    val diki = PersonE("Dicky", "Fahrowi", 20)
    diki.cetakInfo()
}