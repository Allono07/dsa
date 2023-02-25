package dsaPractice;

class Solution5 {
    public int findDuplicate(int[] nums) {
        int duplicate =0;
        int count=0;
        for( int i=0;i<nums.length;i++){
            duplicate=nums[i];
            {
                for(int j=1+i;j<nums.length;j++){
                    if(nums[j]==duplicate){
                        return duplicate;
                    }
                }
            }
        }
        return -1;
    }
}
