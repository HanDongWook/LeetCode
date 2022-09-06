class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val answer = IntArray(2)
        for(i in nums.indices) for(j in nums.indices) {
            if(i != j) {
                val num = nums[i] + nums[j]
                if(num == target) {
                    answer[0] = i
                    answer[1] = j
                    break
                }
            }
        }
        return answer
    }
}