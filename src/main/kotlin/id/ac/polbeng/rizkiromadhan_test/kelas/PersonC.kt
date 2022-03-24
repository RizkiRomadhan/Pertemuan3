package id.ac.polbeng.rizkiromadhan_test.kelas

class PersonC (var firstName: String, var lastName: String, var age: Int) {}
fun main(){
    val budi = PersonC("Rizki", "Romadhan", 20)
    println("Name : ${budi.firstName} ${budi.lastName}")
    println("Age : ${budi.age}")
}