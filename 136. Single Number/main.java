class Solution {
    public int singleNumber(int[] nums) {
        int a;
        int count=0;
        for(int i=0;i<nums.length;i++){
            a = nums[i];
            for(int j=i+1;j<nums.length;j++){
                if(a == nums[j]){
                    nums[j] = 0;
                    count++;
                    break;
                }

            }
            if(count >= 1){
                count =0;
            }
            else if(count == 0 && a != 0){
                return a;
            }
        }
        return 0;
    }
}