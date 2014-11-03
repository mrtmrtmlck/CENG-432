object simple {
  def main(args: Array[String]) {
    val simpleList = Array[Int](10, 25, 30);
    simpleList.foreach((number: Int) => {
      if (number % 2 == 0) {
        println(number * 2);
      } else 
        println(number * 3)
    })
  }
}
