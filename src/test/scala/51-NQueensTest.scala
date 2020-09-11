import org.scalatest.flatspec.AnyFlatSpec

class NQueensTest extends AnyFlatSpec {
  "Test" should "example 1" in {
    val result = NQueens.solveNQueens(4)
    println(result)
    assert(result.length == 2)
  }
}
