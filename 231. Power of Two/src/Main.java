import java.lang.Math;
class Solution {
    public boolean isPowerOfTwo(int n) {
        int i=0;
        while(true){
            if(Math.pow(2,i)==n){
                return true;
            }
            else  if(Math.pow(2,i) > n){
                break;
            }
            i++;
        }
        return false;
    }
}