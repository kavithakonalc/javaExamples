package IntializingThePackage;

public class Calculation {

	void fact(int n) {
		int facto=1;
		for(int i = 1 ; i<=n; i++) 
		{
			facto=facto*i;
			System.out.println(facto);
			
		}
		
			
		}
		public static void main(String[]args) {
			new Calculation().fact(5);
			
		
	}
}
