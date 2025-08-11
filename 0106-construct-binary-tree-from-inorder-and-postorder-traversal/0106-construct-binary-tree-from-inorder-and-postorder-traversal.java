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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if(inorder == null || postorder == null || inorder.length != postorder.length)return null;

        Map<Integer, Integer>map = new HashMap<>();
        for(int i = 0; i < inorder.length; i++){
            map.put(inorder[i], i);
        }

        return build(inorder, 0, inorder.length-1, postorder, 0, postorder.length-1, map);
    }

    public TreeNode build(int[] inorder, int is, int ie, int[] postorder, int ps, int pe, Map<Integer, Integer>map){
        if(ps > pe || is > ie) return null;
        TreeNode root = new TreeNode(postorder[pe]);

        int inRoot = map.get(root.val);
        int numsL = inRoot - is;

        root.left = build(inorder, is, inRoot - 1, postorder, ps, ps + numsL - 1, map);
        root.right = build(inorder, inRoot + 1, ie, postorder, ps + numsL, pe - 1, map);

        return root;
    }
}