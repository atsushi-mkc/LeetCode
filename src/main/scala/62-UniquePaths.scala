object UniquePaths {
  def uniquePaths(m: Int, n: Int): Int = {
    val array = Array.fill(m, n)(1)
    for(i <- 1 until  m) {
      for(j <- 1 until n) {
        array(i)(j) = array(i -1)(j) + array(i)(j - 1)
      }
    }
    array(m - 1)(n - 1)
  }
}
