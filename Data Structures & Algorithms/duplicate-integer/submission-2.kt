class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        var k = false
        nums.sort()
        for(i in 0 until nums.size-1){
            if(nums[i] == nums[i+1]){
               k = true
               break
            }
            else
            {
                k = false
            }
        }
        return k
    }
}
