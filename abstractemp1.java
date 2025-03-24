package Session3;

public class abstractemp1 extends abtstractemp {
	
	public void futuredesign() { // internal override
		System.out.println("protagist"); 
	}

	public static void main(String[] args) {
		abstractemp1 as = new abstractemp1();
		as.name();
		as.design();
		as.futuredesign();
	}

//	@Override
//	public void futuredesign() {
//		// TODO Auto-generated method stub // external override
//		
//	}
}
