class Solution {
    fun findErrorNums(nums: IntArray): IntArray {
        val size = nums.size
        var i = 0
        val arr = IntArray(2)
        while(i<size){
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
                arr[0] = nums[j]
                arr[1] = j+1
            }
        }
    return arr
        
    }
}