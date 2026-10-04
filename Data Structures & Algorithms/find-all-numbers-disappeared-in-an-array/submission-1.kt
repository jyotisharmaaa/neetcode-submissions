class Solution {
    fun findDisappearedNumbers(nums: IntArray): List<Int> {
        val size = nums.size
        var i = 0
        val list = mutableListOf<Int>()
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
                list.add(j+1)
            }
        }
    return list
    }
}
