import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    println("Введите сумму перевода")
    val input = scanner.nextDouble()
    val amount = (input * 100).toInt()
    val commission = (((amount * 0.0075) * 100).toInt()) / 100
    if (commission >= 3500) {
        println("Коммисия составит $commission коп.")
    } else
        println("Коммисия составит " + 3500 + "коп.")
}
