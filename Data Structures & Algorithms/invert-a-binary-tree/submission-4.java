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
     public TreeNode invertTree(TreeNode root) {
        if(root == null){
            return null;
        }
       Queue<TreeNode> q1 = new LinkedList<>();
       q1.add(root);
       while(!q1.isEmpty()){
        int n = q1.size();
        for(int i=0;i<n;i++){
            TreeNode current = q1.poll();
            TreeNode temp = current.right;
            current.right = current.left;
            current.left = temp;
            if(current.right != null){
                q1.add(current.right);
            }
            if(current.left != null){
                q1.add(current.left);
            }
        }
       }
       return root;
    }
}
