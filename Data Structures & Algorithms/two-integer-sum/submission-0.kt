class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
         var intArray = IntArray(2)
         
       for(i in nums.indices){
        for(j in i+1 until nums.size){
            if(nums[i]+nums[j]==target){
            intArray[0] = i
            intArray[1] = j
            }
        }
       }
       return intArray
    } 
}
