class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> hs=new HashMap<>();
        int prefixSum=0;
        int ans=0;

        for(int i=0;i<nums.length;i++){
             prefixSum+=nums[i];
             if(prefixSum==k)ans++;

             int rem=prefixSum-k;
             if(hs.containsKey(rem)){
                ans+=hs.get(rem);
             }
             
            hs.put(prefixSum, hs.getOrDefault(prefixSum, 0)+1);
        }
        return ans;
    }
}
