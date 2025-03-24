package Session3;

public class calculator {
	public int add(int a , int b) {
		return a+b;
	}
	public int add(int a , int b, int c) {
		return a+b+c;
	}
	
	public static void main(String[] args) {
		calculator obj = new calculator();
		
		System.out.println(obj.add(4, 4));
		System.out.println(obj.add(5, 4, 1)); 
	}
}
