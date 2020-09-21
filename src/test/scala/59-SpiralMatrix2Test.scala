import org.scalatest.flatspec.AnyFlatSpec

class SpiralMatrix2Test extends AnyFlatSpec {
  "Test" should "example 1" in {
    val result = SpiralMatrix2.generateMatrix(3)
    println(result.map(_.toList).toList)
    assert(result.length == 3)
  }

}
