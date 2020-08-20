package Learning;

public class StudentInfo {
private int roll =21;
private String name ="nick";
	
public int getroll(int roll) {
	return roll;
	
}
public void setroll(int roll) {
	this.roll=roll;
}

public String getname(String name) {
	return name;
}

public void setname(String name) {
	this.name=name;
}
void display() {
	System.out.println("rollnum is:"+ roll);
	System.out.println("rollnum is:"+ name);
}


}

