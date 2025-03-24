package Session3;

public class birdaction extends bird implements flyable{

	@Override
	public void fly() {
		System.out.println("bird fly..");
		
	}
public static void main(String[] args) {
	birdaction b = new birdaction();
	b.eat();
	b.fly();
}
	
	
}
