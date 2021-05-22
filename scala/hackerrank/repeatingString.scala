package hackerrank

object repeatingString {

  def main(args: Array[String]): Unit = {

    println(repeatedString("abc", 10))
  }

  def repeatedString(s: String, n: Int) : Int = {

    var str  = s
    var count = 0
    for ( i <- 0 to n) {
      if(str.charAt(i) == 'a')
        count += 1

      if(str.length == 1)
        str = s
      else
        str = str.substring(i+1)
    }
    count
  }
}


