/**
 * Definition for a binary tree node.
 * class TreeNode {
 *     constructor(val = 0, left = null, right = null) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    /**
     * @param {TreeNode} root
     * @return {boolean}
     */
    balanced = true;

    isBalanced(root) {
        if (root === null) return true;
        this.dfs(root);
        return this.balanced;
    }

    dfs(node) {
        if (node === null) return 0;
        var left = this.dfs(node.left);
        var right = this.dfs(node.right);
        if(Math.abs(left - right) > 1) this.balanced = false;
        return Math.max(left,right) + 1;
    }
}
