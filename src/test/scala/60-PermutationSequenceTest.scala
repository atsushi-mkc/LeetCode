import org.scalatest.flatspec.AnyFlatSpec

class PermutationSequenceTest extends AnyFlatSpec {
  "Test" should "example 1" in {
    val result = PermutationSequence.getPermutation(3, 3)
    println(result)
    assert(result == "213")
  }

}
