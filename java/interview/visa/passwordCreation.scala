package interview.visa

import scala.math.min

object passwordCreation {

  def main(args: Array[String]): Unit = {

    println(newPassword("tushar","nanu"))
    println(newPassword("nanu","tushar"))

  }


  def newPassword(a: String, b: String) : String = {
    val lenA = a.length
    val lenB = b.length
    val pass = new StringBuffer()

    val lenSubStr = min(lenA,lenB)

    for(i <- 0 until lenSubStr){
      pass.append(a.charAt(i)).append(b.charAt(i))
    }

    if((lenA-lenB) > 0){
      pass.append(a.substring(lenSubStr))
    } else if((lenA -lenB) != 0){
      pass.append(b.substring(lenSubStr))
    }

    pass.toString
  }

}
