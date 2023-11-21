import java.util.Scanner;
public class website{
	public static void main(String[] args) {
		
		try (Scanner scan = new Scanner(System.in)) {
      System.out.println("Enter your age please");
      int age = scan.nextInt();
      
      

      

      	if(age < 18) {
      		System.out.println("You are underage. You are only " + age);
      	} else {
      	
      		System.out.println("You are an adult. You are already " + age + " go get a job!");
      		if (age > 26) {
      			System.out.println("You should already know that!");
      		}
      	}
    }
		}
		
		
	}