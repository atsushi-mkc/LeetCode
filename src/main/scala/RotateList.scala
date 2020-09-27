object RotateList {
  def rotateRight(head: ListNode, k: Int): ListNode = {

    var h = head
    var length = 0
    while (h != null) {
      h = h.next
      length += 1
    }
    if(length == 0) {return head}
    var kTmp = k % length
    if(kTmp == 0) { return head }
    kTmp = length - kTmp
    h = head
    length = 0
    val node = new ListNode(0)
    while (h.next != null) {
      if(length == kTmp - 1){
        node.next = h.next
        h.next = null
        h = node.next
      } else {
        h = h.next
      }
      length += 1
    }
    h.next = head
    node.next
  }
}
