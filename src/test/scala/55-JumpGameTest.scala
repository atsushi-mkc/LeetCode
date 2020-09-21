import org.scalatest.flatspec.AnyFlatSpec

class JumpGameTest extends AnyFlatSpec {
  "Test" should "example 1" in {
    val input = Array(2, 3, 1, 1, 4)
    val result = JumpGame.canJump(input)
    println(result)
    assert(result)
  }

  "Test" should "example 2" in {
    val input = Array(3, 2, 1, 0, 4)
    val result = JumpGame.canJump(input)
    println(result)
    assert(!result)
  }

}
