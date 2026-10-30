class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList();
        List<Integer> temp = new ArrayList();
        int n = nums.length;
        int start = 0;
        helper(start,temp,res,nums,n,target);
        return res;
    }

    public void helper(int start, List temp, List res,int[] nums, int n,int rem){
        if(rem==0){
            res.add(new ArrayList(temp));
            return;
        }
        if(rem<0){
            return;
        }

        for(int i = start; i<n; i++){
            temp.add(nums[i]);
            helper(i,temp,res,nums,n,rem-nums[i]);
            temp.remove(temp.size()-1);
        }

    }
}
