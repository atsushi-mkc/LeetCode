import org.scalatest.flatspec.AnyFlatSpec

class SpiralMatrixTest extends AnyFlatSpec {
  "Test" should "example 1" in {
    val input = Array(
      Array(1, 2, 3),
      Array(4, 5, 6),
      Array(7, 8, 9)
    )
    val result = SpiralMatrix.spiralOrder(input)
    println(result)
    assert(result.length == 9)
  }

}
