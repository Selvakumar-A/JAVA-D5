package Session3;

public class overloadex {
	public void add(int a, int b) {
		int c = a + b;
		System.out.println("c: " + c);
	}
	public void add(float a, int b) {
		float c = a+b;
		System.out.println("c: "+c);
	}

	public void add(float a, double b) {
		double c = a+b;
		System.out.println("c: "+c);
	}
	
	public static void main(String[] args) {
		overloadex ob = new overloadex();
		
		ob.add(2, 3);
		ob.add(5, 8);
		ob.add(12, 9);
	}
	
}
