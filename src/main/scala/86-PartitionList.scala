import leetcode.model.ListNode

object PartitionList {
  def partition(head: ListNode, x: Int): ListNode = {
    val node1 = new ListNode(0)
    val node2 = new ListNode(0)
    var n1 = node1
    var n2 = node2
    var h = head
    while (h != null) {
      if(h.x < x) {
        n1.next = h
        n1 = n1.next
      } else {
        n2.next = h
        n2 = n2.next
      }
      h = h.next
    }
    n2.next = null
    n1.next = node2.next
    node1.next
  }
}
