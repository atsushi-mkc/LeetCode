import leetcode.model.ListNode

object MergekSortedLists {
  def mergeKLists(lists: Array[ListNode]): ListNode = {
    val result =  new ListNode()
    var temp = result
    var listTmp = lists
    var isLoop = true
    while (isLoop){
      var min = Int.MaxValue
      var index = -1
      listTmp.zipWithIndex.foreach { case (v, i) =>
        val t = if(v != null && v.x < min) {
          (v.x, i)
        } else { (min, index) }
        min = t._1
        index = t._2
      }

      isLoop = min != Int.MaxValue
      if(isLoop){
        temp.next = new ListNode(min)
        temp = temp.next
        val n = listTmp(index)
        listTmp = listTmp.updated(index, n.next)
      }
    }

    result.next
  }
}
