import scala.io.Source

val filename = "readfile.scala"
for (line <- Source.fromFile(filename).getLines) {
  println(line)
}

