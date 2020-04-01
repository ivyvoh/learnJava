import java.util.Scanner;

public class InputProblem{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		int age;
		double income;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("what is your age? ");
		age = keyboard.nextInt();
		//keyboard.nextLine();
		System.out.print("What is your Income? ");
		income = keyboard.nextDouble();
		keyboard.nextLine();
		System.out.print("What is your Name? ");
		name = keyboard.nextLine();
		System.out.println(" Hello, " + name +".  Your age is " + age +" and your income is: " + income);

	}

}
