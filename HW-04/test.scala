object test {
  def main(args: Array[String]) {
     val iyteHashTable = IyteHashTable();
     
     iyteHashTable.set("aaa", "bbb");
     iyteHashTable.set("aab", "bbc");
     iyteHashTable.set("aabbbc", "bbcc");
     iyteHashTable.set("aaaccc", "bbce");
     iyteHashTable.set("aaaccca", "bbc");
     
     print(iyteHashTable.get("aaa")+"\n");
     print(iyteHashTable.get("aab")+"\n");
     print(iyteHashTable.get("aabbbc")+"\n");
     print(iyteHashTable.get("aaaccc")+"\n");
     print(iyteHashTable.get("aaaccca")+"\n");

  }
}
