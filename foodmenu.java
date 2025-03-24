package Session3;

public class foodmenu implements veg , nonveg{

	@Override
	public void fry() {
		System.out.println("fish");
		
	}

	@Override
	public void gravy() {
		System.out.println("chicken");
		
	}

	@Override
	public void breakfast() {
		System.out.println("tea");
		
	}

	@Override
	public void lunch() {
		System.out.println("meals");
		
	}
	
	public static void main(String[] args) {
	
		
		foodmenu obj = new foodmenu();
		
		obj.breakfast();
		obj.lunch();
		obj.fry();
		obj.gravy();
			
	}	
}
