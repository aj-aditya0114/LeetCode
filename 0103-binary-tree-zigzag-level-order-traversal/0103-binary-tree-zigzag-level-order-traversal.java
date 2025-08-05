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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if(root == null)return list;
        boolean leftToRight = true;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int size = q.size();
            LinkedList<Integer> level = new LinkedList<>();
            for(int i = 0; i < size; i++){
                TreeNode curr = q.poll();
                if(leftToRight){
                    level.addLast(curr.val);
                }else{
                    level.addFirst(curr.val);
                }

                if(curr.left != null)q.offer(curr.left);
                if(curr.right != null)q.offer(curr.right);
                
                
            }
            list.add(level);
            leftToRight = !leftToRight;
            
        }
        return list;
    }
}