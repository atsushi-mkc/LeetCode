import org.scalatest.flatspec.AnyFlatSpec

class CombinationsTest extends AnyFlatSpec {
  "Test" should "example 1" in {
    val result = Combinations.combine(4, 2)
    println(result)
    assert(result.length == 6)
  }

  "Test" should "example 2" in {
    val result = Combinations.combine(4, 3)
    println(result)
    assert(result.length == 4)
  }

  "Test" should "example 3" in {
    val result = Combinations.combine(1, 1)
    println(result)
    assert(result.length == 1)
  }
}
