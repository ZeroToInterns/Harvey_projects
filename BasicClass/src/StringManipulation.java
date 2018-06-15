import java.util.Scanner;
public class StringManipulation {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // system.in is input, it captures the variable the input value of the user 
		
		System.out.print("Enter your full name: ");
		
		String userName = input.nextLine();  // regulates the type of variable the user must input 
		
		System.out.println(userName.substring(0, 1)); // system.out is output 
		String[] parts = userName.split(" ");
		System.out.println(parts.toString());
		
		}
}
