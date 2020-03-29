import org.scalatest.flatspec.AnyFlatSpec

class TrappingRainWaterTest() extends AnyFlatSpec {
  "Test" should "Example 1" in {
    assert(TrappingRainWater.trap(Array(0,1,0,2,1,0,1,3,2,1,2,1)) == 6)
  }
}
