class Solution {
    fun getConcatenation(nums: IntArray): IntArray {
       val sizeOfnums = nums.size
       var ans = IntArray(2*sizeOfnums)
        for(i in 0 until sizeOfnums){
            if(i<sizeOfnums){
                ans[i] = nums[i]
            }
            if(i<sizeOfnums){
                ans[i+sizeOfnums] = nums[i]
            }
           
        }
        return ans

    }
}