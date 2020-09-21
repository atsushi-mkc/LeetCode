import org.scalatest.flatspec.AnyFlatSpec

class MinimumPathSumTest extends AnyFlatSpec {
  "Test" should "example 1" in {
    val input = Array(
      Array(1, 3, 1),
      Array(1, 5, 1),
      Array(4, 2, 1)
    )
    val result = MinimumPathSum.minPathSum(input)
    println(result)
    assert(result == 7)
  }

  "Test" should "example 2" in {
    val input = Array(
      Array(1, 2, 5),
      Array(3, 2, 1)
    )
    val result = MinimumPathSum.minPathSum(input)
    println(result)
    assert(result == 6)
  }

}
