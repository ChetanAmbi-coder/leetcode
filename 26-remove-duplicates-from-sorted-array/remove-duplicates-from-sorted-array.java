class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0){
            return 0;
        }

        int  left = 0;
        int scanner;
        for( scanner = 1; scanner<nums.length; scanner++){
            if(nums[scanner] != nums[left]){
                left++;
                nums[left] = nums[scanner];

            }
            
       

        }
         return left +1;
    }
        
}