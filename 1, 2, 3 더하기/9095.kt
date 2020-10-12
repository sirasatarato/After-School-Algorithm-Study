package newAlgorithm

import java.util.*
import kotlin.math.pow

fun main() {
    val scanner = Scanner(System.`in`)
    val case = scanner.nextInt()
    val cases = IntArray(case) { (it) }
    var maxOfNum = 0

    for (i in cases.indices) {
        cases[i] = scanner.nextInt()
        maxOfNum = max(maxOfNum, cases[i])
    }

    val numbers = Array(maxOfNum) { (2.0.pow(it).toInt()) }
    for (i in 3 until numbers.size) numbers[i] = numbers[i - 1] + numbers[i - 2] + numbers[i - 3]
    for (i in cases) println(numbers[i - 1])
}

fun max(a: Int, b: Int): Int {
    return if (a >= b) a else b
}