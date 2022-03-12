```
class Solution {
public List<List<Integer>> generate(int numRows) {
List<List<Integer>> list = new ArrayList<List<Integer>>();
if(numRows == 0) return list;
if(numRows == 1){
List<Integer> list0 = new ArrayList<>() ;
list0.add(1);
​
list.add(list0) ;
return list ;
}
if(numRows == 2){
List<Integer> list0 = new ArrayList<>() ;
list0.add(1);
​
List<Integer> list1 = new ArrayList<>() ;
list1.add(1);
list1.add(1);
​