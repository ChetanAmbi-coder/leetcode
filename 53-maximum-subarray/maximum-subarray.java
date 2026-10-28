class Solution {
    public int maxSubArray(int[] nums) {
       int maxcurent = nums[0];
       int maxglobal = nums[0];
       for(int i=1; i<nums.length; i++){
        maxcurent  = Math.max(nums[i],maxcurent +nums[i]);
        if(maxglobal<maxcurent){
            maxglobal = maxcurent;
        }
       }
        return maxglobal;
    }
   
}