class Solution {
    public String addBinary(String a, String b) {
        int i = a.length() - 1, j = b.length() - 1, sum = 0, carry = 0;
        
        StringBuilder result = new StringBuilder();
        while(i >= 0 || j >= 0 || carry != 0)
        {
            sum = carry;
            if(i > -1) 
            {
                sum = sum + a.charAt(i) - '0';
                i--;
            }
            
            if(j > -1) 
            {
                sum = sum + b.charAt(j) - '0';
                j--;
            }
            
            result.insert(0, sum % 2 + "");
            carry = sum / 2;
        }
        
        return result.toString();
    }
}