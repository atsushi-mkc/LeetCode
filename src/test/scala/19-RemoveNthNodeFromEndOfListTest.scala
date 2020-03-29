import org.scalatest.flatspec.AnyFlatSpec
import leetcode.model.ListNode

class RemoveNthNodeFromEndOfListTest extends AnyFlatSpec {
  "Test" should "Example 1" in {
    val input = ListNode.from(Seq(1, 2, 3, 4, 5))
    val result = RemoveNthNodeFromEndOfList.removeNthFromEnd(input, 2)
    val ans = ListNode.from(Seq(1, 2, 3, 5))
    assert(ListNode.toString(result) == ListNode.toString(ans))
  }

  "Test" should "Example 2" in {
    val input = ListNode.from(Seq(1))
    val result = RemoveNthNodeFromEndOfList.removeNthFromEnd(input, 1)
    assert(ListNode.toString(result) == "")
  }
}
