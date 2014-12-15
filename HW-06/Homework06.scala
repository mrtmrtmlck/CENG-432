case class User(name: String, email: String, grade: Int)
trait UserManagerTrait {
  def add(name: String, email: String, grade: Int): Option[User]
  def getUser(email: String): Option[User]
  def getUserListForGrade(grade: Int): List[User]
  def getCertainGrades(gradeSelector: (Int) => Boolean): List[String]
}
object UserManager extends UserManagerTrait {
  var userSet = Set[User]()

  def add(name: String, email: String, grade: Int): Option[User] = {
    val user = User(name, email, grade)
    if (userSet.exists(u => u.email == email))
      None
    else {
      userSet += user;
      Option(user)
    }
  }
  def getUser(email: String): Option[User] = {
    userSet.find(u => u.email == email)
  }
  def getUserListForGrade(grade: Int): List[User] = {
    userSet.filter(u => u.grade == grade).toList
  }
  def getCertainGrades(gradeSelector: (Int) => Boolean): List[String] = {
    userSet.filter(u => gradeSelector(u.grade)).map(u => u.name).toList
  }
}
