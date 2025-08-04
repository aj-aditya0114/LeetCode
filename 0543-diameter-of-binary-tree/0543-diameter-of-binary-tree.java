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
    int maxD = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return maxD;
    }
    public int height(TreeNode node){
        if(node == null)return 0;
        int lh = height(node.left);
        int rh = height(node.right);

         maxD = Math.max(maxD, lh + rh);

        return 1 + Math.max(lh, rh);
    }
}