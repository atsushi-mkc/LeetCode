import org.scalatest.flatspec.AnyFlatSpec

class SortColorsTest extends AnyFlatSpec {
  "Test" should "example 1" in {
    val input = Array(2,0,2,1,1,0)
    val ans = Array(0,0,1,1,2,2)
    SortColors.sortColors(input)
    println(input.toList)
    assert(input sameElements ans)
  }
}
