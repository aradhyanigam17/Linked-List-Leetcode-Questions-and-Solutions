/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> preorder = new ArrayList<>() ;
        preorder(preorder , root);
        
        return preorder ;
    }
    
    public void preorder(List<Integer> list , TreeNode root){
        if(root == null){
            return ;
        }
        
        list.add(root.val);
        preorder(list , root.left) ;
        preorder(list , root.right) ;
    }
}