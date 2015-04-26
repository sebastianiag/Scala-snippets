type Set = Int => Boolean

def contains(s:Set, elem: Int): Boolean = s(elem)

def singletonSet(elem: Int): Set =  {elem2: Int => elem == elem2}

def union(s: Set, t: Set): Set = {elem2: Int => contains(s,elem2) || contains(t,elem2)}

def intersect(s: Set, t:Set): Set = {elem2: Int => contains(s,elem2) && contains(t,elem2)}

def diff(s: Set, t: Set): Set = {elem2: Int => contains(s, elem2) && !contains(t, elem2)}

def filter(s: Set, p: Int => Boolean): Set = {elem2: Int => contains(s, elem2) && p(elem2)}

def forall(s: Set, p: Int => Boolean): Boolean = {
  def iter(a: Int): Boolean = {
    if (a > 1000) true  
    else if (contains(s, a) && !p(a)) false
    else iter(a+1)
  }
  iter(-1000)
}

def exists(s: Set, p: Int => Boolean): Boolean = {
  def iter(a: Int): Boolean = {
    if (a > 1000) false
    else if (contains(s, a) && p(a)) true
    else iter(a+1)
  }
  iter(-1000)
}

def map(s:Set, f: Int => Int): Set = {elem: Int => exists(s, {x: Int => f(x) == elem})} 
