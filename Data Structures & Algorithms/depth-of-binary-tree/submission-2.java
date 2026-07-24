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
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        if (root.left == null && root.right == null) {
            return 1;
        }

        int max = 0;
        return maxDepth(root, max);
    }

    private int maxDepth(TreeNode root, int max) {
        if (root == null) {
            return max;
        }

        max = max + 1;
        int left = maxDepth(root.left, max);
        int right = maxDepth(root.right, max);

        if (left > right) {
            return left;
        }
        return right;
        
    }
}
