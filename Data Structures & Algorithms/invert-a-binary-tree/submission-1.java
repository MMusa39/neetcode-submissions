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
        if(root == null) {
            return root;
        } else if(root.left == null) {
            root.left = recursiveInvert(root.right);
            root.right = null;
            return root;
        } else if(root.right == null) {
            root.right = recursiveInvert(root.left);
            root.left = null;
            return root;
        }

        TreeNode leftInverted = recursiveInvert(root.left);
        TreeNode rightInverted = recursiveInvert(root.right);
        root.left = rightInverted;
        root.right = leftInverted;
        return root;
    }
}
