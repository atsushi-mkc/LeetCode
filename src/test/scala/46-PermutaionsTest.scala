import org.scalatest.flatspec.AnyFlatSpec

class PermutaionsTest extends AnyFlatSpec{
  "Test" should "example 1" in {
    val result = Permutations.permute(Array(1, 2, 3))
    println(result)
    assert(result.length == 6)
  }
}
