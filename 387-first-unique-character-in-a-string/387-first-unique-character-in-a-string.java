class Solution {
    public int firstUniqChar(String s) {
        Map<Character, List<Integer>> map = new LinkedHashMap<>();
        
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                map.get(s.charAt(i)).add(i);
            } else {
                List<Integer> list = new ArrayList<>(Arrays.asList(i));
                map.put(s.charAt(i), list);
            }
        }
        for (char c: map.keySet()) {
            if (map.get(c).size() == 1) {
                return map.get(c).get(0);
            }
        }
        
        return -1;
    }
}