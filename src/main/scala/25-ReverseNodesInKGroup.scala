import leetcode.model.ListNode

object ReverseNodesInKGroup {
  def reverseKGroup(head: ListNode, k: Int): ListNode = {
    if(k < 2){
      return head
    }
    val result = new ListNode()
    var preLast = result
    var top = head
    var temp = head
    var count = 1
    while (temp != null) {
      if (count == k) {
        val nNode = temp.next
        temp.next = null
        val (tNode, lNode) = reverse(top)
        preLast.next = tNode
        preLast = lNode
        temp = nNode
        top = nNode
        count = 1

      } else {
        temp = temp.next
        count = count + 1
      }
    }
    preLast.next = top

    result.next
  }

  def reverse(nodeList: ListNode): (ListNode, ListNode) = {
    val last = new ListNode(nodeList.x)
    var node = last
    var temp = nodeList.next
    while (temp != null){
      val t = new ListNode(temp.x)
      t.next = node
      node = t
      temp = temp.next
    }
    (node, last)
  }
}
