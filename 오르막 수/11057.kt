package newAlgorithm

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val N = scanner.nextInt()
    val D = Array(N + 1) { IntArray(10) }

    for (i in 0..9) {
        D[1][i] = 1
    }

    for (i in 2..N) {
        for (j in 0..9) {
            for (k in j..9) {
                D[i][j] += D[i - 1][k] % 10007
            }
        }
    }

    var sum = 0
    for (i in 0..9) {
        sum += D[N][i]
        sum %= 10007
    }

    println(sum)
}