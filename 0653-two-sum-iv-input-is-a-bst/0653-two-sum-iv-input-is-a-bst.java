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
    public boolean findTarget(TreeNode root, int k) {
        if(root == null)return false;
        ArrayList<TreeNode> list = new ArrayList<>();
        inorder(root, list);
        for(int i = 0; i < list.size()-1; i++){
            for(int j = i + 1; j < list.size(); j++){
                if(list.get(i).val + list.get(j).val == k){
                return true;
                }
            }         
        }
        return false;
    }

    public void inorder(TreeNode root, ArrayList<TreeNode>list){
        if(root == null){
            return;
        }

        inorder(root.left, list);
        list.add(root);
        inorder(root.right,list);
    }
}