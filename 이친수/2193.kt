package newAlgorithm

import java.util.*

// 이친수

fun main() {
    val scanner = Scanner(System.`in`)
    val N = scanner.nextInt()
    val d = Array(N + 1) { LongArray(2) }
    d[1][0] = 1
    d[1][1] = 1
    if (N != 1) d[2][0] = 2

    for (i in 3..N) {
        d[i][0] = d[i - 1][0] + d[i - 1][1]
        d[i][1] = d[i - 2][0] + d[i - 2][1]
    }

    println((d[N][0] + d[N][1]) / 2)
}