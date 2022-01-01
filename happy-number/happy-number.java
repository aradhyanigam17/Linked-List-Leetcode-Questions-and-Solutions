class Solution {
    public int findSquare(int n){
        if(n == 0) return 0 ;
        int ans = 0 ;
        
        while( n > 0){
            int rem = n % 10 ;
            ans += rem * rem ;
            n /= 10 ;
        }
        
        return ans ;
    }
    public boolean isHappy(int n) {
        
        if( n == 0) return false ;
            
         int slow = n ;
         int fast = n ;
        
        do{
            slow = findSquare(slow);
            fast = findSquare(findSquare(fast));
        }
        while(slow != fast);
        
        if(slow == 1) return true ;
        
        return false ;
        
    }
}