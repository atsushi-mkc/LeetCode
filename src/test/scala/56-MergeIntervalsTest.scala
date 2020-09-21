import org.scalatest.flatspec.AnyFlatSpec

class MergeIntervalsTest extends AnyFlatSpec {
  "Test" should "example 1" in {
    val input = Array(
      Array(1, 3),
      Array(2, 6),
      Array(8, 10),
      Array(18, 15)
    )
    val result = MergeIntervals.merge(input)
    println(result.toList.map(_.toList))
    assert(result.length == 3)
  }

  "Test" should "example 2" in {
    val input = Array(
      Array(1, 4),
      Array(4, 5)
    )
    val result = MergeIntervals.merge(input)
    println(result.toList.map(_.toList))
    assert(result.length == 1)
  }
  "Test" should "example 3" in {
    val input = Array(
      Array(1, 4),
      Array(0, 4)
    )
    val result = MergeIntervals.merge(input)
    println(result.toList.map(_.toList))
    assert(result.length == 1)
  }
  "Test" should "example 4" in {
    val input = Array(
      Array(1, 4),
      Array(0, 0)
    )
    val result = MergeIntervals.merge(input)
    println(result.toList.map(_.toList))
    assert(result.length == 2)
  }
}
