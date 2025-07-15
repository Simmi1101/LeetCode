class Solution {
    public void reverse(int[] nums,int low,int high){
            while(low<=high){
                int temp=nums[low];
                nums[low]=nums[high];
                nums[high]=temp;
                low++;
                high--;
            }
    }
    public void nextPermutation(int[] nums) {
        int index=-1;
        int smallest=Integer.MAX_VALUE;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                index=i;
                break;
            }
        }
        if(index==-1){
          reverse(nums,0,nums.length-1);
        }else{
            //finding smallest
           for(int i=nums.length-1;i>index;i--){
            int pos=0;
            if(nums[i]>nums[index]){
                int temp=nums[i];
            nums[i]=nums[index];
            nums[index]=temp;
                break;
            }
           }
           reverse(nums,index+1,nums.length-1);
        }
    }
}