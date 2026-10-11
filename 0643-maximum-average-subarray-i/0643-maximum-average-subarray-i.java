class Solution {
    public double findMaxAverage(int[] nums, int k) {

       int sum =0;

       for(int i =0;i<k;i++) {
        sum+=nums[i];
       }

       
       int avg = sum;
       for(int i=k;i<nums.length;i++){
        sum = sum-nums[i-k]+nums[i];
        avg = Math.max(avg,sum);
       }
    return (double) avg/k;
    }
}