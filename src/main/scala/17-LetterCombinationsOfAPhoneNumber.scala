object LetterCombinationsOfAPhoneNumber {
  def letterCombinations(digits: String): List[String] = {
    val digitsMap = Map(
      "2" -> List("a", "b", "c"),
      "3" -> List("d", "e", "f"),
      "4" -> List("g", "h", "i"),
      "5" -> List("j", "k", "l"),
      "6" -> List("m", "n", "o"),
      "7" -> List("p", "q", "r", "s"),
      "8" -> List("t", "u", "v"),
      "9" -> List("w", "x", "y", "z"),
    )
    val list = digits.toList.flatMap {c => digitsMap.get(c.toString)}

    combination(list)
  }

  def combination(list: List[List[String]]): List[String] = {
    val top = list.headOption.getOrElse(Seq.empty)
    val tail = list.drop(1)
    if(top.isEmpty){
      return List()
    }
    val tmpL = combination(tail)
    if (tmpL.isEmpty){
      return top.toList
    }
    top.flatMap {v =>
      tmpL.map(tv => v + tv)
    }.toList
  }
}
