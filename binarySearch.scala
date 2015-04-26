class BinarySearch{
  def search(elem: Int, a: Array[Int]): Int = {
   def rank(elem: Int, a: Array[Int], imin: Int, imax: Int): Int = {
     val mid = (imax-imin)/2 + imin
     if (imin >= imax) -1
     else if (elem < a(mid)) rank(elem, a, imin, mid-1)
     else if (elem > a(mid)) rank(elem, a, mid+1, imax)
     else mid
   }
   rank(elem, a, 0, a.length) 
 }   
}
