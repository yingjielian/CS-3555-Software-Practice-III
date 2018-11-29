class Solution {
    public boolean isPalindrome(String s) {
        
        char[] sToChar = s.toCharArray();
        StringBuilder result = new StringBuilder();
        for(char c:sToChar)
        {
            if(c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z' || c >= '0' && c <= '9')
                result.append(c);
        }
        
        return result.toString().equalsIgnoreCase(result.reverse().toString());
    }
}