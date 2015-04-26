import scala.math.floor


abstract class Heap[T]{
  def insert(key: T) //void
  def max():T
  def pop():T
  def isEmpty(): Boolean
  def size(): Int
  def makeHeap(array: Array[T])
  var heapSize: Int
  def parent(node: Int): Int = floor(node/2)
  def left(node: Int): Int =  2*node
  def right(node: Int): Int = 2*node + 1
}


class MaxHeap[T](array: Array[T] = Nil) extends Heap[T]{
  var A: Array[T] = makeHeap(array)
  var heapSize: Int = A.length-1
  def insert(key: T) {
    heapSize += 1
    A = key +: A
    maxHeap(A, 0)
  }

  def max(): T = A(0)
  def pop():T ={
    def popMax(): T = {
      catch{
	val max: T = A(0)
	A(0) = A(heapSize)
	heapSize -=1
	maxHeap(A, 0)
	return max
      }throw ArrayIndexOutOfBoundsException {println("Well... fuck\n")}
    }
    popMax()
  }
  
  def isEmpty(): Boolean =  A.isEmpty
  def size() : Int = heapSize
  def makeHeap(array: Array[T]) {
    for( i <-floor(A.length/2).toInt to 0 by -1) maxHeap(A, i)
  }
  
  private def maxHeap(A: Array[T], node: Int){
    val l: Int = left(node)
    val r: Int = right(node)
    val largest: Int = 0

    if (A(node) < A(l)) largest = l
    else if (A(node) < A(r)) largest = r
    else largest = node
    
    if(largest != node){
      val temp = A(node)
      A(node) = A(largest)
      A(largest) = temp
      maxHeap(A, largest)
    }
  }
}

object Heapsort[T] extends MaxHeap[T]{
  def heapsort(array: Array[T]) {
    var heap = MaxHeap[T](array)
    for(i <- heap.A.length-1 to 1 by -1){
      val temp = heap.A(i)
      heap.A(i) = heap.A(1)
      heap.A(1) = temp
      heap.heapSize -= 1
      maxHeap(A, 1)
    }  
  }
}
