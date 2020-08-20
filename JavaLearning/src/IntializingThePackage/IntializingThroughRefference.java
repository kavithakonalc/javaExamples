package IntializingThePackage;

public class IntializingThroughRefference {
	
	/*
	 * public static void main(String[] args) { // TODO Auto-generated method stub
	 * //Intialize the object through single refference.
	 * IntializingThroughRefference info1=new IntializingThroughRefference();
	 * info1.id=12; info1.name="tommy"; System.out.println(info1.id + " " +
	 * info1.name);
	 */
	// intializing the object through multiple refferences
	public static void main(String[] args) {
		AllInputDatas info1 = new AllInputDatas();
		AllInputDatas info2 = new AllInputDatas();
		info1.id = 21;
		info1.name = "Honey";
		info2.id = 22;
		info2.name = "boney";
		System.out.println(info1.id + " " + info1.name);
		System.out.println(info2.id + " " + info2.name);

	}

}
