object JumpGame {
  def canJump(nums: Array[Int]): Boolean = {
    val length = nums.length
    var step = 0
    var index = 0
    for(i <- 0 until length if i <= step ) {
      step = Seq(i + nums(i), step).max
      index = i
    }
    index == length - 1
  }
}
