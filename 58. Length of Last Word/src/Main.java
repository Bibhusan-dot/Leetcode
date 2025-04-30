class Solution {
    public int lengthOfLastWord(String s) {
        int count=0,l=s.length()-1;

        while(true){
            if(s.charAt(l)!=' '){
                ++count;
                if(l != 0 ){
                    if(s.charAt(l-1)==' '){
                        break;
                    }
                }else{
                    break;
                }
            }
            l--;
        }
        return count;
    }
}