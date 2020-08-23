object RotateImage {
  def rotate(matrix: Array[Array[Int]]): Unit = {
    val iterator = matrix.map(_.iterator)
    for (i <- matrix.indices) {
      matrix(i) = iterator.reverse.map(_.next)
    }
  }
}
