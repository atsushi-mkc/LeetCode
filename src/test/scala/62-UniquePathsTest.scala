import org.scalatest.flatspec.AnyFlatSpec

class UniquePathsTest extends AnyFlatSpec {
  "Test" should "example 1" in {
    val result = UniquePaths.uniquePaths(3, 7)
    println(result)
    assert(result == 28)
  }

}
