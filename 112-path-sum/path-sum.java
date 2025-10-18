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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        // Base case: if the tree is empty
        if (root == null) return false;
        
        // If it's a leaf node, check if the path sum equals targetSum
        if (root.left == null && root.right == null)
            return targetSum == root.val;
        
        // Recursive check on left and right subtrees
        int remainingSum = targetSum - root.val;
        return hasPathSum(root.left, remainingSum) || hasPathSum(root.right, remainingSum);
    }
}
