import org.scalatest.flatspec.AnyFlatSpec

class IntegerToRomanTest extends AnyFlatSpec{
  "Test" should "Example 1" in {
    assert(IntegerToRoman.intToRoman(3) == "III")
  }

  it should "Example 2" in {
    assert(IntegerToRoman.intToRoman(4) == "IV")
  }
  it should "Example 3" in {
    assert(IntegerToRoman.intToRoman(9) == "IX")
  }
  it should "Example 4" in {
    assert(IntegerToRoman.intToRoman(58) == "LVIII")
  }

  it should "Example 6" in {
    assert(IntegerToRoman.intToRoman(100) == "C")
  }
  it should "Example 5" in {
    assert(IntegerToRoman.intToRoman(1994) == "MCMXCIV")
  }
}
