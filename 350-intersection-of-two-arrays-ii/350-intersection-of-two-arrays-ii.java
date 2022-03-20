class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int n = 0;
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        ArrayList<Integer> finalList = new ArrayList<>();
            for(int k:nums1){
                map.putIfAbsent(k, 0);
                map.put(k, map.get(k) + 1);
            }
            for(int k1:nums2){
                if(map.containsKey(k1)){
                    map.put(k1, map.get(k1) - 1);
                    if(map.get(k1)>-1){
                    finalList.add(k1);
                    }
                }
            }
            int[] numList = new int[finalList.size()];
            for(int k2:finalList){
                numList[n]= k2;
                n++;
            }
        return numList;
    }
}