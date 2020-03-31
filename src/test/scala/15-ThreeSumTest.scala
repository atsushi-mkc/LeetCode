import org.scalatest.flatspec.AnyFlatSpec

class ThreeSumTest extends AnyFlatSpec {
  "Test" should "Example 1" in {
    val result = ThreeSum.threeSum(Array(-1, 0, 1, 2, -1, -4))
    result.foreach(println(_))
  }
  "Test" should "Example 2" in {
    val result = ThreeSum.threeSum(Array(0,0,0))
    result.foreach(println(_))
  }

  "Test" should "Example 3" in {
    val result = ThreeSum.threeSum(Array(1,-1,-1,0))
    result.foreach(println(_))
  }
}