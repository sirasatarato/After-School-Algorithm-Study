package newAlgorithm

import java.util.*

// 가장 긴 증가하는 부분 수열

fun main() {
    val scanner = Scanner(System.`in`)
    val n: Int = scanner.nextInt()
    val arr = IntArray(n)
    val d = IntArray(n)
    val st = StringTokenizer(scanner.nextLine())

    for (i in 0 until n) {
        arr[i] = st.nextToken().toInt()
    }

    d[0] = 1

    for (i in 1 until n) {
        d[i] = 1
        for (j in 0 until i) {
            if (arr[j] < arr[i] && d[i] <= d[j]) {
                d[i] = d[j] + 1
            }
        }
    }

    var max = 0
    for (i in d) {
        max = Math.max(max, i)
    }

    println(max)
}