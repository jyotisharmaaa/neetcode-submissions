class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList();
        List<String> temp = new ArrayList();
        int start = 0;
        int size = s.length();
        helper(start,temp,res,size,s);   
        return res;     
    }
    public void helper(int start, List temp, List res, int size, String s){
        if(start==size){
            res.add(new ArrayList(temp));
            return;
        }
        for(int i=start; i<size; i++){
            String substr = s.substring(start,i+1);
            if(isPalindrome(substr)){
                temp.add(substr);
                helper(i+1,temp,res,size,s);
                temp.remove(temp.size()-1);
            }
            
        }
    }

    public boolean isPalindrome(String str){
        int left = 0;
        int right = str.length()-1;
        while(left<right){
            if(str.charAt(left)!=str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
