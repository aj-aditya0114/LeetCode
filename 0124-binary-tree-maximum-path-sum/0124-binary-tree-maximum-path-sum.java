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
    int maxSum = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        height(root);
        return maxSum;
    }
    public int height(TreeNode node){
        if(node == null)return 0;

        int lh = Math.max(0, height(node.left));
        int rh =  Math.max(0, height(node.right));

        int currentSum = node.val + lh + rh;

        maxSum = Math.max(maxSum, currentSum);

        return node.val + Math.max(lh, rh);
    }
}