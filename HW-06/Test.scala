object Test extends App {

  println("Successful Add User:")
  println(UserManager.add("mert", "hello@mert.com", 50));
  println(UserManager.add("murat", "murat@murat.com", 100));
  println(UserManager.add("john", "john@john.com", 85));
  println(UserManager.add("jane", "jane@jane.com", 50));

  println("\nFail! Email Already Exists:")
  println(UserManager.add("mehmet", "hello@mert.com", 100));

  println("\nSuccessful Get User by Email:")
  println(UserManager.getUser("murat@murat.com"));
  
  println("\nFail! Email Does Not Exist:")
  println(UserManager.getUser("ali@ali.com"));
  
  println("\nGet User List by Grade:")
  println(UserManager.getUserListForGrade(50));
  
  println("\nGet Users' Names by Grade Condition")
  println(UserManager.getCertainGrades(grade => grade > 50));

}
