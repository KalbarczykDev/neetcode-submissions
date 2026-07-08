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
     * @return {number}
     */
    max = 0;

    diameterOfBinaryTree(root) {
        if (root === null) return 0;
        this.dfs(root);
        return this.max;
    }

    dfs(node) {
        if(node === null) return 0;
        var left = this.dfs(node.left);
        var right = this.dfs(node.right);
        var currentPath = left+right;
        this.max = Math.max(currentPath,this.max);
        return Math.max(left,right) + 1;
    }
}
