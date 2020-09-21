object MinimumPathSum {
  def minPathSum(grid: Array[Array[Int]]): Int = {
    val m = grid.length
    val n = grid(0).length
    val array = Array.fill(m, n)(1)
    array(0)(0) = grid(0)(0)
    for(i <- 1 until m) {
      array(i)(0) = grid(i)(0) + array(i - 1)(0)
    }
    for(j <- 1 until n) {
      array(0)(j) = grid(0)(j) + array(0)(j - 1)
    }
    for(i <- 1 until  m) {
      for (j <- 1 until n) {
        val upValue = array(i - 1)(j)
        val leftValue = array(i)(j - 1)
        array(i)(j) = grid(i)(j) + Set(upValue, leftValue).min
      }
    }
    array(m - 1)(n - 1)
  }
}
