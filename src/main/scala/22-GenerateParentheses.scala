object GenerateParentheses {
  def generateParenthesis(n: Int): List[String] = {
    pattern(List.empty, "", 0, 0, n)
  }

  def pattern(list: List[String], s: String,left: Long, right: Long, max: Int): List[String] = {
    if (s.length == max * 2){
      list :+ s
    } else {
      val temp = if(left < max) {
        pattern(list, s + "(", left + 1, right, max)
      } else List.empty
      val temp2 = if (right < left){
        pattern(list, s + ")", left, right + 1, max)
      } else List.empty
      temp ++ temp2
    }
  }
}
