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
    public boolean isValidBST(TreeNode root) {
        int maxLeft = root.val - 1;
        int minRight = root.val + 1;
        if(root.left != null) {
            TreeNode leftHelp = root.left;
            maxLeft = leftHelp.val;
            while(leftHelp.right != null) {
                maxLeft = leftHelp.right.val;
                leftHelp = leftHelp.right;
            }
        }
        if(root.right != null) {
            TreeNode rightHelp = root.right;
            minRight = rightHelp.val;
            while(rightHelp.left != null) {
                minRight = rightHelp.left.val;
                rightHelp = rightHelp.left;
            }
        }

        if(root.right == null && root.left == null) return true;
        if(root.right == null) return maxLeft < root.val && isValidBST(root.left);
        if(root.left == null) return minRight > root.val && isValidBST(root.right);
        return maxLeft < root.val && minRight > root.val && isValidBST(root.left) && isValidBST(root.right);
    }
}
