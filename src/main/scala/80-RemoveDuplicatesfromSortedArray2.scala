object RemoveDuplicatesfromSortedArray2 {
  def removeDuplicates(nums: Array[Int]): Int = {
    if(nums.length < 3) return nums.length
    var result = 2
    (2 until nums.length).foreach { i =>
      if(nums(i) != nums(result - 2)){
        nums(result) = nums(i)
        result += 1
      }
    }
    result
  }
}
