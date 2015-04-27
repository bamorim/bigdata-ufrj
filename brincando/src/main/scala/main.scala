object Main {
  def printSome(o: Option[Any]) = o match {
    case None => println("Nothing found")
    case Some(a) => println("Found something: "+a.toString)
  }
  def main(args: Array[String]) = {
    val a:Option[Int] = None
    val b:Option[Int] = Some(1)
    printSome(a)
    printSome(b)
  }
}
