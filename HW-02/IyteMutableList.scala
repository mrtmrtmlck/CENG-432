class IyteMutableList {

  var mutableList = new Array[Int](0);

  def add(element: Int): IyteMutableList = {
    val temp = Array(element);
    mutableList = Array.concat(mutableList, temp);
    this;
  }

  override def toString(): String = {
    mutableList.mkString(",");
  }
}

object IyteMutableList {
  def apply(): IyteMutableList = new IyteMutableList();
}
