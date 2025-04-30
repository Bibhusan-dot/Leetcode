class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int j=m;
        for(int i=0;i<n;i++){
            nums1[j] = nums2[i];
            j++;
        }

        for(int i=0;i<j;i++){
            for(int k=i+1;k<j;k++){
                if(nums1[i]>nums1[k]){
                    int swap = nums1[i];
                    nums1[i] = nums1[k];
                    nums1[k] = swap;
                }
            }
        }
    }
}