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
        // List<List<Integer>> list = new ArrayList<>();
        // if(root == null)return list;
        // boolean leftToRight = true;
        // Queue<TreeNode> q = new LinkedList<>();
        // q.offer(root);
        // while(!q.isEmpty()){
        //     int size = q.size();
        //     LinkedList<Integer> level = new LinkedList<>();
        //     for(int i = 0; i < size; i++){
        //         TreeNode curr = q.poll();
        //         if(leftToRight){
        //             level.addLast(curr.val);
        //         }else{
        //             level.addFirst(curr.val);
        //         }

        //         if(curr.left != null)q.offer(curr.left);
        //         if(curr.right != null)q.offer(curr.right);
                
                
        //     }
        //     list.add(level);
        //     leftToRight = !leftToRight;
            
        // }
        // return list;

        List<List<Integer>> ans = new ArrayList<>();
        int level = height(root);

        for(int i = 1; i <= level; i++){
             List<Integer> list = new ArrayList<>();
            if(i % 2 == 0){
                nthLevelRightToLeft(root, i, list);
            }else{
                nthLevelLeftToRight(root, i, list);
            }
            ans.add(list);
        } 
        return ans;
    }

    void nthLevelRightToLeft(TreeNode root, int n, List<Integer> list) {
        if (root == null) return;

        if (n == 1) {
            list.add(root.val);
            return;
        }

        nthLevelRightToLeft(root.right, n - 1, list);
        nthLevelRightToLeft(root.left, n - 1, list);
    }

     void nthLevelLeftToRight(TreeNode root, int n, List<Integer> list) {
        if (root == null) return;

        if (n == 1) {
            list.add(root.val);
            return;
        }

        nthLevelLeftToRight(root.left, n - 1, list);
        nthLevelLeftToRight(root.right, n - 1, list);
    }

     int height(TreeNode root){
         if(root == null)return 0;
         return 1 + Math.max(height(root.left), height(root.right));
     }
}