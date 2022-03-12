class Solution {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> list = new ArrayList<List<Integer>>();
        
        
        List<Integer> account = new ArrayList<>() ;
        
        for(int i = 0 ; i  < numRows ; i++){
            List<Integer> innerlist = new ArrayList<>() ;
            
            for(int j = 0 ; j <= i ; j++){
                if(j == 0 || j == i){
                    innerlist.add(1);
                }
                else{
                    innerlist.add(account.get(j - 1) + account.get(j)) ;
                }
            }
            
            account = innerlist;
            
            list.add(innerlist) ;
        }
        
        return list ;
    }
}