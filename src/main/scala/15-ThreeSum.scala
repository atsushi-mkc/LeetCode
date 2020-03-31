object ThreeSum {
  def threeSum(nums: Array[Int]): List[List[Int]] = {
    var result: List[List[Int]] = List.empty
    val sortedNum = nums.sorted
    var i = 0
    var iLoop = i <= (sortedNum.length - 3)
    while (iLoop) {
      val a = sortedNum(i)
      var j = i + 1
      var jLoop = j <= (sortedNum.length - 2)
      while (jLoop) {
        val b = sortedNum(j)
        val ab = a + b
        var k = sortedNum.length - 1
        var kLoop = j < k && (ab <= 0)
        while (kLoop) {
          val c = sortedNum(k)
          if(ab == -c){
            kLoop = false
            result = result :+ List(a, b, c).sorted
          } else {
            k -= 1
            kLoop = j < k && (ab > -c)
          }
        }
        j += 1
        jLoop = ab < 0 && (j <= sortedNum.length - 2)
      }
      result = result.distinct
      i += 1
      iLoop = (a <= 0) && (i < sortedNum.length - 3)
    }

    result.distinct
  }

  def threeSum1(nums: Array[Int]): List[List[Int]] = {
    var abMap: Map[Int, List[List[Int]]] = Map.empty
    val countMap = nums.groupBy(v => v).view.mapValues(_.length).toMap

    for ( i <- 0 to nums.length - 2) {
      val a = nums(i)
      for (j <- (i + 1) to nums.length - 1) {
        val b = nums(j)
        val ab = a + b
        abMap = abMap.get(ab) match {
          case Some(list) => abMap.updated(ab, (list :+ List(a, b).sorted).distinct)
          case None => abMap + (ab -> List(List(a, b).sorted))
        }
      }
    }
    var result: List[List[Int]] = List.empty
    for(i <- 2 to nums.length - 1){
      val c = nums(i)
      abMap.get(-c).foreach {l =>
        l.foreach { v =>
          val iList = (v :+ c).sorted
          val isValid = iList.groupBy(n => n).view.mapValues(_.length).toSeq.foldLeft(true){ case(b, iv) =>
            (countMap.getOrElse(iv._1, 0) >= iv._2) && b
          }
          if(isValid){
            result = (result :+ iList).distinct
          }
        }
      }
    }
    result
  }
}
