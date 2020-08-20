package Learning;

public class CopyConstructor {
	int id;
	String name;

	public CopyConstructor(int i, String n) {
		id = i;
		name = n;
	}

	public CopyConstructor(CopyConstructor obj) {
		id = obj.id;
		name = obj.name;
	}

	void display() {
		System.out.println(id + " " + name);
	}

	public static void main(String[] args) {
		CopyConstructor c1 = new CopyConstructor(02, "chandru");
		CopyConstructor c2 = new CopyConstructor(c1);

		c1.display();
		c2.display();
		c2.id=24;
		c1.display();
		c2.display();
	}

}
