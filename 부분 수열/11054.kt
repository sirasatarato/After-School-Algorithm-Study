package newAlgorithm

import java.util.*

// 가장 긴 바이토닉 부분 수열

fun main() {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    val dp = Array(2) { IntArray(n + 1) }
    val cost = IntArray(n + 1)

    for (i in 1..n) {
        cost[i] = scanner.nextInt()
    }

    dp[1][n] = 1
    dp[0][1] = 1

    for (i in n - 1 downTo 1) {
        dp[1][i] = 1

        for (j in n downTo i + 1) {
            if (cost[i] > cost[j]) {
                dp[1][i] = dp[1][i].coerceAtLeast(dp[1][j] + 1)
            }
        }
    }

    for (i in 2..n) {
        dp[0][i] = 1
        for (j in 1 until i) {
            if (cost[i] > cost[j]) {
                dp[0][i] = dp[0][i].coerceAtLeast(dp[0][j] + 1)
            }
        }
    }

    for (i in 1..n) {
        dp[0][i] += dp[1][i]
    }

    var max = 0
    for (i in 1..n) {
        if (dp[0][i] > max) {
            max = dp[0][i]
        }
    }

    println(max - 1)
}