object SpiralMatrix2 {
  def generateMatrix(n: Int): Array[Array[Int]] = {
    if(n == 0) return Array()
    val matrix = (1 to n*n).toArray.grouped(n).toArray
    spiralOrder(matrix)
    matrix
  }
  def spiralOrder(matrix: Array[Array[Int]])= {
    val maxY = matrix.length
    val maxX = matrix(0).length
    val num = maxX * maxY
    val screen = Array.ofDim[Boolean](maxY, maxX)
    val offset = Seq((1, 0), (0, 1), (-1, 0), (0, -1))
    var oCount = 0
    var x = 0
    var y = 0
    (1 to num).foreach { i =>
      matrix(y)(x) = i
      screen(y)(x) = true
      val nextX = x + offset(oCount)._1
      val nextY = y + offset(oCount)._2
      if(nextX >= 0 && nextX < maxX && nextY >= 0 && nextY < maxY && !screen(nextY)(nextX)){
        x = nextX
        y = nextY
      } else {
        oCount = (oCount + 1) % 4
        x = x + offset(oCount)._1
        y = y + offset(oCount)._2
      }
    }
  }
}
