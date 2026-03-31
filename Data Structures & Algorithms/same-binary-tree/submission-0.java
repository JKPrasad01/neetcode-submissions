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
    public boolean isSameTree(TreeNode p, TreeNode q) {

        if(p==null && q==null)return true;

        if(p==null || q==null )return false;


        Queue<TreeNode> q1=new LinkedList<TreeNode>();
        Queue<TreeNode> q2=new LinkedList<TreeNode>();

        q1.offer(p);
        q2.offer(q);


        while(!q1.isEmpty() && !q2.isEmpty()){


            TreeNode c1=q1.poll();
            TreeNode c2=q2.poll();

            if(c1.val!=c2.val)return false;

            if(c1.left!=null && c2.left!=null){
                q1.offer(c1.left);
                q2.offer(c2.left);
            }
            else if(c1.left!=null || c2.left!=null){
                return false;
            }
            if(c1.right!=null && c2.right!=null){
                q1.offer(c1.right);
                q2.offer(c2.right);
            }
            else if(c1.right!=null || c2.right!=null){
                return false;
            }
        }
        
        return q1.isEmpty() && q2.isEmpty();
    }
}
