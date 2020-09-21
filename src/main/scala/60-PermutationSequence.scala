object PermutationSequence {
  def getPermutation(n: Int, k: Int): String = {
    val number = (1 to n).toList
    val factorial = number.foldLeft((Seq(1l), 1)){(v, n) =>
      val p = v._2 * n
      (v._1 :+ p, p)
    }._1.reverse
    var numBuf = number
    var result = ""
    var kBuf = k - 1
    for(i <- 1 to n) {
      val index = (kBuf / factorial(i)).toInt
      val r = numBuf(index)
      result = result + r.toString
      numBuf = numBuf.filterNot(_ == r)
      kBuf -= (index * factorial(i)).toInt
    }

    result
  }
}
