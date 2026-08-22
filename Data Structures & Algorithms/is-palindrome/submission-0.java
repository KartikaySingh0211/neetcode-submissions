class Solution {
    public boolean isPalindrome(String s) {
        int n = s.length();
        StringBuilder newStr = new StringBuilder();
        for(char c: s.toCharArray()){
            if (Character.isLetterOrDigit(c)) {
                newStr.append(Character.toLowerCase(c));
            }
        }
        n = newStr.toString().length();

        int j = n - 1;

        for(int i = 0; i < n; i++){
            char a = newStr.toString().charAt(i);
            char b = newStr.toString().charAt(j);
            if(a != b) return false;
            j--;
        }

        return true;
    }
}
