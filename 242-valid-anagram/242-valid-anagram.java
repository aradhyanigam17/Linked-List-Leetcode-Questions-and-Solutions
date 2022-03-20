class Solution {
    public boolean isAnagram(String s, String t) {
        
          int Char = 256;
    int[] c = new int[Char];
    if(s.length()!=t.length())
    {
        return false;
    }
    for(int i=0;i<s.length();i++)
    {
        c[s.charAt(i)]++;
        c[t.charAt(i)]--;
    }
       
    for(int i=0;i<256;i++)
    {
        if(c[i]!=0)
        {
            return false;
        }
    }
    return true;
        
        
    }
}