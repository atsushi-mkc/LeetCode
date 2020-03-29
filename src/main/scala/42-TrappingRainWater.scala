object TrappingRainWater {
  def trap(height: Array[Int]): Int = {
    var left = 0
    var right = height.length - 1
    var maxL = 0
    var maxR = 0
    var result = 0
    while (left < right) {
      if(height(left) < height(right)) {
        result = if (height(left) >= maxL) {
          maxL = height(left)
          result
        } else {
          result + (maxL - height(left))
        }
        left += 1
      } else {
        result = if(height(right) >= maxR) {
          maxR = height(right)
          result
        } else {
          result + (maxR - height(right))
        }
        right -= 1
      }
    }
    result
  }
}
