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
    fun inorderTraversal(root: TreeNode?): List<Int> {
        val list = ArrayList<Int>()
        inorderTraversal(root, list)
        return list
    }
}

private fun inorderTraversal(node: TreeNode?, list: MutableList<Int>) {
    if (node == null) return
    inorderTraversal(node.left, list)
    list.add(node.`val`)
    inorderTraversal(node.right, list)
}