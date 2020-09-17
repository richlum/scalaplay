var target=0;

def fib(x:Int,prev:BigInt=0,next:BigInt=1):BigInt = {
  x match {
    case 0 => prev
    case 1 => {
      println( s"$x $next")
      next
    }
    case _ => {
      println( s"$x $next  $target")
      fib (x-1,next,next+prev)
    }
  }
}

if (args.length>0){
  println(s"args: ${args.length}  ${args.mkString(",")}")
  target = args(0).toInt
  println(s"fib of ${args(0)} is ${fib(args(0).toInt)}")

}
