class Solution {
    public void moveZeroes(int[] nums) {
       
    int num_of_zeros = 0 ;
    for(int i= 0 ;i<nums.length ;i++){
        if(nums[i]==0){
            num_of_zeros++;
        }else if(num_of_zeros >0){
            int temp = nums[i];
            nums[i] = 0 ;
          //Subtracting the index number from number of zeros is genius!
            nums[i-num_of_zeros] = temp;
        }
    }


    }
}
