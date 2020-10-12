package newAlgorithm

import java.lang.Integer.max
import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val N = scanner.nextInt()
    val cost = IntArray(N + 1)
    val D = IntArray(N + 1)

    for (i in 1..N) cost[i] = scanner.nextInt()
    for (i in 1..N) {
        for (j in 1..i) D[i] = max(D[i], D[i - j] + cost[j])
    }

    println(D[N])
}