import kotlin.math.abs

class Solution {
    fun isPalindrome(x: Int): Boolean {
        if (x < 0) return false
        val a = x.toString().map { it.toString().toInt() }
        for (i in a.indices) if (a[i] != a[a.lastIndex - i]) return false
        return true
    }
}