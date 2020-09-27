import org.scalatest.flatspec.AnyFlatSpec

class JumpGame2Test extends AnyFlatSpec {
  "Test" should "example 1" in {
    val input = Array(2, 3, 1, 1, 4)
    val result = JumpGame2.jump(input)
    println(result)
    assert(result == 2)
  }

}
