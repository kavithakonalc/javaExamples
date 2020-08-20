package IntializingThePackage;

public class AllInputDatas {
	int id;
	String name;
	int studentId;
	String studentName;
	

	void insertRecord(int id, String name) {
		 studentId=id;
		studentName=name;
	}
void display() {
	System.out.println(studentId +" "+ studentName +studentId +" "+ studentName );}

}
