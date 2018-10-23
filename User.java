public class User {

 String name;
 int age;
 int height;
 static int count = 0;

   public User (String name, int age, int height) {
       count++;
       this.name = name;
       this.age = age;
       this.height = height;
   }

   public User(int age, String name, int height) {
       count++;
       this.age = age;
       this.name = name;
       this.height = height;
   }
   public User (int age, int height, String name) {
       count++;
       this.age = age;
       this.height = height;
       this.name = name;
   }


    public static void main(String[] args) {

       User user1 = new User("Paul", 37, 14);
       User user2 = new User(34, "Nick", 15);
       User user3 = new User(25, 34, "Sam");

       System.out.println("NAME  AGE  HEIGHT ");
       System.out.println(user1.name + "  " + user1.age + "   " +user1.height);
       System.out.println(user2.name + "  " + user2.age + "   " +user2.height);
       System.out.println(user3.name + "   " + user3.age + "   " +user3.height);
       System.out.println("---------------------" );
       System.out.println("NUMBER OF USERS: " + count);


    }



}
