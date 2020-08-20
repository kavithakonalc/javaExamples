package Learning;

public class ConstructorChaining {
	int id;
	String collegename;
	String studentname;
	char section;
	
	public ConstructorChaining(int id,String collegename,String studentname){
this.id=id;
this.collegename=collegename;
this.studentname=studentname;
	}
	public ConstructorChaining(int id,String collegename,String studentname,char section) {
		this(id,collegename,studentname);
		this.section=section;
	}
	void display() {
		System.out.println(id+" "+collegename+" "+studentname+" "+section);
	}
	public static void main(String[] args) {
		ConstructorChaining c1=new ConstructorChaining(12,"citech","kavith");
		ConstructorChaining c2=new ConstructorChaining(13,"bbd","savi",'a');
		c1.display();
		c2.display();
		
	}

}
