class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) return false
        val lowerCaseSize = 'z' - 'a' + 1
        val a = IntArray(lowerCaseSize)
        val b = IntArray(lowerCaseSize)
        for (i in s) a[i - 'a'] += 1
        for (i in t) b[i - 'a'] += 1
        for (i in a.indices) {
            if (a[i] != b[i]) {
                return false
            }
        }
        return true
    }
}