import scala.io.Source.fromFile

object MotifDNA {
  def main(args: Array[String]) {
    val infoSet = fromFile(args(0)).mkString.split("\n").toSet
    //args(0) => is the dna string
    //args(1) => is the motif string
    val result = for{
	i <- dna.indices
	if dna.startsWith(motif, i)
	} yield (i+1)
    println(result.mkString(" ")) 
  }
}
