object Exercise_20190720 {
  import doodle.core._
  import doodle.core.Image._
  import doodle.syntax._
  import doodle.jvm.Java2DFrame._
  import doodle.backend.StandardInterpreter._

  //Image.rectangle(10,10).draw

  def ascending(n: Int): List[Int]={
    def iter(n: Int, p: Int): List[Int]=
      n match {
        case 0 => Nil
        case n => p :: iter(n-1, p+1)
      }

    iter(n,1)
  }

  ascending(3)

  def fib(input: Int): Int={
    def loop(count: Int, current: Int, next: Int): Int = {
      count match {
        case x if x == input => current
        case x if (x + 1) == input => next
        case x => loop(x + 1, current = next, next = current + next)
      }
    }
    loop(1,1,1)
  }

  fib(10)
  //Fib(n-2)+Fib(n-1)=Fib(n)


  object D20 {

  }



  4L
}
