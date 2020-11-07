package newAlgorithm

import java.util.*
import kotlin.math.*

// 스티커

fun main() {
    val s = Scanner(System.`in`)
    val count = IntArray(s.nextInt())

    repeat(count.size) {
        val num = s.nextInt()
        val price = Array(2) { IntArray(num) }
        val debt = Array(num + 1) { IntArray(3) }

        price.forEach { p -> repeat(p.count()) { k -> p[k] = s.nextInt() } }

        debt[1][1] = price[0][0]
        debt[1][2] = price[1][0]

        for (i in 1 until num) {
            debt[i + 1][0] = max(max(debt[i][0], debt[i][1]), debt[i][2])
            debt[i + 1][1] = max(debt[i][0], debt[i][2]) + price[0][i]
            debt[i + 1][2] = max(debt[i][0], debt[i][1]) + price[1][i]
        }

        count[it] = max(max(debt[num][0], debt[num][1]), debt[num][2])
    }

    count.forEach { println(it) }
}