package newAlgorithm

import java.util.*

// 가장 큰 증가 부분 수열

fun main() {
    val scanner = Scanner(System.`in`)

    val n: Int = scanner.nextInt()
    val dp = IntArray(n + 1)
    val cost = IntArray(n + 1)

    for (i in 1..n) {
        cost[i] = scanner.nextInt()
    }

    dp[1] = cost[1]

    for (i in 2..n) {
        dp[i] = cost[i]

        for (j in 1 until i) {
            if (cost[i] > cost[j]) {
                dp[i] = (dp[j] + cost[i]).coerceAtLeast(dp[i])
            }
        }
    }

    var max = Int.MIN_VALUE
    for (i in 1..n) {
        if (dp[i] > max) {
            max = dp[i]
        }
    }
    println(max)
}