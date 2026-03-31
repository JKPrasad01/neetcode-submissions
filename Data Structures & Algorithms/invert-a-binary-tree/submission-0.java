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


        Queue<TreeNode> q=new LinkedList<>();

        if (root==null)return null;

        q.offer(root);

        while (!q.isEmpty()){

            int size=q.size();

            for (int i=0;i<size;i++){

                TreeNode cur=q.poll();

                TreeNode temp=cur.left;
                cur.left=cur.right;
                cur.right=temp;

                if(cur.right!=null)q.offer(cur.right);
                if(cur.left!=null)q.offer(cur.left);
            }

        }
        return root;
    }
}
