public class Arrays_II {

    // ---------------------------------------
    // Print all subarrays using Prefix Sum
    // ---------------------------------------
    public static void printSubarr(int numbers[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        // Prefix array: prefix[i] = sum of numbers[0] to numbers[i]
        int prefix[] = new int[numbers.length];
        prefix[0] = numbers[0];

        // Build prefix sum array
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + numbers[i];
        }

        // Generate all subarrays
        for (int start = 0; start < numbers.length; start++) {
            for (int end = start; end < numbers.length; end++) {

                // Use prefix sum formula to get subarray sum in O(1)
                currSum = (start == 0) ? prefix[end] : prefix[end] - prefix[start - 1];

                System.out.println(currSum);

                // Track maximum subarray sum
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }

        System.out.println("Max sum is: " + maxSum);
    }

    // ---------------------------------------
    // Kadane's Algorithm (O(n) max subarray sum)
    // ---------------------------------------
    public static void kadanes(int numbers[]) {
        int cs = 0; // current sum
        int ms = Integer.MIN_VALUE; // max sum

        for (int idx = 0; idx < numbers.length; idx++) {
            cs = cs + numbers[idx];

            if (cs < 0) {
                cs = 0; // reset if sum goes negative
            }

            ms = Math.max(cs, ms); // update max sum
        }

        System.out.println("Max subarray sum: " + ms);
    }

    // ---------------------------------------
    // Trapping Rainwater Problem (O(n))
    // ---------------------------------------
    public static int trappedRainwater(int height[]) {
        int n = height.length;

        // Left max array
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }

        // Right max array
        int rightMax[] = new int[n];
        rightMax[n - 1] = height[n - 1];
        for (int idx = n - 2; idx >= 0; idx--) {
            rightMax[idx] = Math.max(height[idx], rightMax[idx + 1]);
        }

        // Calculate trapped water
        int trappedWater = 0;
        for (int i = 1; i < n; i++) {
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            trappedWater += (waterLevel - height[i]);
        }

        return trappedWater;
    }

    // ---------------------------------------
    // Best Time to Buy and Sell Stock (O(n))
    // ---------------------------------------
    public static int buyAndSellStocks(int prices[]) {
        int maxProfit = 0;
        int buyPrice = Integer.MAX_VALUE; // store minimum price so far

        for (int i = 0; i < prices.length; i++) {

            // If today's price is greater than buyPrice → profit possible
            if (buyPrice < prices[i]) {
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            } else {
                // Update buy price if a lower price is found
                buyPrice = prices[i];
            }
        }

        return maxProfit;
    }

    // ---------------------------------------
    // MAIN METHOD
    // ---------------------------------------
    public static void main(String args[]) {

        int numbers[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        kadanes(numbers); // Max subarray sum

        int height[] = {4, 2, 0, 6, 3, 2, 5};
        int result = trappedRainwater(height);
        System.out.println(result); // Trapped water

        int prices[] = {7, 1, 5, 3, 6, 4};
        System.out.println(buyAndSellStocks(prices)); // Max profit
    }
}
