class Solution {
    public int shipWithinDays(int[] weights, int days) {
       
        int bestCase = 0;
        int worstCase = 0;
        int max = weights[0];
        for(int i = 0; i<weights.length;i++){
            if(max<weights[i]){
                max = weights[i];
            }
            worstCase = worstCase + weights[i];
        }
        bestCase = max;
        int low = bestCase;
        int high = worstCase; 
        int ans = high;
        while(low<=high){
            int mid = low+(high-low)/2; 
            int calDays = 1;
            int currentLoad = 0;
            for(int j =0;j<weights.length;j++){
                 if(currentLoad+weights[j]<=mid){
                    currentLoad = currentLoad+weights[j];
                 }
                 else{
                    calDays++;
                    currentLoad = weights[j];
                 }
            }
            if(calDays<=days){
                ans = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
         }
        return ans;        
    }
}