object Test extends App {

  println("transform:");
  println(RandomStuff.transform(List(1, 2, 3), (x: Int) => x * 2));
  println(RandomStuff.transform(List(2, 8, 16), (x: Int) => x / 2));

  println("\nallValid:");
  println(RandomStuff.allValid(List(1, 2, 3), (x: Int) => x < 100));
  println(RandomStuff.allValid(List(1, 2, 3), (x: Int) => x > 100));

  println("\nexecuteWithRetry:");
  println(RandomStuff.executeWithRetry(12, (13 / 0)));
  println(RandomStuff.executeWithRetry(7, (22 / 5)));

}
