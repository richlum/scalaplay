def flip(list:List[Any]):List[Any] = {
  list match {
    case Nil => Nil 
    case x::xs => flip(xs) ++ List(x)
  }
}

val result = flip ( List(1,2,3,4,5))
println(result)

println(flip(List("a","b","c")))
println(flip("hello".toList).mkString("."))
