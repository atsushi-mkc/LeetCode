import leetcode.model.ListNode
import org.scalatest.flatspec.AnyFlatSpec

class ReverseNodesInKGroupTest extends AnyFlatSpec {
  "Test" should "Example 1" in {
    val input = ListNode.from(Seq(1, 2, 3, 4, 5))

    val result = ReverseNodesInKGroup.reverseKGroup(input, 3)
    val ans = ListNode.from(Seq(3, 2, 1, 4, 5))
    println(ListNode.toString(result))
    assert(ListNode.toString(result) == ListNode.toString(ans))
  }
  it should "Example 2" in {
    val input = ListNode.from(Seq(1, 2, 3, 4, 5))

    val result = ReverseNodesInKGroup.reverseKGroup(input, 2)
    val ans = ListNode.from(Seq(2, 1, 4, 3, 5))
    println(ListNode.toString(result))
    assert(ListNode.toString(result) == ListNode.toString(ans))
  }
}
