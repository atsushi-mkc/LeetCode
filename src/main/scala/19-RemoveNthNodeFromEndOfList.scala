import leetcode.model.ListNode

object RemoveNthNodeFromEndOfList {
  def removeNthFromEnd(head: ListNode, n: Int): ListNode = {
    var temp = head
    var length = 0
    while (temp != null) {
      length += 1
      temp = temp.next
    }

    var target = length - n
    val dummy = new ListNode()
    temp = dummy
    temp.next = head
    while (target > 0) {
      target -= 1
      temp = temp.next
    }
    temp.next = temp.next.next

    dummy.next
  }
}
