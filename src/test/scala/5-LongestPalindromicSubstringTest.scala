import org.scalatest.flatspec.AnyFlatSpec

class LongestPalindromicSubstringTest extends AnyFlatSpec{
  "Test" should "example 1" in {
    assert(LongestPalindromicSubstring.longestPalindrome("babad") == "bab")
  }
  it should "example 2" in {
    assert(LongestPalindromicSubstring.longestPalindrome("cbbd") == "bb")
  }

  it should "example 3" in {
    assert(LongestPalindromicSubstring.longestPalindrome("a") == "a")
  }
  it should "example 4" in {
    assert(LongestPalindromicSubstring.longestPalindrome("bb") == "bb")
  }
}
