
class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer ,Integer> hm =  new HashMap<>();
        int prev = 0 ; 
        int ans = 0 ;
        hm.put(0,1);

        for(int i =0;i<nums.length;i++){
            prev+=nums[i];

            if(hm.containsKey(((prev%k)%k +k)%k)){
                ans+=hm.get(((prev%k)%k +k)%k);
            }
            hm.put(((prev%k)%k +k)%k, hm.getOrDefault(((prev%k)%k +k)%k , 0) +1);
        }
        return ans;
    }
}
