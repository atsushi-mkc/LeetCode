object JumpGame2 {
  def jump(nums: Array[Int]): Int = {
    val length = nums.length
    var step = 0
    var nextStep = 0
    var count = 0
    for(i <- 0 until length - 1 ) {
      step = Seq(i + nums(i), step).max
      if(i == nextStep) {
        count += 1
        nextStep = step
      }
    }
    count
  }
}
