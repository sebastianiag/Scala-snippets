import scala.io.Source.fromFile


object NucleotideCounter {
  def main(args: Array[String]) = {
    val nucleotides: String = fromFile("database.txt").mkString
    val adenine: Int = nucleotides.filter(x => x == 'A').length
    val cytosine: Int = nucleotides.filter(x => x == 'C').length
    val guanine: Int = nucleotides.filter(x => x == 'G').length
    val thymine: Int = nucleotides.filter(x => x == 'T').length
    println("A: " + adenine + "\nB: " + cytosine + "\nC: " + guanine + "\nD: " + thymine)
  }
} 
