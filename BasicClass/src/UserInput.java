import java.util.Scanner;
public class UserInput {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your favorite dessert: ");	
		String favDessert = input.nextLine();
		System.out.println(favDessert.substring(favDessert.length()-1));
		
		System.out.println("Enter a double: ");
		double inputDouble = input.nextDouble();
		System.out.println(inputDouble);
		
		System.out.println("Enter an integer: ");
		int inputInt = input.nextInt();
		System.out.println(inputInt);
		
		System.out.println("Product: ");
		System.out.println(inputDouble / inputInt);
		
		System.out.println("Integer Product: ");
		System.out.println((int)inputDouble / (int)inputInt);
	}
}