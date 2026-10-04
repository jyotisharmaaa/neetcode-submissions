class Solution {
    fun findDuplicate(nums: IntArray): Int {
        val size = nums.size
        var i = 0
        while(i<size-1){
            val correctIndex = nums[i]-1
            if(nums[i]!=nums[correctIndex]){
                val temp = nums[i]
                nums[i] = nums[correctIndex]
                nums[correctIndex] = temp
            }
            else{
                i++
            }
        }
        for(j in 0 until size){
            if(nums[j]!=j+1){
                return nums[j]
            }
        }
        return -1
    }
}
