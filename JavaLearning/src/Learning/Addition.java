package Learning;

public class Addition {
	int a=10;
	 static int b=30;
	 int z;
	 
	
	/*
	 * public void add(int c,int d,int x) { int e=c+d; System.out.println(c); }
	 * 
	 * public void sub() { int f=a-b; System.out.println(f); }
	 */
	
	
	public static void main(String[] args) {
		Addition ob=new Addition();
		Addition.b=35;
		
		System.out.println(ob.a);
		ob.a=25;
		System.out.println(ob.a);
		
		
		
	}

}
