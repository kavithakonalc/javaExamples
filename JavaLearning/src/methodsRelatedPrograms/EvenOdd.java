package methodsRelatedPrograms;

public class EvenOdd {
	public static void findEvenOdd(int num)  
	{  
	//method body  
	if(num%2==0)   
	System.out.println(num+" is even");   
	else   
	System.out.println(num+" is odd");  
	}  
	public static void main(String[] args) {
		
		EvenOdd n1=new EvenOdd();
		n1.findEvenOdd(9);
		EvenOdd.findEvenOdd(8);
	}

}
