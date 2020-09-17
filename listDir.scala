import java.nio.file._


if (args.length>0){
  val dirname = args(0)
  printf("directory %s\n",dirname) 
  val entries = Files.walk(Paths.get(dirname))
  try {
    entries.forEach(p => println(p))
  }finally{
    entries.close()
  }

}

