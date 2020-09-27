import org.scalatest.flatspec.AnyFlatSpec

class RemoveDuplicatesFromSortedArray2Test extends AnyFlatSpec {
  "Test" should "example 1" in {
    val input = Array(1,1,1, 2, 2, 3)
    val result = RemoveDuplicatesfromSortedArray2.removeDuplicates(input)
    println(input.toList)
    assert(result == 5)
  }
}
