class Matrix(row: Double, columns: Double) {
  def dot(x: Array[Double], y: Array[Double]): Double
  def mult(x: Matrix, y: Matrix): Matrix
  def transpose(a: Matrix): Matrix
  def mult(x: Matrix, y: Array[Double]): Array[Double]
  def mult(x: Array[Double], y: Matrix): Array[Double]
}
