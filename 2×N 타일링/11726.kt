package newAlgorithm

import java.util.*

fun main() {
    val N = Scanner(System.`in`).nextInt()
    val arr = IntArray(1001) { i -> i }

    for (i in 3..N) arr[i] = (arr[i - 1] + arr[i - 2]) % 10007
    print(arr[N])
}