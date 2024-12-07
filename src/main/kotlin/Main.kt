/*Дано целое число x, вернуть, true если x это палиндром, и false в противном случае. Нельзя преобразовывать число в строку*/

import kotlin.system.measureTimeMillis
fun isPalindrome(x: Int): Boolean {
    if (x < 0) return false

    var reversed = 0
    var original = x

    while (original > 0) {
        val lastDigit = original % 10
        reversed = reversed * 10 + lastDigit
        original /= 10
    }

    return x == reversed
}

fun main() {
    print("| Число x: ")
    val x = readLine()?.toInt() ?: return

    testIsPalindrome(x)
}

fun testIsPalindrome(x: Int) {
    val startTime = System.currentTimeMillis()
    val result = isPalindrome(x)
    val endTime = System.currentTimeMillis()
    val time = endTime - startTime
    println("Вывод: $result, Время: $time мс")

    val explanation = if (result) {
        "это палиндром"
    } else {
        "это не палиндром"
    }

    println("Пояснение: $explanation")
}