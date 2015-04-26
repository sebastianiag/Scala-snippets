import scala.io.Source.fromFile

object Reverse {
  def main(args: Array[String]) {
    val DNA =  fromFile("database3.txt").mkString
    val complement = DNA.map(x => if (x == 'A') 'T'
				  else if (x == 'T') 'A'
			          else if (x == 'G') 'C'
				  else if (x == 'C') 'G'
				  else x ).reverse
    println(complement)
  }
}
