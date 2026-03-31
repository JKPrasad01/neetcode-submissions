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
    int max=0;
    public int diameterOfBinaryTree(TreeNode root) {
        
        diameter(root);
        return max-1;
    }

    private int diameter(TreeNode node){

        if(node==null){
            return 0;
        }

        int left= diameter(node.left);
        int right=diameter(node.right);

        int value=left+right+1;

        max=Math.max(value,max);

        return Math.max(left,right)+1;
    }

}
