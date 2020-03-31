import org.scalatest.flatspec.AnyFlatSpec

class LetterCombinationsOfAPhoneNumberTest extends AnyFlatSpec{
  "Test" should "Example 1" in {
    val result = LetterCombinationsOfAPhoneNumber.letterCombinations("23")
    val ans = Seq("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf")
    assert(result == ans)
  }
}
