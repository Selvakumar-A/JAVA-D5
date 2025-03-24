package Session3;

public class wrapec {
public static void main(String[] args) {
	Integer a = 10; // auto-boxing
//	int i = Integer.valueOf(50);
	System.out.println("***************************************");	
	
	Character c = 'a';
	
	Double d = 1.0000000002;
	
	Float f = 1.2221f;
	
	System.out.println(a);
	System.out.println(c);
	System.out.println(d);
	System.out.println(f);
	
	System.out.println("***************************************");
	// wrapper class to primitive
	
	int v1= a;
	char v2=c;
	double v3=d;
	float v4=f;
	
	System.out.println(v1);
	System.out.println(v2);
	System.out.println(v3);
	System.out.println(v4);
	
	System.out.println("***************************************");
	
	//using utility method
	
	int parseInt = Integer.parseInt("123");
	double parseDouble = Double.parseDouble("23.4567889");
	boolean parseBoolean = Boolean.parseBoolean("true");
	
	System.out.println(parseInt);
	System.out.println(parseDouble);
	System.out.println(parseBoolean);
	
	
	System.out.println("***************************************");
	
	
}
}