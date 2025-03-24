package Session3;

public class exception {
String str = "hello";

public void name() {
	try{
		int i = Integer.parseInt(str);
		System.out.println("converted string"+str);
	}catch(Exception e) {
		e.printStackTrace();
	}
}
public static void main(String[] args) {
	exception n = new exception();
	
	n.name();
	
}
}
