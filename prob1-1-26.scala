object ThreeSort {
  def main(args: Array[String]){
    var a: Int = args(0).toInt
    var b: Int = args(1).toInt
    var c: Int = args(2).toInt
    var t: Int = 0
    if (a > b) { t = a; a = b; b = t}
    if (a > c) { t = a; a = c; c = t}
    if (b > c) { t = b; b = c; c = t}
    println(a + " " + b + " " + c)
  }
}
