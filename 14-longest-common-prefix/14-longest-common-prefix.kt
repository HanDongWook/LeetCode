class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {
        if (strs.size == 1) return strs.first()
        var standard = strs[0]
        for (i in 1.. strs.lastIndex) {
            val next = strs[i]
            for (j in standard.indices) {
                if (j <= next.lastIndex) {
                    if (standard[j] != next[j]) {
                        standard = standard.filterIndexed { index, _ -> index < j }
                        break
                    }
                } else {
                    standard = standard.filterIndexed { index, _ -> index < j }
                    break
                }
            }
        }
        return standard
    }
}