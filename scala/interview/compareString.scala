package interview


import scala.util.Sorting.quickSort
object compareString {


  def main(args: Array[String]): Unit = {
    print(compareStrings("hack","hacker","hackerrank"))

  }

  def compareStrings(firstString : String, secondString : String, thirdString : String) : String ={

    val stringArray = new Array[String](3)
    stringArray(0) = firstString
    stringArray(1) = secondString
    stringArray(2) = thirdString

    quickSort(stringArray)

    stringArray(0) + stringArray(1) + stringArray(2)

  }

}
