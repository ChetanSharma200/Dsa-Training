class Solution {
    public int pivotIndex(int[] nums) {
        int sum =0;
        for(int i:nums){
            sum+=i;
        }
        int left = 0;
        int idx =-1;
        for(int i =0;i < nums.length ;i++){
           sum-=nums[i];
           if(left == sum){
            idx = i;
            break;
           }
           left+=nums[i];
        }
        return idx;
    }
}
