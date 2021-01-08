import leetcode.model.TreeNode

object BinaryTreeInorderTraversal {
  def inorderTraversal(root: TreeNode): List[Int] = {
    if(root == null) {
      return List.empty
    }
    val left = inorderTraversal(root.left)
    val right = inorderTraversal(root.right)
    left ++ List(root.value) ++ right
  }
}
