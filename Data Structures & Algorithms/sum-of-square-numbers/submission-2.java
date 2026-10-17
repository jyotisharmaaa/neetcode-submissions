class Solution {
    public boolean judgeSquareSum(int c) {
        for(long a = 0;a*a<=c;a++){
            long target = c-a*a;
            long low = 0;
            long high = (long)Math.sqrt(c);
            while(low<=high){
                long mid = (low+high)/2;
                if(mid*mid==target){
                    return true;
                }
                else if(mid*mid<target){
                    low = mid+1;
                }
                else{
                    high = mid-1;
                }
            }
           
        }
     return false;
    }
}
