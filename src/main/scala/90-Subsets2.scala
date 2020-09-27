class Subsets2 {
  def subsetsWithDup(nums: Array[Int]): List[List[Int]] = {
    val count = nums.length
    if(count == 0) { return List(List.empty) }
    val numList = nums.toList.sorted
    ((1 to count).flatMap{v =>
      combine(numList, v)
    }.toList ++ List(List.empty)).distinct
  }
  
  private def combine(list: List[Int], k: Int): List[List[Int]] = {
    if(k == 1) {
      return list.map(List(_))
    }

    list.zipWithIndex.flatMap { case(v, index) =>
      val buf = combine(list.drop(index + 1), k - 1)
      buf.map(v +: _)
    }
  }
}
