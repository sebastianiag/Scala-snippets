def Sum(x: List[Int]): Int = {
    if (x.isEmpty)
       return 0
    else return x.head + Sum(x.tail)
}