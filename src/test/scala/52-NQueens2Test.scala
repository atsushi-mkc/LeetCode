import org.scalatest.flatspec.AnyFlatSpec

class NQueens2Test extends AnyFlatSpec {
  "Test" should "example 1" in {
    val result = NQueens2.totalNQueens(4)
    println(result)
    assert(result == 2)
  }
}
