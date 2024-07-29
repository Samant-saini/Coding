class Solution {
    public int maxSubArray(int[] nums) {
        int msf=Integer.MIN_VALUE;
        int mef=0;
        for(int i=0;i<nums.length;i++){
            mef=nums[i]+mef;
            if(mef<nums[i]){
                mef=nums[i];
            }
            if(msf<mef){
                msf=mef;
            }
        }
        return msf;
    }
}