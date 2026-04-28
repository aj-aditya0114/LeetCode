/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(p == root || q == root)return root;
        if(p == q)return p;

        boolean leftP = contains(root.left, p);
        boolean rightQ = contains(root.right, q);

        if(leftP && rightQ)return root;
        if(leftP && !rightQ)return lowestCommonAncestor(root.left, p, q);
        if(!leftP && rightQ)return lowestCommonAncestor(root.right, p, q);
        if(!leftP && !rightQ)return root;

        return root;
    }

    public boolean contains(TreeNode root, TreeNode n){
        if(root == null)return false;
        if(root == n)return true;
        return contains(root.left, n) || contains(root.right, n);
    } 
}