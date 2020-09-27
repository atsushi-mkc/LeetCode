object SortColors {
  def sortColors(nums: Array[Int]): Unit = {
    var low = 0
    var middle = 0
    var high = nums.length - 1
    while (middle <= high) {
      nums(middle) match {
        case 0 => {
          val tmp = nums(low)
          nums(low) = nums(middle)
          nums(middle) = tmp
          low += 1
          middle += 1
        }
        case 1 => middle += 1
        case 2 => {
          val tmp = nums(high)
          nums(high) = nums(middle)
          nums(middle) = tmp
          high -= 1
        }
        case _ => {}
      }
    }
  }
}
