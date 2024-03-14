import java.util.Scanner;
public class nestedifstatement {

	public static void main(String[] args) {
		Scanner scann=new Scanner(System.in);
		
		System.out.println("Enter the amount");
		int amount=scann.nextInt();
		scann.nextLine();
		
		System.out.println("Enter the Pin ");
		int pin=scann.nextInt();
		
		if(amount>=10000){      
	        if(pin==4001){    
	            System.out.println("Your ammount is diposed");
	            System.out.println("Thank you visit again ");
	        } else{  
	            System.out.println("Your pin is incorrect");    
	        }  
	    } else{  
	      System.out.println("You dont have a sufficient ammount");  
	    }  
	}
}
/*
 if (condition){
 	if (condition){
  //block of code
 }
 else {
  //block of code
 }
 else{
  //block of code
 }
 */
