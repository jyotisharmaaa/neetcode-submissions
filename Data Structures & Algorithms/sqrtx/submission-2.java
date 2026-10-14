class Solution {
    public int mySqrt(int x) {
        int ans = 1;
        int low = 1;
        int high = x;
        if(x ==1 || x==0){
            return x;
        }
        while(low<=high){
            int mid = (low+high)/2;
            if(mid <= x/mid){
                ans = mid;
                low = mid+1;
            }
            else{
               high = mid-1;
            }
        }
        return ans;
    }
}