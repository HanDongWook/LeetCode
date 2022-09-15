class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        if(s.isEmpty()) return 0
        
        var max = 1
        for (i in 0..s.lastIndex) {
            var char = charArrayOf(s[i])
            var ans = 1
            for (j in i..s.lastIndex) {
                if (i == j) continue
                if (!char.contains(s[j])) {
                    char += s[j]
                    ans += 1
                    if (max < ans) max = ans
                } else {
                    if (max < ans) max = ans
                    break
                }
            }
        }
        return max
    }
}