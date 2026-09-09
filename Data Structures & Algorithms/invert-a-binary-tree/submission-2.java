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
    public TreeNode invertTree(TreeNode root) {
        return recursiveInvert(root);
    }

    public TreeNode recursiveInvert(TreeNode root) {
        if(root == null) return root;

        TreeNode result = new TreeNode(root.val);

        result.left = recursiveInvert(root.right);
        result.right = recursiveInvert(root.left);
        return result;
    }
}
