package newAlgorithm

import java.util.*

// 가장 긴 감소하는 부분 수열

fun main() {
    val scanner = Scanner(System.`in`)
    val n: Int = scanner.nextInt()
    val arr = IntArray(n + 1)
    val d = IntArray(n + 1)

    for (i in 1..n) arr[i] = scanner.nextInt()

    d[1] = 1

    for (i in 2..n) {
        d[i] = 1

        for (j in 0 until i) {
            if (arr[i] < arr[j] && d[i] <= d[j]) {
                d[i] = d[j] + 1
            } else if (arr[i] == arr[j]) {
                d[i] = d[j]
            }
        }
    }

    var max = 0
    for (i in 1..n) {
        max = d[i].coerceAtLeast(max)
    }

    println(max)
    scanner.close()
}