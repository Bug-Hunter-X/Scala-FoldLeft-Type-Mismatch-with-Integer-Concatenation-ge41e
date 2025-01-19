```scala
object Main extends App {
  val list = List(1, 2, 3, 4, 5)

  // Correct use of foldLeft, converting Ints to Strings
  val result = list.foldLeft("")((acc, i) => acc + i.toString)

  println(result) // Prints "12345"
}
```