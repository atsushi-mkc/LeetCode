object ContainerWithMostWater {

  def maxArea(height: Array[Int]): Int = {
    var max = 0
    for(i <- 0 to height.length - 2) {
      val h = height(i)
      for(j <- i + 1 to height.length - 1) {
        val tmp = Math.min(h, height(j)) * (j - i)
        max = Math.max(max, tmp)
      }
    }
    max
  }
}
