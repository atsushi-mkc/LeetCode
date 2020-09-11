object SpiralMatrix {
  def spiralOrder(matrix: Array[Array[Int]]): List[Int] = {
    var result: List[Int] = List()
    if(matrix.length == 0) return result
    val maxY = matrix.length
    val maxX = matrix(0).length
    val num = maxX * maxY
    val screen = Array.ofDim[Boolean](maxY, maxX)
    val offset = Seq((1, 0), (0, 1), (-1, 0), (0, -1))
    var oCount = 0
    var x = 0
    var y = 0
    (0 until num).foreach { _ =>
      result = result :+ matrix(y)(x)
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
    result
  }
}
