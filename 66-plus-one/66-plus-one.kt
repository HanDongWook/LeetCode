class Solution {
    fun plusOne(digits: IntArray): IntArray {
        val arr = IntArray(digits.size + 1)
        for (i in 1..arr.lastIndex) arr[i] = digits[i-1]
        arr[arr.lastIndex] = arr[arr.lastIndex] + 1
        for (i in arr.lastIndex downTo 1) {
            if (arr[i] == 10) {
                arr[i] = 0
                arr[i - 1] += 1
            } else break
        }
        return if (arr[0] == 0) {
            arr.filterIndexed { index, _ -> index > 0 }.toIntArray()
        } else arr
    }
}