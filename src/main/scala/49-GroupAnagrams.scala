object GroupAnagrams {
  def groupAnagrams(strs: Array[String]): List[List[String]] = {
    strs.foldLeft(Map[String, List[String]]()){(v, s) =>
      val key = s.toSeq.sorted.unwrap
      v.get(key) match {
        case Some(list) => v.updated(key, list :+ s)
        case None => v + (key -> List(s))
      }
    }.values.toList
  }
}
