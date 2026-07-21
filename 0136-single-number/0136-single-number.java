class Solution {
    public int singleNumber(int[] nums) {
    // Arrays.sort(nums);
    // for(int i=0;i<nums.length-1;i+=2){
    //     if(nums[i]!=nums[i+1]){
    //         return nums[i];
    //     }
    // } return nums[nums.length - 1];
    int sol =0;
    for(int i=0;i<nums.length;i++){
        sol = sol^nums[i];
    }return sol;
    }
}