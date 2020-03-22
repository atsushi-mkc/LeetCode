package leetcode.model

class ListNode(var _x: Int = 0) {
  var next: ListNode = null
  var x: Int = _x
}


object ListNode {

  def from(list: Seq[Int]): ListNode = {
    if(list.isEmpty){
      null
    } else {
      val start = new ListNode()
      list.foldLeft(start){(node, v) =>
        node.next = new ListNode(v)
        node.next
      }
      start.next
    }
  }

  def toString(nodeList: ListNode): String = {
    var node = nodeList
    var result = ""
    while (node!= null){
      val arrow = if(result.isEmpty) "" else "->"
      result = result + arrow + node.x.toString
      node = node.next
    }
    result
  }
}