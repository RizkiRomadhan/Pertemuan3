package id.ac.polbeng.rizkiromadhan_test.kelas

fun main() {
    val greeter = Greeter()
    greeter.greet()
    greeter.text = "Hi"
    greeter.greet("Rizki")
    greeter.greet("Romadhan")
    greeter.text = "Hello programmer"
    println(greeter.with_ret_val("Kekek"))
}