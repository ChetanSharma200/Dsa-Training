class Solution {
    public int findMaxLength(int[] nums) {
        // Map to store the first time a particular prefixSum occurs: <Sum, Index>
        HashMap<Integer, Integer> hs = new HashMap<>();
        
        int prefixSum = 0;
        int ans = 0;
        
        // BASE CASE: Handle subarrays that start from index 0.
        // If the balance becomes 0 at index i, the length is i - (-1) = i + 1.
        hs.put(0, -1);
        
        for (int i = 0; i < nums.length; i++) {
            // TRANSFORMATION: Treat 1 as +1 and 0 as -1.
            // If a subarray has equal 0s and 1s, the net sum will be 0.
            prefixSum += (nums[i] == 1 ? 1 : -1);
            
            if (hs.containsKey(prefixSum)) {
                // If we see the same prefixSum again, it means the sum of 
                // elements between the previous occurrence and now is 0.
                ans = Math.max(ans, i - hs.get(prefixSum));
            } else {
                // Only store the index if the sum is new. 
                // This keeps the earliest index to ensure we get the MAXIMUM length.
                hs.put(prefixSum, i);
            }
        }
        
        return ans;
    }
}
