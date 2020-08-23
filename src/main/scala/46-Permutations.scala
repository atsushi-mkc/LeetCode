object Permutations {
  def permute(nums: Array[Int]): List[List[Int]] = {
    if(nums.length == 1) return List(nums.toList)
    nums.flatMap(x => permute(nums.filterNot(_ == x)).map(y => x +: y)).toList
  }
}
