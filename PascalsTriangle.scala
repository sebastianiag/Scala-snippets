object Pascal{
  def pascal(c : Int, r: Int): Int = (c,r) match{
    case (0,_) => 1
    case (c,r) if c==r => 1
    case _ => pascal(c-1,r-1) + pascal(c, r-1)
  }
}
