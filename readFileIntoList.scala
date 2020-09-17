import scala.io.Source

val filename = "readFileIntoArray.scala"
val lines = Source.fromFile(filename).getLines.toList

print (lines)
