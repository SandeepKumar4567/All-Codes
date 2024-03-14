import java.util.Scanner;
public class User {
    public static void main(String[]args){
        
 Scanner scanner=new Scanner(System.in);
System.out.println("Enter your name?");
    String name = scanner.nextLine();
System.out.println(" Hello "+ name);
System.out.println("Enter your age");
    String age = scanner.nextLine();
System.out.println("Enter Nationality");
    String nationality= scanner.nextLine();
System.out.println("Your Name = " + name);
System.out.println("Your Age = " + age);
System.out.println("Your Nationality = " + nationality);
}
}
