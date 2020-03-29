import org.scalatest.flatspec.AnyFlatSpec

class RegularExpressionMatchingTest extends AnyFlatSpec {
  "Test" should "Example 1" in {
    assert(!RegularExpressionMatching.isMatch("aa", "a"))
  }

  it should "Example 2" in {
    assert(RegularExpressionMatching.isMatch("aa", "a*"))
  }

  it should "Example 3" in {
    assert(RegularExpressionMatching.isMatch("ab", ".*"))
  }
}
