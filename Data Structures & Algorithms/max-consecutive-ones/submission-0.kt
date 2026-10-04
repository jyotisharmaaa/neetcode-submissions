class Solution {
    fun findMaxConsecutiveOnes(nums: IntArray): Int {
        var max = 0
        var count = 0
        for(num in nums){
            if(num == 1){
                count = count+1
            }
            else {
                count = 0
            }
            if(count > max){
                max = count             
            }
           
        }
        return max
    }
}
