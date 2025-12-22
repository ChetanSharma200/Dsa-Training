class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
          HashMap<Integer ,Integer> hm =  new HashMap<>();
        int prev = 0 ; 
        int ans = 0 ;
        hm.put(0,1);

        for(int i =0;i<nums.length;i++){
            prev+=(nums[i] %2==0)?0:1;
            if(hm.containsKey(prev - k)){
                ans+=hm.get(prev - k);
            }
            hm.put(prev, hm.getOrDefault(prev, 0) +1);
        }
        return ans;
    }
}

