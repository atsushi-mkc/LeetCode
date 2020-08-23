import org.scalatest.flatspec.AnyFlatSpec

class RotateImageTest extends AnyFlatSpec{
  "Test" should "example 1" in {
    val input = Array(
      Array(1, 2, 3),
      Array(4, 5, 6),
      Array(7, 8, 9)
    )
    val ans = Array(
      Array(7, 4, 1),
      Array(8, 5, 2),
      Array(9, 6, 3)
    )
    RotateImage.rotate(input)
    println(input.map(_.toList).toList)
    assert(input.map(_.toList).toList.toString == ans.map(_.toList).toList.toString)
  }
}
