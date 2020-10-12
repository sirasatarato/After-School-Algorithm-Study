package newAlgorithm

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val N = scanner.nextInt()
    val D = Array(N + 1) { IntArray(10) }

    for (i in 1..9) {
        D[1][i] = 1
    }

    for (i in 2..N) {
        D[i][0] = D[i - 1][1]

        for (j in 1..8) {
            D[i][j] = (D[i - 1][j - 1] + D[i - 1][j + 1]) % 1000000000
        }

        D[i][9] = D[i - 1][8]
    }

    var sum = 0
    for (i in 0..9) {
        sum += D[N][i]
        sum %= 1000000000
    }

    println(sum)
}