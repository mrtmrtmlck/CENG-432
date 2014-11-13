object test {
  def main(args: Array[String]) {

    val mutableList = IyteMutableList();
    mutableList.add(1);
    mutableList.add(2);
    mutableList.add(3);
    
    println("Mutable List: " + mutableList.toString());

    val immutableList = IyteImmutableList();
    val list2 = immutableList.add(1);
    val list3 = list2.add(2);
    val list4 = list3.add(3);
    println("\nImmutable List1: " + immutableList.toString());
    println("Immutable List2: " + list2);
    println("Immutable List3: " + list3);
    println("Immutable List4: " + list4);

  }
}
