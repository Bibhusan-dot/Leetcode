class Solution {
    public int addDigits(int num) {
        int rem;
        int sum=0;
        int count=0;
        while(num >= 10){
            while(num != 0){
                rem = num % 10;
                num = num / 10;
                sum += rem;
            }
            num = sum;
            sum = 0;
        }
        return num;
    }
}