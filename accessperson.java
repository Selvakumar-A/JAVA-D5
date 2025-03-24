package Session3;

public class accessperson {
	public static void main(String[] args) {
		person obj = new person("lead",20);//original constructor
	
	person obj1 = new person(obj);// object dependency //copied person
	
	System.out.println("original person");
	obj.display();
	
	System.out.println("copied person");
	obj1.display();
	
	
	}
}
