object NQueens {
  def solveNQueens(n: Int): List[List[String]] = {
    solveNQueens(List(), List(), 0, n)
  }

  private def solveNQueens(list: List[List[String]], res: List[String], row: Int, n: Int): List[List[String]] = {
    if(row == n) {
      return list :+ res
    }
    var result = list
    val base = "." * n
    (0 until n).foreach { col =>
      if(isValid(res, row, col, n)){
        val str = base.updated(col, 'Q')
        result = solveNQueens(result, res :+ str, row + 1, n)
      }
    }
    result
  }

  private def isValid(res: List[String], row: Int, col: Int, n: Int): Boolean = {
    (0 until row).foreach { i =>
      if(res(i)(col) == 'Q'){
        return false
      }
      val col1 = col - (row - i)
      if(col1 >= 0 && res(i)(col1) == 'Q'){
        return false
      }
      val col2 = col + (row - i)
      if(col2 < n && res(i)(col2) == 'Q'){
        return false
      }
    }
    true
  }
}
