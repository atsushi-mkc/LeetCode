object Combinations {
  def combine(n: Int, k: Int): List[List[Int]] = {
    combine((1 to n).toList, k)
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
