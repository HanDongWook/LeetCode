import kotlin.math.abs

class Solution {
    fun reverse(x: Int): Int {
        return try {
            val positive = (x > 0)
            val r = abs(x).toString().map { it.toString().toInt() }.reversed()
            var ans = ""
            for (i in r.indices) ans += r[i]
            if (positive) ans.toInt() else ans.toInt() * -1
        } catch (e: NumberFormatException) {
            0
        }
    }
}