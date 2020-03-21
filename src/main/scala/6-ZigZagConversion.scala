object ZigZagConversion {
  def convert(s: String, numRows: Int): String = {
    if (numRows == 1) {
      s
    } else {
      var slist = Seq.fill(numRows)("")
      var index = 0
      var add = 1
      s.foreach { c =>
        slist = slist.updated(index, slist(index) :+ c)
        add = if (index == 0) { 1 } else if (index == numRows -1 ) { -1 } else add
        index += add
      }

      slist.mkString
    }
  }
}
