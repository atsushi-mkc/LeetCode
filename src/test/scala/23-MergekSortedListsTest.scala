import org.scalatest.flatspec.AnyFlatSpec
import leetcode.model.ListNode

class MergekSortedListsTest extends AnyFlatSpec {
  "Test" should "Example 1" in {
    val input = Seq(
      ListNode.from(Seq(1, 4, 5)),
      ListNode.from(Seq(1, 3, 4)),
      ListNode.from(Seq(2, 6))
    )

    val result = MergekSortedLists.mergeKLists(input.toArray)
    val ans = ListNode.from(Seq(1, 1, 2, 3, 4, 4, 5, 6))
    println(ListNode.toString(result) == ListNode.toString(ans))
  }
}
