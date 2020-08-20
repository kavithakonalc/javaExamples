package IntializingThePackage;

public class IntitializtionThroghMethod {

	public static void main(String[] args) {

		AllInputDatas r1 = new AllInputDatas ();
		AllInputDatas  r2 = new AllInputDatas ();
		r1.insertRecord(01, "nick");
		r2.insertRecord(02, "jhon");
		r1.display();
		r2.display();
	}

}
