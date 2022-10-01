class Solution {
    fun generate(numRows: Int): List<List<Int>> {
        val ans = mutableListOf<List<Int>>(listOf(1))
        if (numRows == 1) return ans
        ans.add(listOf(1, 1))
        if (numRows == 2) return ans
        for (i in 2 until  numRows) {
            val before = ans[i-1]
            val new = arrayListOf<Int>(1, 1)
            for (j in 0 until before.lastIndex) {
                new.add(j+1, before[j] + before[j+1])
            }
            ans.add(new)
        }
        return  ans
    }
}