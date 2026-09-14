class Solution {
    public boolean isPalindrome(String s) {
        int N = s.length();
        int L = 0, R = N - 1;

        while(L < R){
            while(L < R && !alphaNum(s.charAt(L))) L++;
            while(L < R && !alphaNum(s.charAt(R))) R--;
            if(Character.toLowerCase(s.charAt(L)) != Character.toLowerCase(s.charAt(R))) return false;
            L++;
            R--;
        }

        return true;
    }

    public boolean alphaNum(char C){
        return (C >= 'A' && C <= 'Z' || 
                C >= 'a' && C <= 'z' ||
                C >= '0' && C <= '9'
        );
    }
}
