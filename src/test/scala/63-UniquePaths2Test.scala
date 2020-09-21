import org.scalatest.flatspec.AnyFlatSpec

class UniquePaths2Test extends AnyFlatSpec {
  "Test" should "example 1" in {
    val input = Array(
      Array(0, 0, 0),
      Array(0, 1, 0),
      Array(0, 0, 0)
    )
    val result = UniquePaths2.uniquePathsWithObstacles(input)
    println(result)
    assert(result == 2)
  }

  "Test" should "example 2" in {
    val input = Array(
      Array(0, 1, 0),
      Array(0, 0, 0),
      Array(0, 0, 0)
    )
    val result = UniquePaths2.uniquePathsWithObstacles(input)
    println(result)
    assert(result == 3)
  }

}
