class Solution {
    public boolean isPalindrome(String s,int start,int end){
        int low=start;
        int high=end;
        while(low<high){
            if(s.charAt(low)!=s.charAt(high))
            return false;

            low++;
            high--;
        }
        return true;
    }
    public String longestPalindrome(String s) {
        String length="";
       for(int i=0;i<s.length();i++){
        for (int j=i;j<s.length();j++){
            if(isPalindrome(s,i,j)&& j - i + 1 > length.length()){
                length=s.substring(i,j+1);
            }
        }
       }
       return length;
    }
}