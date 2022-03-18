class Solution {
    public String removeDuplicateLetters(String s) {
    
         String ans="";
        int i=0;
        Stack<Character> st= new Stack<>();
            while(i<s.length()){
               char ch=s.charAt(i);
               String str=s.substring(i+1);
            if(st.search(ch)==-1){
                if(!st.empty()&&st.peek()-'a'>ch-'a'&&str.indexOf(st.peek())!=-1){
                    st.pop();
                    continue;
                }else{
                    st.push(ch);
                    i++;
                    continue;
                }

            }
            i++;
        }
        
        char anb[]=new char[st.size()];
        int a=anb.length-1;
        while(a>=0) anb[a--]=st.pop();
        
        return new String(anb);
    }
}