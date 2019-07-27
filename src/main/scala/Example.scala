package joohyung

import doodle.core.Color
import doodle.core.Image.circle
import doodle.syntax._
import doodle.jvm.Java2DFrame._
import doodle.backend.StandardInterpreter._

// To use this example:
//
// 1. run `sbt`
// 2. run the `console` command within `sbt`
// 3. enter `Example.image.draw`
object Example {

  val hi = "Hi!"

}

//(circle(100) fillColor Color.paleGoldenrod lineColor Color.indianRed).draw

object One {
  val a: Int = b - 1
  val b: Int = a + 1

  val answer = a + b
}