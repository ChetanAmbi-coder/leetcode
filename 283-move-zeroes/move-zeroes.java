class Solution {
    public void moveZeroes(int[] nums) {
        int  writeindex = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] !=0){
                nums[writeindex] = nums[i];
                writeindex++;

            }
        }
        while(writeindex < nums.length){
            nums[writeindex] = 0;
            writeindex++;
        }


        
    }
}