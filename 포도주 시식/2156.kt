package newAlgorithm

import java.util.*
import kotlin.math.*

// 포도주 시식

fun main() {
    val s = Scanner(System.`in`)
    val num = s.nextInt()
    val price = IntArray(num)
    val debt = Array(num + 1) { IntArray(3) }
    for (i in price.indices) price[i] = s.nextInt()

    debt[1][1] = price[0]

    for (i in 2..num) {
        debt[i][0] = max(max(debt[i - 1][0], debt[i - 1][1]), debt[i - 1][2])
        debt[i][1] = debt[i - 1][0] + price[i - 1]
        debt[i][2] = debt[i - 1][1] + price[i - 1]
    }

    println(max(max(debt[num][0], debt[num][1]), debt[num][2]))
}