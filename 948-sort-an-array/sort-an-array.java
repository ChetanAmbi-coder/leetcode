
 class Solution {
    public int[] sortArray(int[] nums) {
        mergesort(nums,0,nums.length-1);
        return nums;

        
    }
    void mergesort(int arr[], int low, int high){
        int mid = (low + high)/2;
        if(low>=high){
            return;

        }
        mergesort(arr,low,mid);
        mergesort(arr,mid+1,high);
        merge(arr,low,mid,high);
   }
    void merge( int arr[], int low, int mid, int high){
    
        int left = low;
        int right = mid+1;
        int k=0;
        int temp[]  = new int[high - low + 1];;
        while(left<=mid && right<=high){
            if(arr[left]<=arr[right]){
                temp[k++] = arr[left++];
                
                
            }
            else{
                temp[k++] = arr[right++];
                
                
            }

        }
        while(left<=mid){
            temp[k++] = arr[left++];
                

        }
        while(right<=high){
            temp[k++] = arr[right++];
                

        }
        for(int i=low; i<=high;i++){
            arr[i] = temp[i-low];
        }
    }
}

    
     

     
   
