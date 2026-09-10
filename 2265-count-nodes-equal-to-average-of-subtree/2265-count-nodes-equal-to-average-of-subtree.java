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
     public int c ;
     public int[] count(TreeNode root) {
        if(root == null){
            return new int[]{0 , 0};
        }
         int left[] = count(root.left);
         int right[] = count(root.right);
        
         int sum = root.val + left[0] + right[0];
         int nodes = 1 + left[1] + right[1];

         if(root.val == sum/nodes){
            c ++;
         }
          return  new int[] { sum , nodes};
        
    }

    public int averageOfSubtree( TreeNode root){
         c = 0;
         count(root);
         return c;
    }
}