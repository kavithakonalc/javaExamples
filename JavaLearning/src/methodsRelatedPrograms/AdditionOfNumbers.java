package methodsRelatedPrograms;

public class AdditionOfNumbers {

	public static int sum(int a, int b) {
		int c = a + b;
		return c+1;
	}

	public static void main(String[] args) {
		/*
		 * int i=new AdditionOfNumbers().sum(22, 2); System.out.println(i);
		 */
		int result=sum(22,2);
		System.out.println(result);
	}

}
