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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode t = root;
        if(root==null) return new TreeNode(val);
        while(true){
            if(t.val<=val){
                if(t.right!=null){
                    t=t.right;
                }else{ t.right=new TreeNode(val); break;}
            }else{
                if(t.left!=null){
                    t=t.left;
                }else{ t.left=new TreeNode(val); break;}
            }

        }
        return root;
        
    }
}