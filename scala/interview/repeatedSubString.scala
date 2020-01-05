package interview

object repeatedSubString {

  def main(args: Array[String]): Unit = {
    print(repeatSubstr("abcab"))

  }


  def repeatSubstr(s:String):Boolean={
    var str=s+s
    var len=str.length()

     str.substring(1,len-1).contains(s)
  }
}
