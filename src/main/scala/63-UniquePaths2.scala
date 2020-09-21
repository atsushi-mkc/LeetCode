object UniquePaths2 {

  def uniquePathsWithObstacles(obstacleGrid: Array[Array[Int]]): Int = {
    val m = obstacleGrid.length
    val n = obstacleGrid(0).length
    val array = Array.fill(m, n)(1)

    var isEmpty = true
    for(i <- 0 until m) {
      isEmpty = isEmpty && obstacleGrid(i)(0) == 0
      array(i)(0) = if(isEmpty) 1 else 0
    }
    isEmpty = true
    for(j <- 0 until n) {
      isEmpty = isEmpty && obstacleGrid(0)(j) == 0
      array(0)(j) = if(isEmpty) 1 else 0
    }

    for(i <- 1 until  m) {
      for(j <- 1 until n) {
        array(i)(j) = if(obstacleGrid(i)(j) == 1){
          0
        }else {
          array(i -1)(j) + array(i)(j - 1)
        }
      }
    }
    array(m - 1)(n - 1)
  }
}
