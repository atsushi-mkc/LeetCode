object MergeIntervals {
  def merge(intervals: Array[Array[Int]]): Array[Array[Int]] = {
    if (intervals.length == 0){
      return intervals
    }

    val arrayBuf = intervals.sortBy(v => v(0))
    var preMin = arrayBuf(0)(0)
    var preMax = arrayBuf(0)(1)
    var result = Array.empty[Array[Int]]
    for(i <- 1 until arrayBuf.length) {
      val min = arrayBuf(i)(0)
      val max = arrayBuf(i)(1)
      if(preMax < min){
        result = result :+ Array(preMin, preMax)
        preMin = min
      }
      preMin = Seq(min, preMin).min
      preMax = Seq(max, preMax).max
    }
    result :+ Array(preMin, preMax)
  }
}
