class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList();
        List<Integer> temp = new ArrayList();
        int n = nums.length;
        boolean[] isVisited = new boolean[n];
        helper(temp,res,nums,n,isVisited);  
        return res;      
    }

    public void helper(List temp, List res, int[] nums, int n, boolean[] isVisited){
        if(temp.size()==n){
            res.add(new ArrayList(temp));
            return;
        }

        for(int i = 0; i<n; i++){
            if(isVisited[i]){
                continue;
            }
            if(i>0 && nums[i]==nums[i-1]&&!isVisited[i-1]){
                continue;
            }
            temp.add(nums[i]);
            isVisited[i] = true;
            helper(temp,res,nums,n,isVisited);
            temp.remove(temp.size()-1);
            isVisited[i] = false;
        }
    }
}