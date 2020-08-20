
package IntializingThePackage;

public class CreatingTwoObjects {
	int length;
	int width;
	
	/*
	 * void insertValue(int l,int w) { length=l; width=w; }
	 */
	public CreatingTwoObjects(int l,int w) {
		 length=l; 
		 width=w;
	}
	
void AreaOfRectangular() {
	System.out.println(length*width);
}
	public static void main(String[] args) {
		CreatingTwoObjects r1= new CreatingTwoObjects(2, 4),r2=new CreatingTwoObjects(3,3);
		//r1.insertValue(2, 2);
		r1.AreaOfRectangular();
		//r2.insertValue(4, 4);
		r2.AreaOfRectangular();
	}

}
