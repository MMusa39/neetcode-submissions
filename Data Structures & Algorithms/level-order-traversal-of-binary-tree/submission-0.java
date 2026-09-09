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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        
        if(root == null) return result;

        result.add(new ArrayList<>(Arrays.asList(root.val)));
        List<List<Integer>> left = levelOrder(root.left);
        List<List<Integer>> right = levelOrder(root.right);
        while(left.size() > 0 && right.size() > 0) {
            List<Integer> toAdd = left.remove(0);
            toAdd.addAll(right.remove(0));
            result.add(toAdd);
        }
        while(left.size() > 0) {
            result.add(left.remove(0));
        }
        while(right.size() > 0) {
            result.add(right.remove(0));
        }
        return result;
    }
}
