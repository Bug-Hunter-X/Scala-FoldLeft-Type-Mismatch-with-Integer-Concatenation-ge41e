```scala
object Main extends App {
  val list = List(1, 2, 3, 4, 5)

  // Incorrect use of foldLeft, trying to concatenate Ints directly
  val result = list.foldLeft("")(_ + _)

  println(result) // Throws a type mismatch error
}
```