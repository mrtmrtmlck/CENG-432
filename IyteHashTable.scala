class IyteHashTable {
  val size = 1000000;
  var iyteHashTable: Array[String] = new Array[String](size);

  private def HashCodeFunction(Key: String): Int = {
    var hash = 0;
    for (i <- 0 to Key.length() - 1) {
      hash = (31 * hash + Key.charAt(i)) % size.toInt;
      if (hash < 0)
        hash = 0
    }
    return hash
  }

  def set(key: String, value: String): Unit = {
    var hash = HashCodeFunction(key);

    if (iyteHashTable(hash) == null  ) {
      iyteHashTable(hash) = value;
    }
    else
      print("Table already has that key !");
  }

  def get(key: String): String = {
    var hash = HashCodeFunction(key);
      return iyteHashTable(hash);     
  }

}

object IyteHashTable {
  def apply(): IyteHashTable = new IyteHashTable();
}
