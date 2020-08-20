package IntializingThePackage;
public class InitializationThroughConstructor {

	int id;
	String studentname;
	char section;

	public InitializationThroughConstructor(int i, String name, char sectionofstu) {
		id = i;
		studentname = name;
		section = sectionofstu;
	}

	void display() {
		System.out.println(id+" " + studentname + " " + section);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InitializationThroughConstructor s1 = new InitializationThroughConstructor(01, "pavitra", 'A');
		InitializationThroughConstructor s2 = new InitializationThroughConstructor(02, "Sudha", 'B');
		s1.display();
		s2.display();
	}

}
