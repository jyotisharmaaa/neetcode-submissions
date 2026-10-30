class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList();
        List<Integer> temp = new ArrayList();
        int n = nums.length;
        int index = 0;
        helper(index, temp, res, nums, n);
        return res;
    }
    public void helper(int index, List temp, List res, int[] nums, int n){
        if(index==n){
            if(!res.contains(temp)){
                res.add(new ArrayList(temp));
            }
            return;
        }
       for(int i=index; i<n; i++){
        if(i>index && nums[i]==nums[i-1]){
            continue;
        }
        helper(i+1,temp,res,nums,n);
        temp.add(nums[i]);
        helper(i+1,temp,res,nums,n);
        temp.remove(temp.size()-1);
       }
    }
}
