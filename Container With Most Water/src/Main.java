class Solution {
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length-1;
        int maxVal = 0;

        while(l<r){
            if(height[l]<height[r]){
                int ans = height[l]*(r+1-(l+1));
                if(ans>maxVal){
                    maxVal = ans;
                }
                l++;
            }
            else if(height[l]>height[r]){
                int ans = height[r]*(r+1-(l+1));
                if(ans>maxVal){
                    maxVal = ans;
                }
                r--;
            }
            else if(height[l]==height[r]){
                int ans = height[r]*(r+1-(l+1));
                if(ans>maxVal){
                    maxVal = ans;
                }
                r--;
            }
            else{
                r--;
            }
        }
        return maxVal;
    }
}