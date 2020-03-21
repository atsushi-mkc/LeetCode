object LongestPalindromicSubstring {
  def longestPalindrome(s: String): String = {
    var result = s.headOption.map(_.toString).getOrElse("")
    for (i <- 0 to s.length - 1) {
      var tmp = ""
      s.substring(i, s.length).foreach { v =>
        tmp = tmp :+ v
        if (tmp == tmp.reverse && tmp.length > result.length) {
          result = tmp
        }
      }
    }
    result
  }
}
