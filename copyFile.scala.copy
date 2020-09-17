import scala.io.Source
import java.io.PrintWriter



def getLinesAsArray(filename:String):Array[String] = {
  Source.fromFile(filename).getLines().toArray
}

def writeLinesTo(lines:Array[String],outfilename:String):Unit = {
  val writer = new PrintWriter(outfilename)
  for(line <- lines) {
    writer.write(line)
    writer.write('\n')
  }
  writer.close()
}



if (args.length >= 1 ) {
  
  val filename = args(0)
  val outfilename = filename + ".copy"
  println("opening: " + filename)
  val lines = getLinesAsArray(filename)
  printf("%d lines\n", lines.length)

  writeLinesTo(lines,outfilename)
  printf("wrote to %s\n",outfilename)

}
