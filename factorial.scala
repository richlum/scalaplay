def fac(n:Int):Int = {
  if (n<=0) 1
  else n*fac(n-1)
}

if (args.length >=1){
  val result = fac(args(0).toInt)
  println(result)
}
