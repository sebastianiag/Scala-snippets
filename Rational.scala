
class Rational(n: Int, d: Int) {    //the class definition serves also as class constructor
 
  require(d != 0)
  private val g =  gcd(n.abs, d.abs)
  val numer: Int = n/g
  val denom: Int  = d/g

  def this(n: Int) =  this(n,1) //auxiliary constructor
  def + (that: Rational): Rational = new Rational( numer * that.denom + that.numer*denom, denom*that.denom)
  def * (that: Rational): Rational = new Rational(numer* that.numer, denom*that.denom)
  def + (i: Int): Rational = new Rational(numer + i*denom, denom)
  def - (that: Rational): Rational = new Rational(numer*that.denom -  that.numer*denom, denom*that.denom)
  def * (i:Int): Rational = new Rational (numer*i, denom)
  def / (that: Rational): Rational = new Rational(numer*that.denom, denom*that.numer)
  def / (i:Int): Rational = new Rational(numer, denom*i)
  private def gcd(a: Int, b: Int): Int = if (b==0) a else gcd(b, a%b)
  override def toString = n + "/" + d//override the default toString inherited from java.lang.Object
}
