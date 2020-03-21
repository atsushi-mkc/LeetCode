

object Solution {
  def main(args: Array[String]): Unit = {
    val result = twoSum(Array(3,2,4), 6)
    printf(s"result: ${result.mkString(", ")}")
  }

  def twoSum(nums: Array[Int], target: Int): Array[Int] = {
    val numsWithIndex = nums.zipWithIndex
    val r = numsWithIndex.flatMap{ num =>
      numsWithIndex.find(v => (v._1 + num._1) == target && v._2 != num._2).map( v =>
        Array(num._2, v._2)
      )
    }
    r.apply(0)
  }
}