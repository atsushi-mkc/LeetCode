import org.scalatest.flatspec.AnyFlatSpec

class GenerateParenthesesTest extends AnyFlatSpec {
  "Test" should "Example 1" in {
    val result = GenerateParentheses.generateParenthesis(3)
    result.foreach(println(_))
  }
}