public class Arrays_II{

    // Print all subarrays (correct version)
    public static void printSubarr(int numbers[]) {
        int currSum =0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];
        prefix[0]=numbers[0];
        for(int i =1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+numbers[i];
        }
        for (int start = 0; start < numbers.length; start++) {
            for (int end = start; end < numbers.length; end++) {
                currSum=0;
                // Print subarray from start → end (inclusive)
                    currSum = start==0?prefix[end]:prefix[end]-prefix[start-1];
            
                System.out.println(currSum);
                if(maxSum<currSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Max sum is:"+maxSum);
    }

    public static void kadanes(int numbers[]){
        int cs =0;
        int ms = Integer.MIN_VALUE;

        for (int idx = 0; idx < numbers.length; idx++) {
            cs = cs+numbers[idx];
            if(cs<0){
                cs=0;
            }
            ms = Math.max(cs, ms);
        }
        System.out.println("Max subarray sum:"+ms);
    }

    public static int trappedRainwater(int height[]){
        int n = height.length;
        int leftMax[]= new int [n];
        leftMax[0]=height[0];
        for (int i = 1;i < n; i++) { 
             leftMax[i]=Math.max(height[i],leftMax[i-1]);         
        }

        int rightMax [] = new int [n];
        rightMax[n-1]=height[n-1];
        for (int idx = n-2; idx >=0 ; idx--) {
            rightMax[idx]=Math.max(height[idx],rightMax[idx+1]);
        }

        int trappedWater =0 ;
        for (int i = 1; i < n; i++){
              int waterLevel = Math.min(leftMax[i], rightMax[i]);
              trappedWater =trappedWater +(waterLevel-height[i]);
        }
        return trappedWater;   
        }

    public static int buyAndSellStocks(int prices[]){
        int maxprofit =0;
        int buyPrice = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            if(buyPrice<prices[i]){
                int profit = prices[i]-buyPrice;
                maxprofit=Math.max(maxprofit, profit);
            }
            else{
                buyPrice=prices[i];
            }   
        }
        return maxprofit;
    }
    
    
    public static void main(String args[]){
            int numbers[]={-2,-3,4,-1,-2,1,5,-3};
            kadanes(numbers);
            int height[]={4,2,0,6,3,2,5};
            int result = trappedRainwater(height);
            System.out.println(result);
            int prices[]={7,1,5,3,6,4};
            System.out.println(buyAndSellStocks(prices));

    }
}