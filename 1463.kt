package newAlgorithm

import java.util.*
import kotlin.math.min

fun main() {
    println(find())
}

fun find(): Int {
    val X = Scanner(System.`in`).nextInt()
    val D = IntArray(1000001)
    D[0] = 1

    if (X < 1) return 0

    for (i in 2..X) {
        D[i] = D[i - 1] + 1
        if (i % 2 == 0) D[i] = min(D[i], D[i / 2] + 1)
        if (i % 2 == 0) D[i] = min(D[i], D[i / 3] + 1)
    }

    return D[X]
}