import org.scalatest.flatspec.AnyFlatSpec

class SubsetsTest extends AnyFlatSpec {
  "Test" should "example 1" in {
    val input = Array(1, 2, 3)
    val result = Subsets.subsets(input)
    println(result)
    assert(result.length == 8)
  }
}
