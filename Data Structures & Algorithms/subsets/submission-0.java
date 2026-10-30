class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList();
        List<Integer> temp = new ArrayList();
        int n = nums.length;
        int index = 0;
        helper(index,temp,res,nums,n);
        return res;        
    }
    public void helper(int index, List temp, List res, int[] nums, int n){
        if(index==n){
            res.add(new ArrayList(temp));
            return;
        }
       
        helper(index+1,temp,res,nums,n);
        temp.add(nums[index]);
        helper(index+1,temp,res,nums,n);
        temp.remove(temp.size()-1);
    }
}
