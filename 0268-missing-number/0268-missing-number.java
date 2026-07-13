class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for(int i=0;i<=n;i++){
            sum += i;
        }
        int arraySum=0;
        for(int i=0;i<n;i++){
            arraySum += nums[i];
        }return sum-arraySum;
    }
}