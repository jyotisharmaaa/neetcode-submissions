class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = mutableMapOf<Int,Int>()
        val ans = IntArray(2)
        for(i in 0 until nums.size){
            if(map.contains(target - nums[i])){
                ans[1] = i
                ans[0] = map.get(target - nums[i]) ?: -1
                return ans
            }
           map.put(nums[i],i)
        }
        return ans
    }
}