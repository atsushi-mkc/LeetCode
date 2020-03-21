class ListNode(var _x: Int = 0) {
  var next: ListNode = null
  var x: Int = _x
}

object AddTwoNumbers {
  def main(args: Array[String]): Unit = {
    val start = new ListNode()
    Seq(1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1).foldLeft(start){(node, v) =>
      node.next = new ListNode(v)
      node.next
    }

    println(getNumber(start.next))

  }
  def addTwoNumbers(l1: ListNode, l2: ListNode): ListNode = {
    addTwoNumbers(l1, l2, 0)
  }

  def addTwoNumbers(l1: ListNode, l2: ListNode, carry: Int): ListNode = {
    if(l1 == null && l2 == null && carry == 0){
      return null
    }
    val (next1,x1) = if(l1 != null){ (l1.next, l1.x)} else (null, 0)
    val (next2, x2) = if(l2 != null) {(l2.next, l2.x)} else (null, 0)
    val x = x1 + x2 + carry
    val c = x / 10
    val r = new ListNode(x % 10)
    r.next = addTwoNumbers(next1, next2, c)
    r
  }

  def getNumber(l: ListNode, i: Int = 0): Long = {
    if (l == null){
      return 0
    }
    val t = Math.pow(10, i.toDouble).toLong
    l.x * t + getNumber(l.next, i + 1)
  }

  def getListNode(v: Long): ListNode = {
    val x = v % 10
    val nextV = v / 10
    val next = if(nextV == 0) { null } else getListNode(nextV)
    val result = new ListNode(x.toInt)
    result.next = next
    result
  }
}
