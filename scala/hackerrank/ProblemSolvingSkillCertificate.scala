package hackerrank

object ProblemSolvingSkillCertificate {

  def main(args: Array[String]): Unit = {

    println(minTime(Array(5,3,1),5,5))

  }

  def minTime(files: Array[Int], numCores: Int, limit: Int): Long = {
    var runTime : Long = 0

    for (i <- files) {

      if(i % numCores == 0) {
        runTime += i/numCores
      }
      else
        runTime += i

    }
    runTime
  }

}
