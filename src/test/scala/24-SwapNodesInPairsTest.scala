import leetcode.model.ListNode
import org.scalatest.flatspec.AnyFlatSpec

class SwapNodesInPairsTest extends AnyFlatSpec {
  "Test" should "Example 1" in {
    val input = ListNode.from(Seq(1, 2, 3, 4, 5))

    val result = SwapNodesInPairs.swapPairs(input)
    val ans = ListNode.from(Seq( 2, 1, 4, 3, 5))
    println(ListNode.toString(result))
    assert(ListNode.toString(result) == ListNode.toString(ans))
  }

  "Test" should "Example 2" in {
    val input = ListNode.from(Seq(1, 2, 3, 4))

    val result = SwapNodesInPairs.swapPairs(input)
    val ans = ListNode.from(Seq( 2, 1, 4, 3))
    println(ListNode.toString(result))
    assert(ListNode.toString(result) == ListNode.toString(ans))
  }

}
