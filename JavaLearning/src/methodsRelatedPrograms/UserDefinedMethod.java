package methodsRelatedPrograms;

import java.util.Scanner;

public class UserDefinedMethod {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the input1 :");
		int number1 = scan.nextInt();
		findEvenOdd(number1);
		System.out.println("enter the input2 :");
		int number2 = scan.nextInt();

		findEvenOdd(number2);
	}

	public static void findEvenOdd(int number) {
		if (number % 2 == 0)
			System.out.println("given number is even");
		else
			System.out.println("given numer is odd");
	}
}
