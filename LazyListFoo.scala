object LazyListFoo {

  def main(args: Array[String]): Unit = {
    val start = 600851475143L / 2
    lazy val xs: LazyList[Long] = start #:: xs.map(_ - 2)
    xs.take(5).foreach(println)
  }
}
