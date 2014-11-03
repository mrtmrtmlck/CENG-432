object simple {
  def main(args: Array[String]) {
    val list = Array[Int](10, 25, 30);
    list.foreach((number: Int) => {
      if (number % 2 == 0) {
        println(number*2);
      } else println(number*3)
    })

  }
}
