object Exercises {

}

import java.time.Year

import scala.io.StdIn._

object Exercise1 {
  def main(args: Array[String]): Unit = {
    print("What is your name? ")
    val name = readLine()
    print(s"Hello, $name, nice to meet you!")
  }
}

object Exercise2 {
  def main(args: Array[String]): Unit = {
    print("What is the input string? ")
    val name = readLine()
    print(s"$name has ${name.length} characters.")
  }
}

object Exercise3 {
  def main(args: Array[String]): Unit = {
    print("What is the quote? ")
    val quote = readLine()
    print("Who said it? ")
    val author = readLine()
    println(s"""$author says, "$quote"""")
  }
}

object Exercise4 {
  def main(args: Array[String]): Unit = {
    print("Enter a noun: ")
    val noun = readLine()
    print("Enter a verb: ")
    val verb = readLine()
    print("Enter an adjective: ")
    val adjective = readLine()
    print("Enter an adverb: ")
    val adverb = readLine()
    println(s"Do you $verb your $adjective $noun ${adverb}? That's hilarious!")
  }
}

object Exercise5 {
  def main(args: Array[String]): Unit = {
    print("What is the first Number? ")
    val firstNumber = readInt()
    print("What is the second Number? ")
    val secondNumber = readInt()
    println(s"$firstNumber + $secondNumber = ${firstNumber + secondNumber}")
    println(s"$firstNumber - $secondNumber = ${firstNumber - secondNumber}")
    println(s"$firstNumber * $secondNumber = ${firstNumber * secondNumber}")
    println(s"$firstNumber / $secondNumber = ${firstNumber / secondNumber}")
  }
}

import java.util.Date._

object Exercise6 {
  def main(args: Array[String]): Unit = {
    print("What is your current age? ")
    val currentAge = readInt()
    print("At what age would you like to retire? ")
    val retireAge = readInt()
    println(s"You have ${retireAge - currentAge} years left until you can retire.")
    println(s"It's ${Year.now()}, so you can retire in ${Year.now().getValue + retireAge - currentAge}.")
  }
}

object Exercise7 {
  def main(args: Array[String]): Unit = {
    print("What is the length of the room in feet? ")
    val length = readInt()
    print("What is the width of the room in feet? ")
    val width = readInt()
    println(s"You entered dimensions of ${length} feet by ${width} feet.")
    println("The area is")
    println(s"${length * width} square feet")
    println(s"${length * width * 0.09290304} square meters")
  }
}

object Exercise8 {

}

object Exercise9 {

}

object Exercise10 {
  def main(args: Array[String]): Unit = {
    print("Enter the price of item 1: ")
    val p1 = readDouble()
    print("Enter the quantity of item 1: ")
    val q1 = readInt()
    print("Enter the price of item 2: ")
    val p2 = readDouble()
    print("Enter the quantity of item 2: ")
    val q2 = readInt()
    print("Enter the price of item 3: ")
    val p3 = readDouble()
    print("Enter the quantity of item 3: ")
    val q3 = readInt()
    val subtotal = p1 * q1 + p2 * q2 + p3 * q3
    val tax = subtotal * 0.055
    println(s"Subtotal = $$$subtotal")
    println(s"Tax = $$$tax")
    println(s"Total: $$${subtotal + tax}")
  }
}

object Exercise11 {
  def main(args: Array[String]): Unit = {
    print("How many euros are you exchanging? ")
    val euro = readDouble()
    print("What is the exchange rate? ")
    val rate = readDouble()
    val dollar = (euro * rate / 100)
    println(s"$euro euros at an exchange rate of $rate is")
    println(s"$dollar U.S. dollars.")
  }
}

object Exercise12 {
  def main(args: Array[String]): Unit = {
    print("Enter the principal: ")
    val principal = readDouble()
    print("Enter the rate of interest: ")
    val rate = readDouble()
    print("Enter the number of years: ")
    val year = readInt()
    val investment = principal * (1 + rate / 100 * year)
    println()
    println(s"After $year years at ${rate}%, the investment will")
    println(s"be worth $$${investment}.")
  }
}

import scala.math._

object Exercise13 {
  def main(args: Array[String]): Unit = {
    print("What is the principal amount? ")
    val principal = readDouble()
    print("What is the rate? ")
    val rate = readDouble()
    print("What is the number of years? ")
    val year = readDouble()
    println("What is the number of times the interest")
    print("is compounded per year? ")
    val time = readDouble()
    val expo = pow(1 + ((rate / 100) / time), time * year)
    val result = principal * expo
    println(s"$$${principal} invested at ${rate}% for $year years")
    println(s"compounded $time times per year is ${ceil(result).toInt}.")
  }
}

object Exercise14 {
  
}