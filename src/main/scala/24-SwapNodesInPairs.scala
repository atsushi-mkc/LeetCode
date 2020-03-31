import leetcode.model.ListNode

object SwapNodesInPairs {
  def swapPairs(head: ListNode): ListNode = {
    val result = new ListNode()
    result.next = head
    var temp = result
    while (temp.next!=null){
      val n1 = temp.next
      val n2 = temp.next.next
      if(n2 != null){
        val next = n2.next
        n2.next = n1
        n1.next = next
        temp.next = n2
      }
      temp = n1
    }

    result.next
  }
}
