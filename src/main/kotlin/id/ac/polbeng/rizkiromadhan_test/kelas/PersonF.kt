package id.ac.polbeng.rizkiromadhan_test.kelas

class PersonF (val firstName: String, val lastName: String) {
    init {
        println("Sedang inisialisasi BRO!")
    }
    constructor(_firstName: String, _lastName: String, _age:Int): this(_firstName, _lastName){
        println("Name : $_firstName $_lastName")
        println("Age : $_age")
        println()
    }
    constructor(_firstName: String, _lastName:String, _country:String): this(_firstName, _lastName){
        println("Name : $_firstName $_lastName")
        println("Country : $_country")
        println()
    }
    constructor(_firstName: String, _lastName:String, _age:Int, _country:String): this(_firstName,
        _lastName, _age){
        println("Name : $_firstName $_lastName")
        println("Age : $_age")
        println("Country : $_country")
    }
}
fun main(){
    val kekek = PersonF("Rizki", "Romadhan")
    val diki = PersonF("Dicky", "Fahrowi", 20)
    val randa = PersonF("Randa", "Kurnialis", "Indonesia")
    val lia = PersonF("Ziana", "Aulia", 19, "Indonesia")
}