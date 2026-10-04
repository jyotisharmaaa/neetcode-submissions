class Solution {
    fun maxProfit(prices: IntArray): Int {
        var maxProfit = 0
        var buyIndex = 0
        for(i in 1 until prices.size){
            if(prices[buyIndex]<prices[i]){
                if(maxProfit < (prices[i]-prices[buyIndex])){
                    maxProfit = (prices[i]-prices[buyIndex])
                }
            }
            else {
                buyIndex = i
            }
        }
        return maxProfit

    }
}
