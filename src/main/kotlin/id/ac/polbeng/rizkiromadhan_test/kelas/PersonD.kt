package id.ac.polbeng.rizkiromadhan_test.kelas

class PersonD {
    var firstName: String
    var lastName: String
    var age: Int
    constructor(_firstName: String, _lastName: String, _age: Int){
        firstName = _firstName
        lastName = _lastName
        age = _age
    }
}
fun main(){
    val budi = PersonD("Rizki", "Romadhan", 20)
    println("Name : ${budi.firstName} ${budi.lastName}")
    println("Age : ${budi.age}")
}