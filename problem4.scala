import scala.io.Source.fromFile
import scala.collection.immutable.Map

object GCcontent {
  def main(args: Array[String]) {
      def calculateGC(dna: String): Double = (dna.filter(x => x=='G' || x == 'C').length).toDouble/dna.length*100
      val fasta = fromFile("database4.txt").mkString
      val processed: Array[Array[Strings]] = for(a <- fasta.tail.split(">")) yield a.split("\n")
      val sampleMap: Map[String, String] = (for(a <- processed) yield (a(0), a(1))).toMap
      val (dna, gcPercent) = sampleMap.mapValues(x => calculateGC(x)).max
      println(dna)
      println(gcPercent)
  }
}
