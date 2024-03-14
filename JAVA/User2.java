import java.util.Scanner;
public class User2{
public static void main(String[]args){
Scanner ref= new Scanner(System.in);

System.out.println("Enter a student name ?");
 float name = ref.nextFloat();

System.out.println("Enter a student rollno ?");
float rollno = ref.nextFloat();

System.out.println("Gender : Male or Female ?");
float gender = ref.nextFloat();

System.out.println("Enter email ?");
float email = ref.nextFloat();

System.out.println("Enter mobile number ?");
float mobilenumber = ref.nextFloat();

float summ=(name+rollno+gender+email+mobilenumber);
System.out.println(summ);
float avg=(summ/5);
System.out.println(avg*10);
}
}
