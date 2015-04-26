import scala.io.Source.fromFile

object RNATranscribe {
  def main(args: Array[String]) {
    val DNA: String = fromFile("database1.txt").mkString
    val RNA: String = DNA.map(x => if(x == 'T') 'U' else x)
    println(RNA)
  }
}
