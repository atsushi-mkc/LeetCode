object RegularExpressionMatching {
  def isMatch(s: String, p: String): Boolean = {
    if (p.isEmpty) {
      return s.isEmpty
    }
    val temp = !s.isEmpty && (s.head == p.head || p.head.toString == ".")
    if (p.length >= 2 && p(1).toString == "*") {
      isMatch(s, p.substring(2)) || (temp && isMatch(s.substring(1),p))
    } else {
      temp && isMatch(s.substring(1), p.substring(1))
    }
  }
}
