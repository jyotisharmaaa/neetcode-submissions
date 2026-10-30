class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList();
        List<Integer> temp = new ArrayList();
        int n = nums.length;
        helper(temp,res,nums,n);
        return res;        
    }
    public void helper(List temp, List res, int[] nums, int size){
        if(temp.size()>=size){
            res.add(new ArrayList(temp));
            return;
        }

        for(int i = 0; i<size; i++){
            if(temp.contains(nums[i])){
                continue;
            }
            temp.add(nums[i]);
            helper(temp,res,nums,size);
            temp.remove(temp.size()-1);
           
        }
    }
}
