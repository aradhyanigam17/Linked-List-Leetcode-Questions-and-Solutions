class Solution {
    public boolean isValid(String s) {
        if(s.length() % 2 != 0) return false ;
        Stack<Character> stack = new Stack<>();
        
        for(int i = 0 ; i < s.length() ;i++){
            
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                stack.push(s.charAt(i));
            }
            
            if(s.charAt(i) == ')'){
               if(stack.isEmpty()) return false ;
               if(stack.pop() != '(') return false ;
            }
            
            if(s.charAt(i) == '}'){
                if(stack.isEmpty()) return false ;
                if(stack.pop() != '{') return false ;
            }
            
            if(s.charAt(i) == ']'){
                if(stack.isEmpty()) return false ;
                if(stack.pop() != '[') return false ;
            }
            
        }
        if(stack.size() > 0) return false ;
        return true;
    }
}