class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        var k = 0
        if(nums.isEmpty()){
            return 0
        }
        else if(nums.size == 1){
            return 1
        }
        else {
            for(i in 1 until nums.size){
                if(nums[k] != nums[i])
                {                    
                    k++
                    nums[k] = nums[i]
                }
            }
            return k + 1
        }
       
    }
       
}