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
    ArrayDeque<Integer> history = new ArrayDeque<>();
    public int kthSmallest(TreeNode root, int k) {
        inorder(root);
        int kthSmallest = -1;
        for (int i = 0; i < k; i++) {
            kthSmallest = history.removeFirst();
        }
        return kthSmallest;
    }

    private void inorder(TreeNode root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        history.addLast(root.val);
        inorder(root.right);
    }
}
