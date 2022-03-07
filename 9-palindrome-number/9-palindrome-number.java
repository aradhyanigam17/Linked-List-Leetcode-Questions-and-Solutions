class Solution {
    public boolean isPalindrome(int x) {
        int num = x ;
        int rev = 0 ;
        while(num > 0){
            rev = rev * 10 + num % 10 ;
            num /= 10 ;
        }
        
        return rev == x ;
    }
}