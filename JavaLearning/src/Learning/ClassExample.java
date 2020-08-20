package Learning;

public class ClassExample {
	String breed;
	String colour;
	int age;
	
	public ClassExample(String string, String string2, int int1 ) {
	
	}
void breedInfo() {
System.out.println("the dog breedInfo is"+breed);
 }
void couorInfo(){
	System.out.println("the dog colour info is "+colour);
	
}
void ageInfo() {
	System.out.println("the dog age info is "+age);
	
}
public static void main(String[] args) {
	//creating an object
	ClassExample info1=new ClassExample("joohi", "black", 25);
	info1.breedInfo();
	info1.couorInfo();
	info1.ageInfo();
	
	
}
}
