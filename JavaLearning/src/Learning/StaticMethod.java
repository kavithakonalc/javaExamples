package Learning;

public class StaticMethod {
 int studentid;
 String studentname;
 static String collegename="Citech";
 
 public static void changeCollegeName(String cname) {
	 collegename=cname;
	 
 }
 public StaticMethod(int studentid, String studentname) {
	this.studentid= studentid;
	this.studentname=studentname;
 }
 public void display() {
	 System.out.println( studentid+" "+studentname+" "+collegename);
 }
	public static void main(String[] args) {
		StaticMethod s1=new StaticMethod(02,"kavitha");
		StaticMethod s2=new StaticMethod(06,"Madhu");
		StaticMethod.changeCollegeName("DBIT");
		s1.display();
		s2.display();

	}

}
