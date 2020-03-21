object IntegerToRoman {

  def toRoman(num: Int, v: Int , symbol: String, semV: Int, semSymbol: String): (String, Int) = {
    val value = num / v
    val tmp = if (value > 0) {
      (Seq.fill(value)(symbol).mkString, num % v )
    } else {
      ("", num)
    }

    if (tmp._2 >= semV) {
      (tmp._1 + semSymbol, tmp._2 % semV)
    } else tmp
  }

  def intToRoman(num: Int): String = {
    val mValue = toRoman(num, 1000, "M", 900, "CM")
    val dValue = toRoman(mValue._2, 500, "D", 400, "CD")
    val cValue = toRoman(dValue._2, 100, "C", 90, "XC")
    val lValue = toRoman(cValue._2, 50, "L", 40, "XL")
    val xValue = toRoman(lValue._2, 10, "X", 9, "IX")
    val vValue = toRoman(xValue._2, 5, "V", 4, "IV")
    val iValue = Seq.fill(vValue._2)("I").mkString
    mValue._1 + dValue._1 + cValue._1 + lValue._1 + xValue._1 + vValue._1 + iValue
  }


    /*
    val mValue = num / 1000
    if (mValue > 0){
      return Seq.fill(mValue)("M").mkString + intToRoman(num % 1000)
    }

    if (num >= 900) {
      return "CM" + intToRoman(num % 900)
    }

    val dValue = num / 500
    if (dValue > 0) {
       return  Seq.fill(dValue)("D").mkString +intToRoman(num % 500)
    }

    if (num >= 400) {
      return "CD" + intToRoman(num % 400)
    }

    val cValue = num / 100
    if(cValue > 0) {
      return Seq.fill(cValue)("C").mkString + intToRoman(num % 100)
    }

    if (num >= 90) {
      return "XC" + intToRoman(num % 90)
    }

    val lValue = num / 50
    if (lValue > 0) {
      return  Seq.fill(lValue)("L").mkString + intToRoman(num % 50)
    }

    if (num >= 40) {
      return "XL" + intToRoman(num % 40)
    }

    val xValue = num / 10
    if(xValue > 0) {
      return Seq.fill(xValue)("C").mkString + intToRoman(num % 10)
    }

    if (num == 9) {
      return "IX"
    }

    val vValue = num / 5
    if (vValue > 0) {
      return  Seq.fill(vValue)("V").mkString + intToRoman(num % 5)
    }

    if (num == 4) {
      return "IV"
    }

    Seq.fill(num)("I").mkString

  }
     */
}
