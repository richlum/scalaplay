import scala.sys.process.{ Process, ProcessLogger}
import java.io.PrintWriter

// "myecho.bat".!  // stdout
val result = "myecho.bat".!!  // !! return string output


println("---")
println(result)
val writer = new PrintWriter("osListDir.out")
writer.write(result)
writer.close()

// pipe ("ls -la "  #| "grep xx").!
// redirect  ("ls -la " #> new File("files.txt")".!
// append  ("ls -la " #>> new File("files.txt")".!
// input  ("grep scala " #< new URL("http://google.com/news")).!
//
// context of specfic dirname(arg2), environment variables (3)
// val p = Process(cmd, new File(dirname), ("http_proxy","10.0.88.11"))
// (echo 42" #! p).!
