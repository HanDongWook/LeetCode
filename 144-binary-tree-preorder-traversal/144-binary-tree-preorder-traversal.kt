/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class Solution {
    fun preorderTraversal(root: TreeNode?): List<Int> {
        val list = ArrayList<Int>()
        preorder(root, list)
        return list
    }
    fun preorder(node: TreeNode?, list: MutableList<Int>) {
        if (node == null) return
        list.add(node.`val`)
        preorder(node.left, list)
        preorder(node.right, list)
    }
}