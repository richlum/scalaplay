import scala.io.Source

val filename = "readfile.scala"
val bufferedSource = Source.fromFile(filename)
for (line <- bufferedSource.getLines()) {
  println(line)
}
bufferedSource.close


