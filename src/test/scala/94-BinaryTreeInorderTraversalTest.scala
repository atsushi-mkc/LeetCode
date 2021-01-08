import leetcode.model.TreeNode
import org.scalatest.flatspec.AnyFlatSpec

class BinaryTreeInorderTraversalTest extends AnyFlatSpec {
  "Test" should "example 1" in {
    val input = new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null))
    val output = List(1, 3, 2)
    val result = BinaryTreeInorderTraversal.inorderTraversal(input)
    println(result.toString())
    assert(output.equals(result))
  }
}
