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
    fun postorderTraversal(root: TreeNode?): List<Int> {
        val list = ArrayList<Int>()
        postorder(root, list)
        return list
    }
    fun postorder(node: TreeNode?, list: MutableList<Int>) {
        if (node == null) return
        postorder(node.left, list)
        postorder(node.right, list)
        list.add(node.`val`)
    }
}